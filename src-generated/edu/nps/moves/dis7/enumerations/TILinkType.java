/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 370,
 * marshal size 16;
 * TILinkType has 13 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum TILinkType 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Not Used */
    // autogenerated using string template disenumpart2.txt
    NOT_USED (0, "Not Used"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ground Initiated Communications B (GICB) */
    // autogenerated using string template disenumpart2.txt
    GROUND_INITIATED_COMMUNICATIONS_B_GICB (1, "Ground Initiated Communications B (GICB)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Automatic Dependent Surveillance (ADS) */
    // autogenerated using string template disenumpart2.txt
    AUTOMATIC_DEPENDENT_SURVEILLANCE_ADS (2, "Automatic Dependent Surveillance (ADS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Global Navigation Satellite System (GNSS) */
    // autogenerated using string template disenumpart2.txt
    GLOBAL_NAVIGATION_SATELLITE_SYSTEM_GNSS (3, "Global Navigation Satellite System (GNSS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Data Link Initiation Capability (DLIC) */
    // autogenerated using string template disenumpart2.txt
    DATA_LINK_INITIATION_CAPABILITY_DLIC (4, "Data Link Initiation Capability (DLIC)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aircraft Communications Addressing and Reporting System (ACARS) */
    // autogenerated using string template disenumpart2.txt
    AIRCRAFT_COMMUNICATIONS_ADDRESSING_AND_REPORTING_SYSTEM_ACARS (5, "Aircraft Communications Addressing and Reporting System (ACARS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ATC Communications Management (ACM) */
    // autogenerated using string template disenumpart2.txt
    ATC_COMMUNICATIONS_MANAGEMENT_ACM (6, "ATC Communications Management (ACM)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** VHF Digital Link (VDL) */
    // autogenerated using string template disenumpart2.txt
    VHF_DIGITAL_LINK_VDL (7, "VHF Digital Link (VDL)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aeronautical Telecommunication Network (ATN) */
    // autogenerated using string template disenumpart2.txt
    AERONAUTICAL_TELECOMMUNICATION_NETWORK_ATN (8, "Aeronautical Telecommunication Network (ATN)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mode Select (S) */
    // autogenerated using string template disenumpart2.txt
    MODE_SELECT_S (9, "Mode Select (S)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Airborne Collision Avoidance Systems (ACAS) */
    // autogenerated using string template disenumpart2.txt
    AIRBORNE_COLLISION_AVOIDANCE_SYSTEMS_ACAS (10, "Airborne Collision Avoidance Systems (ACAS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Traffic Collision Avoidance Systems (TCAS) */
    // autogenerated using string template disenumpart2.txt
    TRAFFIC_COLLISION_AVOIDANCE_SYSTEMS_TCAS (11, "Traffic Collision Avoidance Systems (TCAS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Automatic Dependent Surveillance-B (ADS-B) */
    // autogenerated using string template disenumpart2.txt
    AUTOMATIC_DEPENDENT_SURVEILLANCE_B_ADS_B (12, "Automatic Dependent Surveillance-B (ADS-B)");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    TILinkType(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
    /** Provide enumeration value
      * @return integer value */
    public int getValue()
    {
        return value;
    }

    /** Provide enumeration description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /** bit width for this enumeration
     * @return number of bits wide
     */
    public static int getEnumBitWidth()
    {
      return 16;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static TILinkType getEnumForValue(int value)
    {
       for (TILinkType nextEnum : TILinkType.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum TILinkType");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_16.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }
    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static TILinkType unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static TILinkType unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
  /**
   * Provide name
   * @return  name
   */
    public String getName()
    {
        return name();
    }

  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        return "TILinkType " + getValue() + " " + name(); 
    }
}
