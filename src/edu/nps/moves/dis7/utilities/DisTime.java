/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.utilities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;

/**
 * <p>This common shared class provides static code for timestamp configuration and conversion utilities,
 * consistently supporting all active open-dis7-java simulations running together on a localhost. 
 * Multiple timestamp configurations are available, but dissimilar forms within a single simulation
 * are considered counterproductive and impractical to manage coherently.</p>
 *
 * <p>DIS time units are a pain to work with. As specified by the IEEE DIS Protocol specification, 
 * DIS time units are defined in a custom manner and set
 * equal to 2^31 - 1 time units per hour. The DIS time is set to the number of time
 * units since the start of the hour. Rollover problems can easily occur.  The timestamp field in the PDU header is
 * four bytes long and is specified to be an unsigned integer value.</p>
 *
 * <p>Multiple timestamp styles and settings are available.</p>
 *
 * <p><i>Absolute time</i> and <i>Relative time</i> are two variations for the 
 * official timestamp value  in the PDU header. 
 * Absolute time indicates that the localhost is synchronized to 
 * <a href="https://en.wikipedia.org/wiki/Coordinated_Universal_Time" target="_blank">Coordinated Universal Time (UTC)</a>, 
 * typically meaning that the local computer system is accurately synchronized with UTC via
 * <a href="https://en.wikipedia.org/wiki/Network_Time_Protocol" target="_blank">Network Time Protocol (NTP)</a>.
 * Synchronization might also be achieved when a computer has a highly accurate reference clock (such as GPS).
 * The packet timestamps originating from such hosts can be legitimately
 * compared to the timestamp of packets received from other hosts, since they all are
 * referenced to the same universal time.  
 * Relative timestamps may require further processing in order to achieve synchronization</p>
 *
 * <p><b>Absolute timestamps</b> have their least significant bit (LSB) set to 1, and relative timestamps have their
 * LSB set to 0. The idea in the DIS specification is to get the current time since the top of the hour,
 * divide by 2^31-1, shift left one bit, then set the LSB to either 0 for relative
 * timestamps or 1 for absolute timestamps.</p>
 *
 * <p><b>Relative timestamps</b> are indicated when the host does NOT have access to NTP, and hence
 * the system time might not be coordinated with that of other hosts. This means that
 * a host receiving DIS packets from several hosts might have to set up a per-host
 * table to correlate baseline time references before ordering packets, and that 
 * the PDU timestamp fields from one host is not
 * directly comparable to the PDU timestamp field from another host.
 * (TODO: such support for correlating unsynchronized clocks is not yet implemented by this library.)</p>
 *
 * <p>Another difficulty with the DIS standard has serious effects.
 * The nature of shared DIS data is such that the timestamp values <i>roll over</i> once an
 * hour, and simulations must be prepared for that eventuality. In other words, at the top of the hour
 * outgoing PDUs will have a timestamp of 1, then just before the end of the hour the
 * PDUs will have a timestamp of 2^31 - 1, and then they will roll back over to a value of 1.
 * Receiving applications should expect this behavior, and not simply expect a
 * monotonically increasing timestamp field.
 * Two nonstandard timestamp alternatives follow.</p>
 *
 * <p><b>Unix time</b>. Note that many applications in the wild have been known to completely ignore
 * the DIS standard and to simply put commonly used 
 * <a href="https://en.wikipedia.org/wiki/Unix_time" target="_blank">Unix time</a> (seconds since 1 January 1970)
 * into the timestamp field. </p>
 *
 * <p><b>Year time</b>.  The rollover associated with official DIS timestamps don't work all that well in numerous applications,
 * which often expect a monotonically increasing timestamp field.   Such unpredictable rollover variations are also incompatible
 * with archival recording or streaming playback of 
 * <a href="https://en.wikipedia.org/wiki/Live,_virtual,_and_constructive" target="_blank">Live-Virtual-Constructive (LVC)</a> behavior streams.
 * To avoid such problems, NPS created a "yearly" timestamp which measures 
 * hundredths of a second since the start of the current year. The maximum value for
 * such measurements is 3,153,600,000, which can fit into an unsigned int. 
 * One hundredth of a second resolution is accurate enough for most applications, and you typically don't have to worry about
 * rollover, instead getting only a monotonically increasing timestamp value.</p>
 *
 * <p>
 * TODO we are currently investigating whether <code>IEEE_ABSOLUTE</code> together with 
 * <code>epochLvc</code> normalization of time reference is sufficient for LVC simulation.
 * Further work is upgrading DisTime support to use the <code>java.time</code> library.
 * Of note is that DISv8 intends to use a 64-bit timestamp. 
 * </p>
 *
 * <p><b>TODO: timestamp normalization to an initial reference time.</b>
 * Functionality is needed to define a shared common time origin (epochLvc) and also to
 * precisely adjust stream timestamps when coordinating recorded PDU playback within LVC applications.
 * We think the ability to "start at time 0.0", or normalizing initial time to zero 
 * for a recorded PDU stream, is actually a pretty common use case.  
 * Implementing such a capability is under active development.</p>
 *
 * <p><b>TODO: upgrade to <code>java.time</code> package.</b> See
 * <a href="https://docs.oracle.com/javase/tutorial/datetime/index.html" target="_blank">Java Tutorials: Date Time</a>
 * and
 * <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/package-summary.html" target="_blank">Java Package java.time</a>. </p>
 * 
 * <p> Don McGregor, Mike Bailey, and Don Brutzman</p>
 * 
 * @author DMcG
 */
