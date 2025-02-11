/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
package edu.nps.moves.dis7.utilities.stream;

import com.google.common.primitives.Longs;
import edu.nps.moves.dis7.enumerations.DisPduType;
import edu.nps.moves.dis7.pdus.Pdu;
import edu.nps.moves.dis7.utilities.DisThreadedNetworkInterface;
import edu.nps.moves.dis7.utilities.DisTime;
import edu.nps.moves.dis7.utilities.PduFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FilenameUtils;
 
/** Utility to save PDUs received over the network to disk, greatly simplifying the capture of DIS streams by applications.
 * 
 * Example <code>main()</code> self-test response shown in log file, example results also included.
 * @see <a href="https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestLog.txt">https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestLog.txt</a>
 * @see <a href="https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestENCODING_BASE64_PduCaptureLog.dislog">https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestENCODING_BASE64_PduCaptureLog.dislog</a>
 * @see <a href="https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestENCODING_BINARY_PduCaptureLog.dislog">https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestENCODING_BINARY_PduCaptureLog.dislog</a>
 * @see <a href="https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestENCODING_PLAINTEXT_PduCaptureLog.dislog">https://github.com/open-dis/open-dis7-java/blob/master/src/edu/nps/moves/dis7/utilities/stream/PduRecorderSelfTestENCODING_PLAINTEXT_PduCaptureLog.dislog</a>
 * 
 * @author Don Brutzman, brutzman@nps.edu
 * @author Mike Bailey, jmbailey@nps.edu
 */
public class PduRecorder // implements PduReceiver
{
    /** Default multicast group address <code>239.1.2.3</code> for send and receive connections.
     * @see <a href="https://en.wikipedia.org/wiki/Multicast_address">https://en.wikipedia.org/wiki/Multicast_address</a>  */
    public static String DEFAULT_DIS_ADDRESS = DisThreadedNetworkInterface.DEFAULT_DIS_ADDRESS;

    /** Default socket port  <code>3000</code>, matches Wireshark DIS capture default
     * @see <a href="https://en.wikipedia.org/wiki/Port_(computer_networking)">https://en.wikipedia.org/wiki/Port_(computer_networking)</a> */
    public static int DEFAULT_DIS_PORT = DisThreadedNetworkInterface.DEFAULT_DIS_PORT;
    
    /** Character sentinel indicating remainder of line is a comment */
    public static final String COMMENT_MARKER = "#";

    static final String OUTPUT_DIRECTORY_DEFAULT = "./pduLog";
    static final String DEFAULT_FILE_PREFIX      = "PduCaptureLog";
    static final String DISLOG_FILE_EXTENSION    = ".dislog";
    
    /** pattern template for default pdu log file name */
    public static final String DEFAULT_FILE_NAME        = DEFAULT_FILE_PREFIX + DISLOG_FILE_EXTENSION;

    static final String START_COMMENT_MARKER           = COMMENT_MARKER + " Start, ";
    static final String FINISH_COMMENT_MARKER          = COMMENT_MARKER + " Finish, ";
    
    /** ENCODING_PLAINTEXT uses a modified comma-separated values (CSV) format to show DIS values readably and is default DIS PDU format*/
    public static final String ENCODING_PLAINTEXT             = "ENCODING_PLAINTEXT";
    /** ENCODING_BASE64 uses simple Base64 (MIME type) compression on ENCODING_PLAINTEXT 
     * @see <a href="https://en.wikipedia.org/wiki/Base64" target="_blank">Wikipedia: Base64</a> */
    public static final String ENCODING_BASE64                = "ENCODING_BASE64";
    
    /** ENCODING_BINARY is required for DFDL parsing/unparsing */
    public static final String ENCODING_BINARY                = "ENCODING_BINARY";  // TODO likely requires different code path
    /** TODO ENCODING_XML is default DIS PDU format using NPS DIS XML schema format */
    public static final String ENCODING_XML                   = "ENCODING_XML";     // TODO, repeat Open-DIS version 4 effort
    /** TODO ENCODING_EXI is Efficient XML Interchange (EXI) format for compressed XML */
    public static final String ENCODING_EXI                   = "ENCODING_EXI";     // TODO, use Exificient or Nagasena libraries
    /** TODO ENCODING_CDIS is Compressed DIS format */
    public static final String ENCODING_CDIS                  = "ENCODING_CDIS";    // future work based on new SISO standard
    /** TODO ENCODING_JSON is JavaScript Object Notation (JSON) format */
    public static final String ENCODING_JSON                  = "ENCODING_JSON";    // TODO, repeat Open-DIS version 4 effort
    /** TODO ENCODING_WIRESHARK_DATA_LOGGER is likely going to be PCAPng format
     * @see <a href="https://en.wikipedia.org/wiki/Pcap" target="_blank">Wikipedia: Base64</a> */
    public static final String ENCODING_WIRESHARK_DATA_LOGGER = "ENCODING_WIRESHARK_DATA_LOGGER"; // 
    /** TODO ENCODING_MAK_DATA_LOGGER is Mak data logger format
     * @see <a href="https://www.mak.com/products/link/mak-data-logger" target="_blank">Wikipedia: Base64</a>  */
    public static final String ENCODING_MAK_DATA_LOGGER       = "ENCODING_MAK_DATA_LOGGER";       // verbose pretty-print. perhaps output only (MAK format itself is binary)
    
