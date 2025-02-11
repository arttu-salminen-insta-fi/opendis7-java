/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt



package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 6.2.48.2
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class IOCommsNodeRecord extends IORecord implements Serializable
{
   /**  uid 66 Variable Record Type values are defined by VariableRecordType enumerations */
   protected VariableRecordType recordType = VariableRecordType.IO_COMMUNICATIONS_NODE;

   /** recordLength is an undescribed parameter... */
   protected short recordLength;

   /**  uid 294 */
   protected IOCommsNodeRecordCommsNodeType commsNodeType = IOCommsNodeRecordCommsNodeType.values()[0];

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected byte padding;

   /** commsNodeId is an undescribed parameter... */
   protected CommunicationsNodeID  commsNodeId = new CommunicationsNodeID(); 


/** Constructor creates and configures a new instance object */
 public IOCommsNodeRecord()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public synchronized int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (recordType != null)
       marshalSize += recordType.getMarshalledSize();
   marshalSize += 2;  // recordLength
   if (commsNodeType != null)
       marshalSize += commsNodeType.getMarshalledSize();
   marshalSize += 1;  // padding
   if (commsNodeId != null)
       marshalSize += commsNodeId.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link IOCommsNodeRecord#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public synchronized IOCommsNodeRecord setRecordType(VariableRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}
/** Getter for {@link IOCommsNodeRecord#recordType}
  * @return value of interest */
public VariableRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link IOCommsNodeRecord#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public synchronized IOCommsNodeRecord setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link IOCommsNodeRecord#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public synchronized IOCommsNodeRecord setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}
/** Getter for {@link IOCommsNodeRecord#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link IOCommsNodeRecord#commsNodeType}
  * @param pCommsNodeType new value of interest
  * @return same object to permit progressive setters */
public synchronized IOCommsNodeRecord setCommsNodeType(IOCommsNodeRecordCommsNodeType pCommsNodeType)
{
    commsNodeType = pCommsNodeType;
    return this;
}
/** Getter for {@link IOCommsNodeRecord#commsNodeType}
  * @return value of interest */
public IOCommsNodeRecordCommsNodeType getCommsNodeType()
{
    return commsNodeType; 
}

/** Setter for {@link IOCommsNodeRecord#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized IOCommsNodeRecord setPadding(byte pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link IOCommsNodeRecord#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized IOCommsNodeRecord setPadding(int pPadding){
    padding = (byte) pPadding;
    return this;
}
/** Getter for {@link IOCommsNodeRecord#padding}
  * @return value of interest */
public byte getPadding()
{
    return padding; 
}

/** Setter for {@link IOCommsNodeRecord#commsNodeId}
  * @param pCommsNodeId new value of interest
  * @return same object to permit progressive setters */
public synchronized IOCommsNodeRecord setCommsNodeId(CommunicationsNodeID pCommsNodeId)
{
    commsNodeId = pCommsNodeId;
    return this;
}
/** Getter for {@link IOCommsNodeRecord#commsNodeId}
  * @return value of interest */
public CommunicationsNodeID getCommsNodeId()
{
    return commsNodeId;
}


/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       recordType.marshal(dos);
       dos.writeShort(recordLength);
       commsNodeType.marshal(dos);
       dos.writeByte(padding);
       commsNodeId.marshal(dos);
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
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        recordType = VariableRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        commsNodeType = IOCommsNodeRecordCommsNodeType.unmarshalEnum(dis);
        uPosition += commsNodeType.getMarshalledSize();
        padding = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += commsNodeId.unmarshal(dis);
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
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   recordType.marshal(byteBuffer);
   byteBuffer.putShort( (short)recordLength);
   commsNodeType.marshal(byteBuffer);
   byteBuffer.put( (byte)padding);
   commsNodeId.marshal(byteBuffer);
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
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute recordType marked as not serialized
        recordType = VariableRecordType.unmarshalEnum(byteBuffer);
        // attribute recordLength marked as not serialized
        recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute commsNodeType marked as not serialized
        commsNodeType = IOCommsNodeRecordCommsNodeType.unmarshalEnum(byteBuffer);
        // attribute padding marked as not serialized
        padding = (byte)(byteBuffer.get() & 0xFF);
        // attribute commsNodeId marked as not serialized
        commsNodeId.unmarshal(byteBuffer);
    }
    catch (java.nio.BufferUnderflowException bue)
    {
        System.err.println("*** buffer underflow error while unmarshalling " + this.getClass().getName());
    }
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public synchronized boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

@Override
 public synchronized boolean equalsImpl(Object obj)
 {
     final IOCommsNodeRecord rhs = (IOCommsNodeRecord)obj;

     if( ! (recordType == rhs.recordType)) return false;
     if( ! (recordLength == rhs.recordLength)) return false;
     if( ! (commsNodeType == rhs.commsNodeType)) return false;
     if( ! (padding == rhs.padding)) return false;
     if( ! Objects.equals(commsNodeId, rhs.commsNodeId) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" recordType:").append(recordType); // writeOneToString
    sb.append(" recordLength:").append(recordLength); // writeOneToString
    sb.append(" commsNodeType:").append(commsNodeType); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" commsNodeId:").append(commsNodeId); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.recordType,
	                     this.recordLength,
	                     this.commsNodeType,
	                     this.padding,
	                     this.commsNodeId);
 }
} // end of IOCommsNodeRecord