// * problems unlikely:
// * <p><b>TODO: confirm thread safe</b>. Be careful with the shared instance of this class --
// * it has static synchronized methods but is not yet
// * confirmed to be thread safe. If you are using multiple threads, suggest you
// * create a new instance of the class for each thread to prevent the values from
// * getting stomped on.</p>

public class DisTime
{
    private       static Method  getTimeMethod;           // needed for reflection
    private final static DisTime disTime = new DisTime(); // needed for reflection
  
    /** Supported timestamp styles and utility methods.
     * @see edu.nps.moves.dis7.utilities.PduFactory
     */
    public enum TimestampStyle {
        /** Clock ticks since top of hour, host synchronized to UTC via Network Time Protocol (NTP) */
        IEEE_ABSOLUTE, 
        /** Clock ticks since top of hour, host not synchronized to UTC via Network Time Protocol (NTP) */
        IEEE_RELATIVE, 
        /** Unix time (seconds since 1 January 1970) */
        UNIX,
        /** hundreds of a second since the start of the year */
        @Deprecated
        YEAR
    };
    
    /** Whether host computer clock is accurately synchronized with UTC to a time standard, for example by using 
     * <a href="https://en.wikipedia.org/wiki/Network_Time_Protocol" target="_blank">Network Time Protocol (NTP)</a>.
     */
    private static boolean hostClockSynchronized = true;
    
    /** Whether to apply epochLvc as baseline starting time for DIS timestamps, enabling time normalization of LVC streams.
     * Distinct from Unix timestamp EPOCH.
     * <a href="https://en.wikipedia.org/wiki/Epoch_(computing)" target="_blank">https://en.wikipedia.org/wiki/Epoch_(computing)</a>.
     */
    private static boolean     applyEpochLvc     = false;
    
    /** Reference starting time for current DIS timestamps, enabling time normalization of LVC streams.
     * Distinct from Unix timestamp EPOCH.
     * <a href="https://en.wikipedia.org/wiki/Epoch_(computing)" target="_blank">https://en.wikipedia.org/wiki/Epoch_(computing)</a>.
     */
    private static Instant     epochLvc        = Instant.now(); // initialized at start
    
    /** We can marshal the PDU with a timestamp set to any of several styles. 
     * Remember, you MUST set a timestamp. DIS will regard multiple packets sent 
     * with the same timestamp as duplicates and may discard them.
     * Default value is TimestampStyle.IEEE_ABSOLUTE.
     */
    private static TimestampStyle timestampStyle = TimestampStyle.IEEE_ABSOLUTE;
  
    /** mask for absolute timestamps */
    public static final int ABSOLUTE_TIMESTAMP_MASK = 0x00000001;
    
    /** mask for relative timestamps */
    public static final int RELATIVE_TIMESTAMP_MASK = 0xfffffffe;
    
    /** calendar instance */
    private static GregorianCalendar calendar;
//    private LocalDateTime todayDateTime = new LocalDateTime();
//    private Instant       todayInstant  = new Instant();
    