    /** List of supported encodings */
    public static final List<String> ENCODING_OPTIONS_LIST = new ArrayList<>();
    /** TODO list of planned encodings */
    public static final List<String> ENCODING_OPTIONS_TODO = new ArrayList<>();

    /** encoding used by log file */
    protected String  encodingPduLog = ENCODING_PLAINTEXT; // default, TODO change to ENCODING_BINARY
    private boolean includeHeaders = encodingPduLog.equals(ENCODING_PLAINTEXT);

    private String TRACE_PREFIX = ("[PduRecorder " + getDescriptor()).trim() + "] ";
    private String  descriptor;

    /** Writer class for log file */
    protected Writer       logFileWriter;
    private File           logFile;
    private String         logFileName = DEFAULT_FILE_NAME;
    private DisThreadedNetworkInterface                disThreadedNetworkInterface;
    private DisThreadedNetworkInterface.RawPduListener disRawPduListener;
    
    // TODO: move this to PduFactory
    /** initialize the pduFactory for creating default application id, country, etc. */
    protected final PduFactory     pduFactory       = DisTime.getPduFactory();

    /** initialize the StringBuilder */
    protected final StringBuilder  sb               = new StringBuilder();
    /** initialize the encoder */
    protected final Base64.Encoder base64Encoder    = Base64.getEncoder();
    /** initialize the clock */
    protected long           recordingStartNanoTime = -1; // sentinel
    /** whether or not header has already been written */
    protected int            pduCount               = 0;    // debug
    /** whether or not header has already been written */
    protected boolean      headerWritten          = false;
    private boolean        running                = true; // starts recording by default
    private boolean        readableTimeStamp      = true; // 
    private boolean        zeroBasedTimeStamp     = true; // use normal date, time strings vice bytes
    /** initialize the clock */
    protected long           recordingDurationNano  = -1;
    /** initialize the clock */
    protected LocalTime      recordingDuration      = null;
    /** remember time of first pdu timestamp */
    protected int            pduTimestampFirst      = 0;
    
    private String disAddress = DEFAULT_DIS_ADDRESS;
    private int    disPort    = DEFAULT_DIS_PORT;
  
    private boolean verbose         = true;
    private boolean verboseReceipt  = true;
    private boolean verboseSending  = true;
    private boolean verboseIncludesTimestamp = false;
    private String outputDirectory = OUTPUT_DIRECTORY_DEFAULT;
    private Path   outputDirectoryPath;
    
    private void initialize()
    {
        if (ENCODING_OPTIONS_LIST.isEmpty())
        {
            ENCODING_OPTIONS_LIST.add(ENCODING_PLAINTEXT            );
            ENCODING_OPTIONS_LIST.add(ENCODING_BASE64               );
            ENCODING_OPTIONS_LIST.add(ENCODING_BINARY               ); // IEEE DIS format
            // TODO encoding options not yet implemented in open-dis7
            ENCODING_OPTIONS_TODO.add(ENCODING_XML                  );
            ENCODING_OPTIONS_TODO.add(ENCODING_EXI                  );
            ENCODING_OPTIONS_TODO.add(ENCODING_CDIS                 );
            ENCODING_OPTIONS_TODO.add(ENCODING_JSON                 );
            ENCODING_OPTIONS_TODO.add(ENCODING_WIRESHARK_DATA_LOGGER);
            ENCODING_OPTIONS_TODO.add(ENCODING_MAK_DATA_LOGGER      );
        }
    }
  
    /**
     * Default constructor that uses default values for output directory, DIS address and port.
     * Each instance must invoke start() to begin operations, pause() to suspend operations, 
     * resume() to continue operations, and stop() to terminate operations.
     * @throws IOException if something goes wrong during instantiation
     */
    public PduRecorder() throws IOException
    {
        this(OUTPUT_DIRECTORY_DEFAULT);
    }

