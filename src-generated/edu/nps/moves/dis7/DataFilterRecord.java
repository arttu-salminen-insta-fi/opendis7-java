/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * identify which of the optional data fields are contained in the Minefield Data PDU or requested in the Minefield Query PDU. This is a 32-bit record. For each field, true denotes that the data is requested or present and false denotes that the data is neither requested nor present. Section 6.2.16
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class DataFilterRecord extends Object implements Serializable
{
   /** Bitflags field */
   protected int  bitFlags;

   public static int  GROUND_BURIAL_DEPTH_OFFSET_BIT = 0;
   public static int  WATER_BURIAL_DEPTH_OFFSET_BIT = 1;
   public static int  SNOW_BURIAL_DEPTH_OFFSET_BIT = 2;
   public static int  MINE_ORIENTATION_BIT = 3;
   public static int  THERMAL_CONSTRAST_BIT = 4;
   public static int  REFLECTANCE_BIT = 5;
   public static int  MINE_EMPLACEMENT_TIME_BIT = 6;
   public static int  TRIP_DETONATION_WIRE_BIT = 7;
   public static int  FUSING_BIT = 8;
   public static int  SCALAR_DETECTION_COEFFICIENT_BIT = 9;
   public static int  PAINT_SCHEME_BIT = 10;

/** Constructor */
 public DataFilterRecord()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // bitFlags

   return marshalSize;
}


/** Setter for {@link DataFilterRecord#bitFlags}*/
public DataFilterRecord setBitFlags(int pBitFlags)
{
    bitFlags = pBitFlags;
    return this;
}

/** Getter for {@link DataFilterRecord#bitFlags}*/
public int getBitFlags()
{
    return bitFlags; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeInt( (int)bitFlags);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Unserializes an object from a DataInputStream.
 * @see java.io.DataInputStream
 * @param dis The DataInputStream
 * @return marshalled size
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        bitFlags = dis.readInt();
        uPosition += 4;
    }
    catch(Exception e)
    { 
      System.out.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer buff) throws Exception
{
   buff.putInt( (int)bitFlags);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 * @return marshalled size
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    bitFlags = buff.getInt();
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final DataFilterRecord rhs = (DataFilterRecord)obj;

     if( ! (bitFlags == rhs.bitFlags)) ivarsEqual = false;
    return ivarsEqual;
 }
} // end of class