    private static String dateFormatPattern = "yyyy-mm-dd";
    private static String timeFormatPattern = "HH:mm:ss";

   // public static DisTime disTime = null;

    /**
     * Shared instance. This method is not thread-safe. If you are working in multiple threads,
     * create a new instance for each thread.
     * return singleton instance of DisTime
     */
   /* public static DisTime createInstance()
    {
        if (disTime == null) {
            disTime = new DisTime();
        }
        return disTime;
    }
    */
    
    public DisTime()
    {
        calendar = new GregorianCalendar();
    }

    /**
     * For current system time, returns the number of DIS time units since the top of the hour, or else
     * number of DIS time units since previously set epochLvc timestamp (for time-zero-based streams).
     * Note that there are 2^31-1 DIS time units per hour.
     * @return integer DIS time units since the start of the hour.
     */
    private static synchronized int getCurrentDisTimeUnitsSinceTopOfHour()
    {
        // set calendar object to current time
        long currentTime = System.currentTimeMillis(); // UTC milliseconds since 1970
        calendar.setTimeInMillis(currentTime);

        // Set calendar to top of the hour, then compute what the calendar object says was milliseconds since 1970
        // at the top of the hour
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long topOfHourMsec = calendar.getTimeInMillis();

        // Milliseconds since the top of the hour
        long timeDifferenceMsec; // originally diff = currentTime - topOfHour;

        // It turns out that Integer.MAX_VALUE is 2^31-1, which is the time unit value, ie there are
        // 2^31-1 DIS time units in an hour. 3600 sec/hr X 1000 msec/sec divided into the number of
        // msec since the start of the hour gives the percentage of DIS time units in the hour, times
        // the number of DIS time units per hour, equals the time value
        double differenceValue;
        int    differenceTimestamp;
        
        if  (!hasEpochLvc())
        {
            timeDifferenceMsec = currentTime - topOfHourMsec;
        }
        else // normalized time reference having 00:00 at start
        {
            Duration d = java.time.Duration.between(epochLvc, Instant.now());
            timeDifferenceMsec = d.toMillis();
        }
        differenceValue     = (timeDifferenceMsec / (3600.0 * 1000.0)) * Integer.MAX_VALUE;
        differenceTimestamp = (int) differenceValue;
        return differenceTimestamp;
    }
    /**
     * Recommended form, checks local system clock and returns the current DIS standard relative timestamp based on current timestampStyle.
     * @see <a href="https://en.wikipedia.org/wiki/Network_Time_Protocol" target="_blank">Wikipedia: Network Time Protocol (NTP)</a>
     * @return DIS time units, relative
     */
    public static int getCurrentDisTimestamp()
    {
        switch (timestampStyle)
        {
            case IEEE_ABSOLUTE:
                return getCurrentDisAbsoluteTimestamp();

            case IEEE_RELATIVE:
                return getCurrentDisRelativeTimestamp();
            case UNIX:
                return getCurrentUnixTimestamp();

            case YEAR: // formerly NPS:
                return getCurrentYearTimestamp();

            default:
                return getCurrentDisAbsoluteTimestamp(); // superfluous
        }
    }


    /**
     * Checks local system clock and returns the current DIS standard absolute timestamp, assuming that this host is synchronized to NTP.
     * // Fix to bitshift by mvormelch.
     * @see <a href="https://en.wikipedia.org/wiki/Network_Time_Protocol" target="_blank">Wikipedia: Network Time Protocol (NTP)</a>
     * @return DIS time units, get absolute timestamp
     */
    public static synchronized int getCurrentDisAbsoluteTimestamp()
    {
        int value = getCurrentDisTimeUnitsSinceTopOfHour();
        value = (value << 1) | ABSOLUTE_TIMESTAMP_MASK; // always flip the lsb to 1
        return value;
    }

    /**
     * Checks local system clock and returns the current DIS standard relative timestamp, 
     * which should be used if this host is not synchronized to UTC.
     * // Fix to bitshift by mvormelch
     * @see <a href="https://en.wikipedia.org/wiki/Network_Time_Protocol" target="_blank">Wikipedia: Network Time Protocol (NTP)</a>
     * @return DIS time units, relative
     */
    public static int getCurrentDisRelativeTimestamp()
    {
        int value = getCurrentDisTimeUnitsSinceTopOfHour();
        value = (value << 1) & RELATIVE_TIMESTAMP_MASK; // always flip the lsb to 0
        return value;
    }