    /**
     * Constructor to let the use specify an output directory.
     * Uses default values for multicast address and port.
     * Each instance must invoke start() to begin operations, pause() to suspend operations, 
     * resume() to continue operations, and stop() to terminate operations.
     * 
     * @param initialOutputDirectory the directory to write log files to
     * @throws IOException if something goes wrong during instantiation
     */
    public PduRecorder(String initialOutputDirectory) throws IOException
    {
        this(initialOutputDirectory, DEFAULT_DIS_ADDRESS, DEFAULT_DIS_PORT);
    }

    /** Constructor to let the user specify all required parameters.
     * Each instance must invoke start() to begin operations, pause() to suspend operations, 
     * resume() to continue operations, and stop() to terminate operations..
     * 
     * @param initialOutputDirectory local path for directory where the log files are written
     * @param initialAddress multicast group address to receive data from (TODO allow unicast UDP)
     * @param initialPort UDP port to listen for data
     */
    public PduRecorder(String initialOutputDirectory, String initialAddress, int initialPort)
    {
        initialize();
        outputDirectoryPath = new File(initialOutputDirectory).toPath();
        descriptor = "PduRecorder"; // default
        disAddress = initialAddress;
        disPort    = initialPort;
    }

      /**
       * TODO change this to enumeration type for strictness
       *
       * @return the pduLogEncoding
       */
      public String getEncodingPduLog()
      {
          return encodingPduLog;
      }

      /**
       * Set encoding for PDU Log
       * @param newEncodingPduLog the pduLogEncoding to set
       * @return same object to permit progressive setters */
      public PduRecorder setEncodingPduLog(String newEncodingPduLog)
      {
          newEncodingPduLog = newEncodingPduLog.trim();
          String errorMessage = "*** setEncodingPduLog(" + newEncodingPduLog + ") ";
          if (ENCODING_OPTIONS_LIST.contains(newEncodingPduLog))
          {
              encodingPduLog = newEncodingPduLog;
              setIncludeHeaders(encodingPduLog.equals(ENCODING_PLAINTEXT));
              return this;
          }
          else if (ENCODING_OPTIONS_TODO.contains(newEncodingPduLog))
          {
              errorMessage += " is not yet a supported encoding";
          }
          else
          {
              errorMessage += " is not yet a recognizeded encoding";
          }
          errorMessage += ", encodingPduLog=" + encodingPduLog + " is unchanged";
          System.err.println (errorMessage);
          System.err.flush(); // since network threads may be occurring
          return this;
      }

    /** Resume instance operation
     * @see start()
     * @see stop()
     * @see pause() */
    public void resume()
    {
      if  (disThreadedNetworkInterface == null)
      {
           System.out.println("** Warning, PduRecorder resume() failed to find running disThreadedNetworkInterface, repeating start()");
           start(); // start me up
      }
      else running = true;
    }

    /** Start instance operation, resetting network interface and file recording
     * @see stop()
     * @see pause()
     * @see resume()
     */
    public void start()
    {
        try {
            logFile         = createUniquePduLogFile(getOutputDirectoryPath(), getLogFileName());
            logFileWriter   = new PrintWriter(new BufferedWriter(new FileWriter(logFile)));
        }
        catch (IOException ex)
        {
          System.err.println("Exception when creating log file in directory=" + getOutputDirectoryPath().toAbsolutePath() + "\n" +
                              "   " + ex.getClass().getSimpleName() + ": " + ex.getLocalizedMessage());
        }
        if (disThreadedNetworkInterface == null)
        {
            disThreadedNetworkInterface = new DisThreadedNetworkInterface(getAddress(), getPort());
            disThreadedNetworkInterface.setDescriptor (getDescriptor()); // pass it along
            disThreadedNetworkInterface.setVerbose(verbose);

            disRawPduListener = (DisThreadedNetworkInterface.ByteArrayBufferAndLength bAndL) -> {
                receivePdu(bAndL.bufferByteArray, bAndL.length);
            };
            disThreadedNetworkInterface.addRawListener(disRawPduListener);
            System.out.println("[" + (getClass().getSimpleName() + " " + getDescriptor()).trim() + "] listening to IP address " + getAddress() + " on port " + getPort());
        }
        running = true;
    }
    
    /** Pause operation of this instance
     * @see start()
     * @see stop()
     * @see resume()
     */
    public void pause()
    {
      running = false;
    }
    
    /** End operation of this instance, removing interfaces
     * @return recorder logFile
     * @see start()
     * @see pause()
     * @see resume() 
     */
    public File stop()
    {
      running = false;
      if (disThreadedNetworkInterface != null)
      {
          disThreadedNetworkInterface.removeRawListener(disRawPduListener);
          disThreadedNetworkInterface.close();
      }
      if (isIncludeHeaders())
      {
          writeFooter();
          headerWritten = false; // reset for next run
      }
      try {
          System.out.println();
          System.out.println("PduRecorder.stop() closing recorder log file:\n   " + logFile.getCanonicalPath());
          logFileWriter.close(); // a flush occurs first during a close
      } 
      catch (IOException ex) {
          Logger.getLogger(PduRecorder.class.getSimpleName()).log(Level.SEVERE, null, ex);
      }
      System.err.flush(); // ensure all output sent
      System.out.flush(); // ensure all output sent
      return logFile;
    }

