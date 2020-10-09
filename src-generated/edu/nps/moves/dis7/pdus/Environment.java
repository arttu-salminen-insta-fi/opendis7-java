/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 *  Information about a geometry, a state associated with a geometry, a bounding volume, or an associated entity ID.  6.2.31, not fully defined. 'The current definitions can be found in DIS PCR 240'
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class Environment extends Object implements Serializable
{
   /** Record type uid 250 */
   protected EnvironmentalProcessRecordType environmentType = EnvironmentalProcessRecordType.values()[0];

   /** length, in bits */
   protected short  length;

   /** Identify the sequentially numbered record index */
   protected byte  index;

   /** padding */
   protected byte  padding1;

   /** Geometry or state record */
   protected byte[]  geometry = new byte[0]; 

   private byte[] padding2 = new byte[0]; // pad to 64-bit boundary


/** Constructor */
 public Environment()
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

   marshalSize += environmentType.getMarshalledSize();
   marshalSize += 2;  // length
   marshalSize += 1;  // index
   marshalSize += 1;  // padding1
   marshalSize += geometry.length * 1;
   marshalSize += padding2.length;

   return marshalSize;
}


/** Setter for {@link Environment#environmentType}
  * @param pEnvironmentType new value of interest
  * @return same object to permit progressive setters */
public Environment setEnvironmentType(EnvironmentalProcessRecordType pEnvironmentType)
{
    environmentType = pEnvironmentType;
    return this;
}

/** Getter for {@link Environment#environmentType}
  * @return value of interest */
public EnvironmentalProcessRecordType getEnvironmentType()
{
    return environmentType; 
}

/** Setter for {@link Environment#length}
  * @param pLength new value of interest
  * @return same object to permit progressive setters */
public Environment setLength(short pLength)
{
    length = pLength;
    return this;
}
/** Utility setter for {@link Environment#length}
  * @param pLength new value of interest
  * @return same object to permit progressive setters */
public Environment setLength(int pLength){
    length = (short) pLength;
    return this;
}

/** Getter for {@link Environment#length}
  * @return value of interest */
public short getLength()
{
    return length; 
}

/** Setter for {@link Environment#index}
  * @param pIndex new value of interest
  * @return same object to permit progressive setters */
public Environment setIndex(byte pIndex)
{
    index = pIndex;
    return this;
}
/** Utility setter for {@link Environment#index}
  * @param pIndex new value of interest
  * @return same object to permit progressive setters */
public Environment setIndex(int pIndex){
    index = (byte) pIndex;
    return this;
}

/** Getter for {@link Environment#index}
  * @return value of interest */
public byte getIndex()
{
    return index; 
}

/** Setter for {@link Environment#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public Environment setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link Environment#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public Environment setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}

/** Getter for {@link Environment#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link Environment#geometry}
  * @param pGeometry new value of interest
  * @return same object to permit progressive setters */
public Environment setGeometry(byte[] pGeometry)
{
    geometry = pGeometry;
    return this;
}

/** Getter for {@link Environment#geometry}
  * @return value of interest */
public byte[] getGeometry()
{
    return geometry; 
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
       environmentType.marshal(dos);
       dos.writeShort(length);
       dos.writeByte(index);
       dos.writeByte(padding1);

       for(int idx = 0; idx < geometry.length; idx++)
           dos.writeByte(geometry[idx]);

       padding2 = new byte[Align.to64bits(dos)];
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
        environmentType = EnvironmentalProcessRecordType.unmarshalEnum(dis);
        uPosition += environmentType.getMarshalledSize();
        length = (short)dis.readUnsignedShort();
        uPosition += 2;
        index = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        for(int idx = 0; idx < geometry.length; idx++)
            geometry[idx] = dis.readByte();
        uPosition += (geometry.length * 1);
        padding2 = new byte[Align.from64bits(uPosition,dis)];
        uPosition += padding2.length;
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
   environmentType.marshal(byteBuffer);
   byteBuffer.putShort( (short)length);
   byteBuffer.put( (byte)index);
   byteBuffer.put( (byte)padding1);

   for(int idx = 0; idx < geometry.length; idx++)
       byteBuffer.put((byte)geometry[idx]);

   padding2 = new byte[Align.to64bits(byteBuffer)];
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
    environmentType = EnvironmentalProcessRecordType.unmarshalEnum(byteBuffer);
    length = (short)(byteBuffer.getShort() & 0xFFFF);
    index = (byte)(byteBuffer.get() & 0xFF);
    padding1 = (byte)(byteBuffer.get() & 0xFF);
    for(int idx = 0; idx < geometry.length; idx++)
        geometry[idx] = byteBuffer.get();
    padding2 = new byte[Align.from64bits(byteBuffer)];
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

     final Environment rhs = (Environment)obj;

     if( ! (environmentType == rhs.environmentType)) ivarsEqual = false;
     if( ! (length == rhs.length)) ivarsEqual = false;
     if( ! (index == rhs.index)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;

     for(int idx = 0; idx < 0; idx++)
     {
          if(!(geometry[idx] == rhs.geometry[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" environmentType: ").append(environmentType).append("\n");
    sb.append(" length: ").append(length).append("\n");
    sb.append(" index: ").append(index).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" geometry: ").append("\n");
    sb.append(Arrays.toString(geometry)).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");

   return sb.toString();
 }
} // end of class