    /**
     * Checks local system clock and returns a useful timestamp, hundredths of a second since the start of the year.
     * This effectively eliminates the need for receivers to handle timestamp rollover,
     * as long as you're not working late on New Year's Eve.
     * (Previously referred to as NPS timestamp.)
     * TODO consider renaming as Annual timestamp.
     * TODO consult with DIS working group about timestamp disambiguation.
     * @return a timestamp in hundredths of a second since the start of the year
     */
    public static synchronized int getCurrentYearTimestamp()
    {
        // set calendar object to current time
        long currentTime = System.currentTimeMillis(); // UTC milliseconds since 1970
        calendar.setTimeInMillis(currentTime);

        // Set calendar to the start of the year
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long startOfYear = calendar.getTimeInMillis();

        // Milliseconds since the top of the hour
        long diff = currentTime - startOfYear;
        diff /= 10; // milliseconds to hundredths of a second

        return (int) diff;
    }

    /**
     * Checks local system clock and returns a useful timestamp as local Unix time.
     * Another option for marshalling with the timestamp field set automatically. The UNIX
     * time is conventionally seconds since January 1, 1970. UTC time is used, and leap seconds
     * are excluded. This approach is popular in the wild, but the time resolution is not very
     * good for high frequency updates, such as aircraft. An entity updating at 30 PDUs/second
     * would see 30 PDUs sent out with the same timestamp, and have 29 of them discarded as
     * duplicate packets.
     *
     * Note that there are other "Unix times", such milliseconds since 1/1/1970, saved in a long.
     * This cannot be used, since the value is saved in a long. Java's System.getCurrentTimeMillis()
     * uses this value.
     *
     * Unix time (in seconds) rolls over in 2038. 
     *
     * Consult the Wikipedia page on <a href="https://en.wikipedia.org/wiki/Unix_time" target="_blank">Unix time</a> for the gory details
     * @return seconds since 1970
     */
    public static synchronized int getCurrentUnixTimestamp()
    {
        long t = System.currentTimeMillis();
        t /= 1000l;   // NB: integer division used to convert milliseconds to seconds
        return (int) t;
    }
    
    /**
     * Convert timestamp value to string for logging and diagnostics,
     * taking into account epochLvc and TimeStampStyle (DIS absolute/relative, Unix or Year).
     * TODO consider different formats for different timestampStyle values.
     * @param timestamp value in milliseconds
     * @see GregorianCalendar
     * @see DisTime.TimeStampStyle
     * @return string value provided by GregorianCalendar
     */
    public static String convertToString(int timestamp)
    {
        GregorianCalendar newCalendar = new GregorianCalendar();
        DateFormat formatter = new SimpleDateFormat(dateFormatPattern + " " + timeFormatPattern);
        
        if      ((timestampStyle == TimestampStyle.IEEE_ABSOLUTE) || 
                 (timestampStyle == TimestampStyle.IEEE_RELATIVE))
        {
            // if epochLvc is not set, this is regular DIS value
            newCalendar.setTimeInMillis(timestamp); //  - epochLvc
            return formatter.format(newCalendar.getTime());
        }
        else if (timestampStyle == TimestampStyle.UNIX) // TODO
        {
            newCalendar.setTimeInMillis(timestamp);
            return formatter.format(newCalendar.getTime());
        }
        else // (timestampStyle == TimestampStyle.YEAR) // TODO
        {
            newCalendar.setTimeInMillis(timestamp);
            return formatter.format(newCalendar.getTime());
        }
    }