    byte[] oldBuffer;
    LocalDateTime sessionStartTime = null;

    /** receivePdu from DIS data stream, invoked via callback from DisThreadedNetworkInterface.RawPduListener
     * @param newBuffer byte array for receiving data
     * @param newLength length of byte array
     */
    public void receivePdu(byte[] newBuffer, int newLength)
    {
      if (sessionStartTime == null)
          sessionStartTime = LocalDateTime.now();
      
      if (java.util.Arrays.equals(newBuffer, oldBuffer))
          System.err.println ("PduRecorder.receivePdu() warning: PDU newBuffer equals PDU oldBuffer"); // debug

      if(!isRunning())
        return; // thread operations no longer in progress, ignore this received PDU

//    String    localDateString   = LocalDate.now().toString();
      LocalTime sessionTime       = LocalTime.now();
      long packetReceivedNanoTime = sessionTime.toNanoOfDay();

      byte[]    byteBufferSized = Arrays.copyOf(newBuffer, newLength);
      // direct access: DisPduType is 3rd byte, see Table 98—PDU Header record (TODO course diagrams are erroneous)
      DisPduType pduType = DisPduType.getEnumForValue(Byte.toUnsignedInt(byteBufferSized[2])); // 3rd byte
      
      Pdu newPdu = pduFactory.createPdu(byteBufferSized);
      int    pduTimestampInt    = newPdu.getTimestamp();
      int    pduDurationInt     = pduTimestampInt - pduTimestampFirst;
      
      // DIS timestamp is 8 bytes in length, converted from Java long time into byte array
      // https://stackoverflow.com/questions/1026761/how-to-convert-a-byte-array-to-its-numeric-value-java
//      byte[] timestampByteArray = Arrays.copyOfRange(newBuffer, 4, 7); 
      // timestamp bytes 4..7 (fifth through eighth bytes), see Table 98—PDU Header record (TODO course diagrams are erroneous)
      
      byte[] receiptTimeByteArray = Longs.toByteArray(packetReceivedNanoTime - recordingStartNanoTime);
//      ByteBuffer receiptTimeByteBuffer = ByteBuffer.wrap(receiptTimeByteArray);
//      int        receiptTimeBufferInt        = receiptTimeByteBuffer.getInt();
//      String     receiptTimeBufferString     = DisTime.convertToLocalDateTime(receiptTimeBufferInt).format(DisTime.getTimeFormatter());
      
      if (recordingStartNanoTime == -1) // initialization
      {
          recordingStartNanoTime = packetReceivedNanoTime;
          pduTimestampFirst      = pduTimestampInt;
          pduDurationInt         = 0;
      }
//    String pduTimestampString = DisTime.convertToString(pduTimestampInt);
      String pduTimestampString = DisTime.convertToLocalDateTime(pduTimestampInt).format(DisTime.getTimeFormatter());
      String pduDurationString  = DisTime.convertToLocalDateTime(pduDurationInt).format(DisTime.getTimeFormatter());
      
      recordingDurationNano = packetReceivedNanoTime - recordingStartNanoTime;
//    sessionDuration = Duration.between(Instant.ofEpochMilli(startSessionNanoTime),Instant.ofEpochMilli(packetReceivedNanoTime)).abs();
      recordingDuration = LocalTime.ofNanoOfDay(recordingDurationNano); // LocalTime of duration value yields HH:MM
      String     sessionTimeString =     sessionTime.format(DisTime.getTimeFormatter());
      String sessionDurationString = recordingDuration.format(DisTime.getTimeFormatter());
      
      if (isIncludeHeaders() && !headerWritten)
      {
        writeHeader();
        headerWritten = true;
      }

      switch (encodingPduLog)
      {
          case ENCODING_BINARY:
              // diagnostics can go here, TODO is any processing needed?
              break;

          case ENCODING_BASE64:
              byte[] mergedByteArray = Arrays.copyOf(receiptTimeByteArray, receiptTimeByteArray.length + byteBufferSized.length);
              System.arraycopy(byteBufferSized, 0, mergedByteArray, receiptTimeByteArray.length, byteBufferSized.length);
              sb.append(base64Encoder.encodeToString(mergedByteArray));
/*                    
// from Rick
// https://stackoverflow.com/questions/5683486/how-to-combine-two-byte-arrays
// public static byte[] concat(byte[] a, byte[] b) {​​​​​​​
//    int lenA = a.length;
//    int lenB = b.length;
//    byte[] c = Arrays.copyOf(a, lenA + lenB);
//    System.arraycopy(b, 0, c, lenA, lenB);
//    return c;
// }​​​​​​​

// prior approach did not catenate before converting to base64. instead catenating results (which might not be correct)
//              sb.append(base64Encoder.encodeToString(timeByteArray));
//              sb.append(base64Encoder.encodeToString(byteBufferSized)); 
*/
              break;

          case ENCODING_PLAINTEXT:
              if (includesReadableTimeStamp())
              {
                  sb.append(COMMENT_MARKER).append(" ").append(pduType).append(", ");
                  sb.append("Session time "    ).append(sessionTimeString     ).append(", ");
                  sb.append("session duration ").append(sessionDurationString).append(", ");
                  sb.append("Pdu timestamp "   ).append(pduTimestampInt   ).append(" ").append(pduTimestampString).append(", ");
                  sb.append("simulation stream interval "    ).append(pduDurationInt    ).append(" ").append(pduDurationString);
                  sb.append("\n");
              }
              // Not Timestamp but receipt bytes (TODO needed?) remove square brackets to end up with pure CSV
              sb.append(Arrays.toString(receiptTimeByteArray).replace(" ", "").replace("[","").replace("]",""));
              sb.append(",");
              // PDU contents, remove square brackets to end up with pure CSV
              sb.append(Arrays.toString(byteBufferSized).replace(" ", "").replace("[","").replace("]",""));
              break;
              
          // TODO test reader still works without extra [square brackets]
          // TODO add option for TSV vice CSV
          // TODO ENCODING_XML

          default:
              if (ENCODING_OPTIONS_LIST.contains(encodingPduLog))
                 System.err.println ("Encoding " + encodingPduLog + " not supported");
              else
                 System.err.println ("Encoding " + encodingPduLog + " not recognized");
              break;
      }
      try
      {
        if (encodingPduLog.equals(ENCODING_BINARY))
        {
            // https://stackoverflow.com/questions/4931854/converting-char-array-into-byte-array-and-back-again
            Charset    charset = Charset.forName("UTF-8");
            CharBuffer charBufferSized = charset.decode(ByteBuffer.wrap(byteBufferSized));
            logFileWriter.write(charBufferSized.array());
        }
        else
        {
            logFileWriter.write(sb.toString());
            ((PrintWriter)logFileWriter).println();
        }
      }
      catch (IOException ex)
      {    
          throw new RuntimeException("Fatal exception writing DIS log file in PduRecorder thread, encodingPduLog=" + encodingPduLog + ": " + ex);
      }
      pduCount = pduCount + 1;
//      if (false) // debug
//          System.out.println(TRACE_PREFIX + "PduRecorder: pduCount="+ pduCount);

      sb.setLength(0);
    }

