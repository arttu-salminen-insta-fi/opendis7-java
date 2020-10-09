/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Additional operational data for an IFF emitting system and the number of IFF Fundamental Parameter Data records Section 6.2.76.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class SecondaryOperationalData extends Object implements Serializable
{
   /** additional operational characteristics of the IFF emitting system. Each 8-bit field will vary depending on the system type. */
   protected byte  operationalData1;

   /** additional operational characteristics of the IFF emitting system. Each 8-bit field will vary depending on the system type. */
   protected byte  operationalData2;

   /** The number of IFF Fundamental Parameter Data records that follow */
   protected short  numberOfIFFFundamentalParameterRecords;


/** Constructor */
 public SecondaryOperationalData()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 1;  // operationalData1
   marshalSize += 1;  // operationalData2
   marshalSize += 2;  // numberOfIFFFundamentalParameterRecords

   return marshalSize;
}


/** Setter for {@link SecondaryOperationalData#operationalData1}
  * @param pOperationalData1 new value of interest
  * @return same object to permit progressive setters */
public SecondaryOperationalData setOperationalData1(byte pOperationalData1)
{
    operationalData1 = pOperationalData1;
    return this;
}
/** Utility setter for {@link SecondaryOperationalData#operationalData1}
  * @param pOperationalData1 new value of interest
  * @return same object to permit progressive setters */
public SecondaryOperationalData setOperationalData1(int pOperationalData1){
    operationalData1 = (byte) pOperationalData1;
    return this;
}

/** Getter for {@link SecondaryOperationalData#operationalData1}
  * @return value of interest */
public byte getOperationalData1()
{
    return operationalData1; 
}

/** Setter for {@link SecondaryOperationalData#operationalData2}
  * @param pOperationalData2 new value of interest
  * @return same object to permit progressive setters */
public SecondaryOperationalData setOperationalData2(byte pOperationalData2)
{
    operationalData2 = pOperationalData2;
    return this;
}
/** Utility setter for {@link SecondaryOperationalData#operationalData2}
  * @param pOperationalData2 new value of interest
  * @return same object to permit progressive setters */
public SecondaryOperationalData setOperationalData2(int pOperationalData2){
    operationalData2 = (byte) pOperationalData2;
    return this;
}

/** Getter for {@link SecondaryOperationalData#operationalData2}
  * @return value of interest */
public byte getOperationalData2()
{
    return operationalData2; 
}

/** Setter for {@link SecondaryOperationalData#numberOfIFFFundamentalParameterRecords}
  * @param pNumberOfIFFFundamentalParameterRecords new value of interest
  * @return same object to permit progressive setters */
public SecondaryOperationalData setNumberOfIFFFundamentalParameterRecords(short pNumberOfIFFFundamentalParameterRecords)
{
    numberOfIFFFundamentalParameterRecords = pNumberOfIFFFundamentalParameterRecords;
    return this;
}
/** Utility setter for {@link SecondaryOperationalData#numberOfIFFFundamentalParameterRecords}
  * @param pNumberOfIFFFundamentalParameterRecords new value of interest
  * @return same object to permit progressive setters */
public SecondaryOperationalData setNumberOfIFFFundamentalParameterRecords(int pNumberOfIFFFundamentalParameterRecords){
    numberOfIFFFundamentalParameterRecords = (short) pNumberOfIFFFundamentalParameterRecords;
    return this;
}

/** Getter for {@link SecondaryOperationalData#numberOfIFFFundamentalParameterRecords}
  * @return value of interest */
public short getNumberOfIFFFundamentalParameterRecords()
{
    return numberOfIFFFundamentalParameterRecords; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeByte(operationalData1);
       dos.writeByte(operationalData2);
       dos.writeShort(numberOfIFFFundamentalParameterRecords);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        operationalData1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        operationalData2 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfIFFFundamentalParameterRecords = (short)dis.readUnsignedShort();
        uPosition += 2;
    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   byteBuffer.put( (byte)operationalData1);
   byteBuffer.put( (byte)operationalData2);
   byteBuffer.putShort( (short)numberOfIFFFundamentalParameterRecords);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    operationalData1 = (byte)(byteBuffer.get() & 0xFF);
    operationalData2 = (byte)(byteBuffer.get() & 0xFF);
    numberOfIFFFundamentalParameterRecords = (short)(byteBuffer.getShort() & 0xFFFF);
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

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
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

     final SecondaryOperationalData rhs = (SecondaryOperationalData)obj;

     if( ! (operationalData1 == rhs.operationalData1)) ivarsEqual = false;
     if( ! (operationalData2 == rhs.operationalData2)) ivarsEqual = false;
     if( ! (numberOfIFFFundamentalParameterRecords == rhs.numberOfIFFFundamentalParameterRecords)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" operationalData1: ").append(operationalData1).append("\n");
    sb.append(" operationalData2: ").append(operationalData2).append("\n");
    sb.append(" numberOfIFFFundamentalParameterRecords: ").append(numberOfIFFFundamentalParameterRecords).append("\n");

   return sb.toString();
 }
} // end of class