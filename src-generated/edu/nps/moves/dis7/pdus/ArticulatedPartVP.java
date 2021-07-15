/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 *  articulated parts for movable parts and a combination of moveable/attached parts of an entity. Section 6.2.94.2
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ArticulatedPartVP extends Object implements Serializable
{
   /** The identification of the Variable Parameter record. Enumeration from EBV uid 56 */
   protected VariableParameterRecordType recordType = VariableParameterRecordType.ARTICULATED_PART;

   /** indicate the change of any parameter for any articulated part. Starts at zero, incremented for each change  */
   protected byte  changeIndicator = (byte)0;

   /** The identification of the articulated part to which this articulation parameter is attached. This field shall be specified by a 16-bit unsigned integer. This field shall contain the value zero if the articulated part is attached directly to the entity. */
   protected short  partAttachedTo = (short)0;

   /** The type of parameter represented, 32-bit enumeration */
   protected int  parameterType;

   /** The definition of the 64-bits shall be determined based on the type of parameter specified in the Parameter Type field  */
   protected float  parameterValue;

   /** padding is an undescribed parameter... */
   protected int  padding;


/** Constructor */
 public ArticulatedPartVP()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += recordType.getMarshalledSize();
   marshalSize += 1;  // changeIndicator
   marshalSize += 2;  // partAttachedTo
   marshalSize += 4;  // parameterType
   marshalSize += 4;  // parameterValue
   marshalSize += 4;  // padding

   return marshalSize;
}


/** Setter for {@link ArticulatedPartVP#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setRecordType(VariableParameterRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link ArticulatedPartVP#recordType}
  * @return value of interest */
public VariableParameterRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link ArticulatedPartVP#changeIndicator}
  * @param pChangeIndicator new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setChangeIndicator(byte pChangeIndicator)
{
    changeIndicator = pChangeIndicator;
    return this;
}
/** Utility setter for {@link ArticulatedPartVP#changeIndicator}
  * @param pChangeIndicator new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setChangeIndicator(int pChangeIndicator){
    changeIndicator = (byte) pChangeIndicator;
    return this;
}

/** Getter for {@link ArticulatedPartVP#changeIndicator}
  * @return value of interest */
public byte getChangeIndicator()
{
    return changeIndicator; 
}

/** Setter for {@link ArticulatedPartVP#partAttachedTo}
  * @param pPartAttachedTo new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setPartAttachedTo(short pPartAttachedTo)
{
    partAttachedTo = pPartAttachedTo;
    return this;
}
/** Utility setter for {@link ArticulatedPartVP#partAttachedTo}
  * @param pPartAttachedTo new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setPartAttachedTo(int pPartAttachedTo){
    partAttachedTo = (short) pPartAttachedTo;
    return this;
}

/** Getter for {@link ArticulatedPartVP#partAttachedTo}
  * @return value of interest */
public short getPartAttachedTo()
{
    return partAttachedTo; 
}

/** Setter for {@link ArticulatedPartVP#parameterType}
  * @param pParameterType new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setParameterType(int pParameterType)
{
    parameterType = pParameterType;
    return this;
}

/** Getter for {@link ArticulatedPartVP#parameterType}
  * @return value of interest */
public int getParameterType()
{
    return parameterType; 
}

/** Setter for {@link ArticulatedPartVP#parameterValue}
  * @param pParameterValue new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setParameterValue(float pParameterValue)
{
    parameterValue = pParameterValue;
    return this;
}

/** Getter for {@link ArticulatedPartVP#parameterValue}
  * @return value of interest */
public float getParameterValue()
{
    return parameterValue; 
}

/** Setter for {@link ArticulatedPartVP#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public ArticulatedPartVP setPadding(int pPadding)
{
    padding = pPadding;
    return this;
}

/** Getter for {@link ArticulatedPartVP#padding}
  * @return value of interest */
public int getPadding()
{
    return padding; 
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
       recordType.marshal(dos);
       dos.writeByte(changeIndicator);
       dos.writeShort(partAttachedTo);
       dos.writeInt(parameterType);
       dos.writeFloat(parameterValue);
       dos.writeInt(padding);
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
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        recordType = VariableParameterRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        changeIndicator = (byte)dis.readUnsignedByte();
        uPosition += 1;
        partAttachedTo = (short)dis.readUnsignedShort();
        uPosition += 2;
        parameterType = dis.readInt();
        uPosition += 4;
        parameterValue = dis.readFloat();
        uPosition += 4;
        padding = dis.readInt();
        uPosition += 4;
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
   recordType.marshal(byteBuffer);
   byteBuffer.put( (byte)changeIndicator);
   byteBuffer.putShort( (short)partAttachedTo);
   byteBuffer.putInt( (int)parameterType);
   byteBuffer.putFloat( (float)parameterValue);
   byteBuffer.putInt( (int)padding);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    recordType = VariableParameterRecordType.unmarshalEnum(byteBuffer);
    changeIndicator = (byte)(byteBuffer.get() & 0xFF);
    partAttachedTo = (short)(byteBuffer.getShort() & 0xFFFF);
    parameterType = byteBuffer.getInt();
    parameterValue = byteBuffer.getFloat();
    padding = byteBuffer.getInt();
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

     final ArticulatedPartVP rhs = (ArticulatedPartVP)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (changeIndicator == rhs.changeIndicator)) ivarsEqual = false;
     if( ! (partAttachedTo == rhs.partAttachedTo)) ivarsEqual = false;
     if( ! (parameterType == rhs.parameterType)) ivarsEqual = false;
     if( ! (parameterValue == rhs.parameterValue)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" changeIndicator: ").append(changeIndicator).append("\n");
    sb.append(" partAttachedTo: ").append(partAttachedTo).append("\n");
    sb.append(" parameterType: ").append(parameterType).append("\n");
    sb.append(" parameterValue: ").append(parameterValue).append("\n");
    sb.append(" padding: ").append(padding).append("\n");

   return sb.toString();
 }
} // end of class