    /** Retrieve the path to the log file
     * 
     * @return the path to the log file
     */
    public String getLogFilePath()
    {
      return logFile.getAbsolutePath();
    }

    /**
     * Deprecated due to class rename, use getDisThreadedNetworkInterface() instead
     * @see getDisThreadedNetworkInterface()
     * @return an instance of this DisThreadedNetworkInterface
     */
    @Deprecated
    public DisThreadedNetworkInterface getDisThreadedNetIF() {
        return getDisThreadedNetworkInterface();
    }

    /**
     * Provide link to singleton disThreadedNetworkInterface
     * @return an instance of this DisThreadedNetworkInterface
     */
    public DisThreadedNetworkInterface getDisThreadedNetworkInterface() {
        return disThreadedNetworkInterface;
    }

    /** utility method to write appropriately encoded log file header */
    protected void writeHeader()
    {
        String timeStamp = getTimeStamp();

        try
        {
            logFileWriter.write(START_COMMENT_MARKER + encodingPduLog + ", " + TRACE_PREFIX + timeStamp + ", DIS capture file, " + logFile.getPath());
            ((PrintWriter) logFileWriter).println();
            
//            if (encodingPduLog.equals(ENCODING_PLAINTEXT) && includesReadableTimeStamp())
//            {
//                logFileWriter.write(COMMENT_MARKER + " DisPduType,ReceiptDate,ReceiptTime");
//                ((PrintWriter) logFileWriter).println();
//            }
            if (encodingPduLog.equals(ENCODING_PLAINTEXT))
            {
                logFileWriter.write(COMMENT_MARKER + " Timestamp(8 bytes),ProtocolVersion,CompatibilityVersion,ExerciseID,PduType,PduStatus,HeaderLength,PduLength,then PDU-specific data");
                ((PrintWriter) logFileWriter).println();
            }
            if (encodingPduLog.equals(ENCODING_PLAINTEXT) && includesReadableTimeStamp())
            {
                logFileWriter.write(COMMENT_MARKER + " " + "=============================================");
                ((PrintWriter) logFileWriter).println();
            }
        } 
        catch (IOException ioe)
        {
            Logger.getLogger(PduRecorder.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }

    /** utility method to write appropriately encoded file footer */
    private void writeFooter()
    {   
        String timeStamp = getTimeStamp();

        try
        {
            logFileWriter.write(FINISH_COMMENT_MARKER + encodingPduLog + ", " + TRACE_PREFIX + timeStamp + ", DIS capture file, " + logFile.getPath());
            ((PrintWriter) logFileWriter).println();
        } 
        catch (IOException ex)
        {
            Logger.getLogger(PduRecorder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getTimeStamp() {
        // https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); 
    }

    /**
     * Rotates through file names so that no present file get overwritten.
     * 
     * @param outputDir the directory to place the log file
     * @param filename the name of the file w/ extension
     * @return a File reference to the log file
     * @throws IOException if something goes awry
     */
    private File createUniquePduLogFile(Path outputDir, String filename) throws IOException
    {
      String baseName  = FilenameUtils.getBaseName(filename);
      String extension = FilenameUtils.getExtension(filename);

      Integer fileCounter = null;
      File    newFile;
      boolean fileExists;
      outputDir.toFile().mkdirs();
      do {
        String nextFileName = baseName + (fileCounter == null ? "" : fileCounter) + "." + extension;
        newFile = new File(outputDir.toFile(), nextFileName);
        fileExists = newFile.exists();
        if (fileCounter == null)
          fileCounter = 1;
        else
          fileCounter++;
      } while (fileExists);

      if (newFile.createNewFile()) 
      {
          System.out.println(TRACE_PREFIX + "Recorder log file open: " + newFile.getCanonicalPath());
      }
      else
      {
        System.out.println(TRACE_PREFIX + "Cannot create dis log file at " + newFile.getAbsolutePath());
        throw new RuntimeException("File creation error");
      }
      return newFile;
    }

    /**
     * Whether or not PduRecorder is currently running
     * @return the pduRecorderRunning
     */
    public boolean isRunning()
    {
        return running;
    }
  
    /**
     * Entry point invocation to facilitate developmental testing, runs selfTest() method.
     *
     * @param args none supported, TODO offer path/filename
     */
    public static void main(String[] args)
    {
        try
        {
            PduRecorder pduRecorder = new PduRecorder(); // instantiates an instance object of this class,
            pduRecorder.selfTest(args);                  // and tests it.  Results shown in .dislog files.
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace(System.err);
        }
    }
  
  /** This selfTest() method saves PDU output logs to assigned directory using all supported encodings. 
   *  Further checking can be accomplished by separately Invoking the edu.nps.moves.dis7.examples.PduReaderPlayer
   *  which will playback all logs written to that log directory.
   * 
   * @param args none supported, TODO offer path/filename
   */
  public synchronized void selfTest(String[] args)
  {
    System.out.println("dis7.utilities.stream.PduRecorder main() performs self-test by sending full set of PDUs");
    
    PduRecorder pduRecorder;
    DisThreadedNetworkInterface disNetworkInterface;
    DisPduType allPDUTypesArray[] = DisPduType.values();
    System.out.println("dis7.utilities.stream.PduRecorder allPDUTypesArray created, length=" + allPDUTypesArray.length + " ...");
    System.out.flush(); // ensure all output sent
    
    for (String currentEncoding : ENCODING_OPTIONS_LIST)
    {
        try 
        {
            pduRecorder = new PduRecorder(); // default address, port, output directory path
        } 
        catch(IOException ex) 
        {
          System.err.println("Exception creating PduRecorder: " + ex.getLocalizedMessage());
          ex.printStackTrace(System.err);
          return;
        }
        System.out.println("=================================================");
        System.out.println("Test PduRecorder encoding " + currentEncoding);
        pduRecorder.setEncodingPduLog(currentEncoding);
        pduRecorder.setDescriptor("PduRecorder main() self test " + currentEncoding);
//      pduRecorder.setPort(1); // option to avoid listening to other PDU streams during self test
        pduRecorder.setLogFileName("PduRecorderSelfTest" + currentEncoding + "_" + DEFAULT_FILE_PREFIX + DISLOG_FILE_EXTENSION);
        pduRecorder.start();
        disNetworkInterface = pduRecorder.getDisThreadedNetworkInterface(); // must reinitialize after each begin
        System.out.println("dis7.utilities.stream.PduRecorder pduRecorder started... isRunning()=" + pduRecorder.isRunning());

        for (int index=0; index < allPDUTypesArray.length; index++)
        {
          DisPduType pduTypeValue = allPDUTypesArray[index];
          if (pduTypeValue != DisPduType.OTHER) 
          {
            try {
                Pdu nextPdu = pduFactory.createPdu(allPDUTypesArray[index]);
                nextPdu.setTimestamp(index * 10); // seconds
                nextPdu.setLength(nextPdu.getMarshalledSize());
//              nextPdu.getTimestamp(); // debug
                disNetworkInterface.sendPDU(nextPdu);
                
                // https://stackoverflow.com/questions/10663920/calling-thread-sleep-from-synchronized-context-in-java
                // https://stackoverflow.com/questions/1036754/difference-between-wait-vs-sleep-in-java
                wait (100L); // let send/receive threads and streams catch up // TODO consider wait() instead of sleep()
            }
            catch (InterruptedException ex) {
              System.err.println("Exception sending Pdu " + pduTypeValue + ": " + ex.getLocalizedMessage());
            }
          }
          else 
          {
              System.err.println("Found pduTypeValue=DisPduType.OTHER=" + pduTypeValue);
          }
        }
        System.out.flush();
        System.err.flush(); // ensure all output sent
        pduRecorder.stop();
        System.out.println("dis7.utilities.stream.PduRecorder pduRecorder complete... isRunning()=" + pduRecorder.isRunning());
    }
    // end of loop ENCODING_OPTIONS_LIST
    System.out.println("=================================================");
  }
  
    /**
     * Get current multicast (or unicast) network address for send and receive connections.
     * @see <a href="https://en.wikipedia.org/wiki/Multicast_address">https://en.wikipedia.org/wiki/Multicast_address</a> 
     * @return current multicast address value
     */
    public String getAddress()
    {
        return this.disAddress;
    }
    
    /**
     * Network address for send and receive connections.
     * @see <a href="https://en.wikipedia.org/wiki/Multicast_address">https://en.wikipedia.org/wiki/Multicast_address</a> 
     * @param newAddress the new network address to set
     * @return same object to permit progressive setters */
    public PduRecorder setAddress(String newAddress) {
        if (isRunning() && !disAddress.equals(newAddress))
            System.out.println(TRACE_PREFIX + "*** warning, attempting to change network address while running...");
        // TODO warn if netIF already created
        this.disAddress = newAddress;
        return this;
    }
    
    /** Get network port used, multicast or unicast.
     * @see <a href="https://en.wikipedia.org/wiki/Port_(computer_networking)">https://en.wikipedia.org/wiki/Port_(computer_networking)</a> 
     * @return current port value
     */
    public int getPort()
    {
        return this.disPort;
    }
    
    /** Set network port used, multicast or unicast.
     * @see <a href="https://en.wikipedia.org/wiki/Port_(computer_networking)">https://en.wikipedia.org/wiki/Port_(computer_networking)</a> 
     * @param newPortValue the disPort value to set
     * @return same object to permit progressive setters */
    public PduRecorder setPort(int newPortValue)
    {
        if (isRunning() && (this.disPort != newPortValue))
            System.out.println(TRACE_PREFIX + "*** warning, attempting to change network port while running...");
        // TODO warn if netIF already created
        this.disPort = newPortValue;
        return this;
    }
    
    /**
     * Get simple descriptor (such as parent class name) for this network interface, used in trace statements
     * @return simple descriptor name
     */
    public String getDescriptor() {
        if (descriptor == null)
            descriptor = "";
        return descriptor;
    }

    /**
     * Set new simple descriptor (such as parent class name) for this network interface, used in trace statements
     * @param newDescriptor simple descriptor name
     * @return same object to permit progressive setters */
    public PduRecorder setDescriptor(String newDescriptor) 
    {
        if  (newDescriptor != null)
             this.descriptor = newDescriptor.trim();
        else descriptor = "";
        if  (descriptor.isBlank())
             TRACE_PREFIX = "[" + PduRecorder.class.getSimpleName()                    + "] ";
        else TRACE_PREFIX = "[" + PduRecorder.class.getSimpleName() + " " + descriptor + "] ";
        return this;
    }
    
    /**
     * Set whether or not trace statements are provided when packets are sent or received.
     * @param newValue the verbose status to set, also resets verboseReceipt and verboseSending to match.
     * @see verboseReceipt
     * @see verboseSending
     * @return same object to permit progressive setters */
    public PduRecorder setVerbose(boolean newValue)
    {
        this.verbose   = newValue;
        verboseReceipt = verbose;
        verboseSending = verbose;
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerbose(newValue);
        }
        return this;
    }
    
    /**
     * Whether or not trace statements are provided when packets are sent or received.
     * @return the verbose status
     * @see verboseReceipt
     * @see verboseSending
     */
    public boolean hasVerboseOutput()
    {
        return verbose;
    }
    
    /**
     * Set whether or not trace statements are provided when packets are received.
     * @param newValue the verboseReceipt status to set
     * @see verbose
     * @see verboseSending
     * @return same object to permit progressive setters */
    public PduRecorder setVerboseReceipt(boolean newValue)
    {
        this.verboseReceipt = newValue;
        verbose = (verboseReceipt || verboseSending);
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerboseReceipt(newValue);
        }
        return this;
    }
    
    /**
     * Whether or not trace statements are provided when packets are received.
     * @return the verboseReceipt status
     */
    public boolean hasVerboseReceipt()
    {
        return verboseReceipt;
    }

    /**
     * Set whether or not trace statements are provided when packets are sent.
     * @param newValue the verboseSending status to set
     * @see verbose
     * @see verboseReceipt
     * @return same object to permit progressive setters */
    public PduRecorder setVerboseSending(boolean newValue)
    {
        this.verboseSending = newValue;
        verbose = (verboseReceipt || verboseSending);
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerboseSending(newValue);
        }
        return this;
    }
    
    /**
     * Whether or not trace statements are provided when packets are sent.
     * @return the verboseSending status
     */
    public boolean hasVerboseSending()
    {
        return verboseSending;
    }

    /**
     * Whether or not trace statements include timestamp values.
     * @return the verboseIncludesTimestamp value
     */
    public boolean hasVerboseOutputIncludesTimestamp()
    {
        return verboseIncludesTimestamp;
    }

    /**
     * Set whether or not trace statements include timestamp values.
     * @param verboseIncludesTimestamp the value to set
     * @return same object to permit progressive setters */
    public PduRecorder setVerboseIncludesTimestamp(boolean verboseIncludesTimestamp)
    {
        this.verboseIncludesTimestamp = verboseIncludesTimestamp;
        if (disThreadedNetworkInterface != null)
        {
            disThreadedNetworkInterface.setVerboseIncludesTimestamp(verboseIncludesTimestamp);
        }
        return this;
    }

    /**
     * Provide file name of PDU log
     * @return the logFileName
     */
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * Set file name of PDU log
     * @param logFileName the logFileName to set
     * @return same object to permit progressive setters */
    public PduRecorder setLogFileName(String logFileName) {
        this.logFileName = logFileName;
        return this;
    }

    /**
     * Get output directory for this PduRecorder
     * @return the outputDirectory
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Set output directory for this PduRecorder
     * @param outputDirectory the outputDirectory to set
     * @return same object to permit progressive setters */
    public PduRecorder setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
        outputDirectoryPath = new File(outputDirectory).toPath();
        return this;
    }

    /**
     * Get output directory path for this PduRecorder.
     * To change outputDirectoryPath, invoke setOutputDirectory().
     * @see setOutputDirectory(String)
     * @return the outputDirectoryPath
     */
    public Path getOutputDirectoryPath() {
        return outputDirectoryPath;
    }

    /**
     * Whether to provide date/time in readable form, otherwise use byte array
     * @return whether readableTimeStamp is used
     */
    public boolean includesReadableTimeStamp() {
        return readableTimeStamp;
    }

    /**
     * Set whether to provide date/time in readable form, otherwise use byte array
     * @param readableTimeStamp whether readableTimeStamp to true
     */
    public void setReadableTimeStamp(boolean readableTimeStamp) {
        this.readableTimeStamp = readableTimeStamp;
    }

    /**
     * get duration of the current session, measured from time of first PDU receipt
     * @return the sessionDurationNano
     */
    public long getSessionDuration() {
        return recordingDurationNano;
    }

    /**
     * Whether timestamp values start at zero or time of initial PDU receipt, default value is true
     * @return the zeroBasedTimeStamp
     */
    public boolean isZeroBasedTimeStamp() {
        return zeroBasedTimeStamp;
    }

    /**
     * Set whether timestamp values start at zero or time of initial PDU receipt, default value is true
     * @param zeroBasedTimeStamp the zeroBasedTimeStamp to set
     */
    public void setZeroBasedTimeStamp(boolean zeroBasedTimeStamp) {
        this.zeroBasedTimeStamp = zeroBasedTimeStamp;
    }

    /**
     * Whether includeHeaders status is true
     * @return the includeHeaders
     */
    public boolean isIncludeHeaders() {
        return includeHeaders;
    }

    /**
     * Set the includeHeaders status
     * @param includeHeaders the includeHeaders to set
     */
    public void setIncludeHeaders(boolean includeHeaders) {
        this.includeHeaders = includeHeaders;
    }
    
} // end class PduRecorder