    // TODO is reflection really necessary? simpler is better
    private static void initializeTimestampMethod()
    {
        try {
            switch (timestampStyle)
            {
                case IEEE_ABSOLUTE:
                    getTimeMethod = DisTime.class.getDeclaredMethod("getCurrentDisAbsoluteTimestamp", new Class<?>[0]);
                    break;

                case IEEE_RELATIVE:
                    getTimeMethod = DisTime.class.getDeclaredMethod("getCurrentDisRelativeTimestamp", new Class<?>[0]);
                    break;

                case UNIX:
                    getTimeMethod = DisTime.class.getDeclaredMethod("getCurrentUnixTimestamp", new Class<?>[0]);
                    break;

                case YEAR: // formerly NPS:
                    getTimeMethod = DisTime.class.getDeclaredMethod("getCurrentYearTimestamp", new Class<?>[0]);
                    break;

                default:
                    getTimeMethod = DisTime.class.getDeclaredMethod("getCurrentDisAbsoluteTimestamp", new Class<?>[0]);
                    break;
            }
        } catch (NoSuchMethodException ex) {
            throw new RuntimeException(ex);
        }
    }

  /** Retrieve the current timestamp in the time stamp style set at factory 
   * instantiation.
   * @return the current timestamp in the time stamp style set at factory 
   * instantiation
   */
  public static int getTimestamp()
  {
    try {
        if (getTimeMethod == null)
            initializeTimestampMethod(); // avoid NPE
        return (int) getTimeMethod.invoke(disTime, (Object[]) null);
    }
    catch (IllegalAccessException | InvocationTargetException ex) {
      throw new RuntimeException(ex);
    }
  }
  
    /** Set one of four time references as timestampStyle: IEEE_ABSOLUTE, IEEE_RELATIVE, UNIX, or YEAR.
     * @param newtTimestampStyle the timestamp style to set for this PDU
     */
    public static void setTimestampStyle(TimestampStyle newtTimestampStyle)
    {
        timestampStyle = newtTimestampStyle;
        initializeTimestampMethod();
    }
    /** Retrieve the current timestampStyle.
     * @return the current timestampStyle
     */
    public static TimestampStyle getTimestampStyle()
    {
      return timestampStyle;
    }
    
    /** Declare whether host computer clock is accurately synchronized with UTC to a time standard
     * @param newhostClockSynchronized whether localhost is synchronized to time reference
     */
    public static void setHostClockSynchronized(boolean newhostClockSynchronized)
    {
        hostClockSynchronized = newhostClockSynchronized;
    }
    /**  Determine whether host computer clock is accurately synchronized with UTC to a time standard
     * @return whether localhost is synchronized to time reference
     */
    public static boolean isHostClockSynchronized()
    {
      return hostClockSynchronized;
    }
    
    /** Reset epochLvc using current time for zero-based clock, meaning timestamps are normalized to "time zero" of simulation
     * as initial starting time
     */
    public static void setEpochLvcNow()
    {
        applyEpochLvc = true;
        setEpochLvc(Instant.now()); // getCurrentDisAbsoluteTimestamp());
    }
    
    /** Set Instant value as epochLvc for zero-based clock, meaning timestamps normalized to 0 at that initial starting time
     * @param newEpochLvc Instant corresponding to first PDU in series, considered time zero
     */
    public static void setEpochLvc(java.time.Instant newEpochLvc)
    {
        applyEpochLvc = true;
        epochLvc = newEpochLvc;
    }
    /**  Get initial timestamp for zero-based clock, meaning all timestamps are measured with respect to given starting time
     * @return whether localhost is synchronized to time reference
     */
    public static java.time.Instant getEpochLvc()
    {
      return epochLvc;
    }
    /** Whether epochLvc is currently applied
     * @return whether epochLvc is active
     */
    public static boolean hasEpochLvc()
    {
      return applyEpochLvc;
    }
    
    /** Reset epochLvc so it is no longer active
     */
    public static void clearEpochLvc()
    {
        applyEpochLvc     = false;
    }

    private void sleep(long ms) {
        sleep(ms, 0);
    }
    
