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
import java.nio.ByteBuffer;

/**
 * 5.12.4.3 Contains the same information as found in the Remove Entity PDU with the addition of the level of reliability service to be used for the removal action being requested.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class RemoveEntityRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{
   /** level of reliability service used for this transaction uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** pad1 is an undescribed parameter... */
   protected byte pad1;

   /** pad2 is an undescribed parameter... */
   protected short pad2;

   /** Request ID provides a unique identifier */
   protected int requestID;


/** Constructor creates and configures a new instance object */
 public RemoveEntityRPdu()
 {
    setPduType( DisPduType.REMOVE_ENTITY_RELIABLE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized RemoveEntityRPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized RemoveEntityRPdu copyByteBuffer()
 {
     RemoveEntityRPdu newCopy = new RemoveEntityRPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("RemoveEntityRPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
     return newCopy;
 }

/** byteArrayOutputStream (baos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/** dataOutputStream (dos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected DataOutputStream      dataOutputStream      = new DataOutputStream(byteArrayOutputStream);

/** copy method creates a deep copy of current object using DataOutputStream methods.
 * @return deep copy of PDU */
 public synchronized RemoveEntityRPdu copyDataOutputStream()
 {
     RemoveEntityRPdu newCopy = new RemoveEntityRPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("RemoveEntityRPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.out.println("RemoveEntityRPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (requiredReliabilityService != null)
       marshalSize += requiredReliabilityService.getMarshalledSize();
   marshalSize += 1;  // pad1
   marshalSize += 2;  // pad2
   marshalSize += 4;  // requestID

   return marshalSize;
}


/** Setter for {@link RemoveEntityRPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public synchronized RemoveEntityRPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}
/** Getter for {@link RemoveEntityRPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link RemoveEntityRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public synchronized RemoveEntityRPdu setPad1(byte pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Utility setter for {@link RemoveEntityRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public synchronized RemoveEntityRPdu setPad1(int pPad1){
    pad1 = (byte) pPad1;
    return this;
}
/** Getter for {@link RemoveEntityRPdu#pad1}
  * @return value of interest */
public byte getPad1()
{
    return pad1; 
}

/** Setter for {@link RemoveEntityRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public synchronized RemoveEntityRPdu setPad2(short pPad2)
{
    pad2 = pPad2;
    return this;
}
/** Utility setter for {@link RemoveEntityRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public synchronized RemoveEntityRPdu setPad2(int pPad2){
    pad2 = (short) pPad2;
    return this;
}
/** Getter for {@link RemoveEntityRPdu#pad2}
  * @return value of interest */
public short getPad2()
{
    return pad2; 
}

/** Setter for {@link RemoveEntityRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized RemoveEntityRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link RemoveEntityRPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       requiredReliabilityService.marshal(dos);
       dos.writeByte(pad1);
       dos.writeShort(pad2);
       dos.writeInt(requestID);
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
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        pad1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        requestID = dis.readInt();
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
   super.marshal(byteBuffer);
   requiredReliabilityService.marshal(byteBuffer);
   byteBuffer.put( (byte)pad1);
   byteBuffer.putShort( (short)pad2);
   byteBuffer.putInt( (int)requestID);
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
        // attribute requiredReliabilityService marked as not serialized
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
        // attribute pad1 marked as not serialized
        pad1 = (byte)(byteBuffer.get() & 0xFF);
        // attribute pad2 marked as not serialized
        pad2 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute requestID marked as not serialized
        requestID = byteBuffer.getInt();
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
     boolean ivarsEqual = true;

     final RemoveEntityRPdu rhs = (RemoveEntityRPdu)obj;

     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (pad2 == rhs.pad2)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" requiredReliabilityService:").append(requiredReliabilityService); // writeOneToString
    sb.append(" pad1:").append(pad1); // writeOneToString
    sb.append(" pad2:").append(pad2); // writeOneToString
    sb.append(" requestID:").append(requestID); // writeOneToString

   return sb.toString();
 }
} // end of class