    private void sleep(long ms, int ns) 
    {
        try {
            Thread.sleep(ms, ns);
        } 
        catch (InterruptedException ex) {}
    }
    /** Self-test for basic smoke testing */
    private void selfTest()
    {        
        DisTime.initializeTimestampMethod();
        System.out.println("=== legacy java.util.Date, calendar methods ===");
        System.out.println("DisTime.getTimestampStyle()                    = " + DisTime.getTimestampStyle());
        System.out.println("patterns                                       = " + dateFormatPattern + " " + timeFormatPattern);
        int initialTimestamp = DisTime.getTimestamp();
        System.out.println("DisTime.getTimestamp() initialTimestamp        = " + convertToString(initialTimestamp)                               + " = " + Integer.toUnsignedString(initialTimestamp)       + " = " + initialTimestamp      + " (unsigned vs signed output)");
        System.out.println("DisTime.getTimestamp()                         = " + convertToString(DisTime.getTimestamp())                         + " = " + Integer.toUnsignedString(DisTime.getTimestamp()) + " = " + DisTime.getTimestamp()+ " (unsigned vs signed output)");
        System.out.println("DisTime.getCurrentDisAbsoluteTimestamp()       = " + convertToString(DisTime.getCurrentDisAbsoluteTimestamp())       + " = " + Integer.toUnsignedString(DisTime.getCurrentDisAbsoluteTimestamp()));
        System.out.println("DisTime.getCurrentDisRelativeTimestamp()       = " + convertToString(DisTime.getCurrentDisRelativeTimestamp())       + " = " + Integer.toUnsignedString(DisTime.getCurrentDisRelativeTimestamp()));
        System.out.println("DisTime.getCurrentDisTimeUnitsSinceTopOfHour() = " + convertToString(DisTime.getCurrentDisTimeUnitsSinceTopOfHour()) + " = " + DisTime.getCurrentDisTimeUnitsSinceTopOfHour());
    
        System.out.println();
        System.out.println("=== modern java.time methods ===");
        System.out.println("note that LocalDateTime is current time zone while default Instant is UTC with time zone Z appended");
        System.out.println("java.time.LocalDateTime.now(), Instant.now()   = " + java.time.LocalDateTime.now() + ", " + java.time.Instant.now());
        System.out.println("java.time.LocalDateTime.now(), Instant.now()   = " + java.time.LocalDateTime.now() + ", " + java.time.Instant.now());
        System.out.println("java.time.LocalDateTime.now(), Instant.now()   = " + java.time.LocalDateTime.now() + ", " + java.time.Instant.now());
        System.out.println("sleep for 1000 msec...");
        sleep(1000l); // hold on a second
        System.out.println("java.time.LocalDateTime.now(), Instant.now()   = " + java.time.LocalDateTime.now() + ", " + java.time.Instant.now());
        System.out.println("java.time.LocalDateTime.now(), Instant.now()   = " + java.time.LocalDateTime.now() + ", " + java.time.Instant.now());
        System.out.println("java.time.LocalDateTime.now(), Instant.now()   = " + java.time.LocalDateTime.now() + ", " + java.time.Instant.now());

        System.out.println("DisTime.hasEpochLvc()                          = " + DisTime.hasEpochLvc());
        System.out.println("DisTime.setEpochLvcNow()...");
        setEpochLvcNow();
        System.out.println("DisTime.hasEpochLvc(),                         = " + DisTime.hasEpochLvc());
        Instant now = Instant.now();
        System.out.println("DisTime.getEpochLvc(), Instant.now(), duration = " + DisTime.getEpochLvc() + ", " + now + ", " + 
            java.time.Duration.between(getEpochLvc(), now).toMillis() + " msec");
        System.out.println("sleep for 1000 msec...");
        sleep(1000l); // hold on a second
        now = Instant.now();
        System.out.println("DisTime.getEpochLvc(), Instant.now(), duration = " + DisTime.getEpochLvc() + ", " + now + ", " + 
            java.time.Duration.between(getEpochLvc(), now).toMillis() + " msec");
//        System.out.println("DisTime.getCurrentDisTimeUnitsSinceTopOfHour() = " + convertToString(DisTime.getCurrentDisTimeUnitsSinceTopOfHour()) + " = " + DisTime.getCurrentDisTimeUnitsSinceTopOfHour());
    }

    /**
     * Main method for testing.
     * @see <a href="https://docs.oracle.com/javase/tutorial/getStarted/application/index.html">Java Tutorials: A Closer Look at the "Hello World!" Application</a>
     * @param args [unused] command-line arguments are an array of optional String parameters that are passed from execution environment during invocation
     */
    public static void main(String[] args)
    {
        System.out.println("*** DisTime.main() self test started...");

        DisTime disTimeInstance = new DisTime();
        disTimeInstance.selfTest();
        
        System.out.println("*** DisTime.main() self test complete.");
    }
}
