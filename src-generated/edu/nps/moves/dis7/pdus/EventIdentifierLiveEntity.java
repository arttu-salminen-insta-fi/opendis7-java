/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Identifies an event in the world. Use this format for ONLY the LiveEntityPdu. Section 6.2.34.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class EventIdentifierLiveEntity extends Object implements Serializable
{
   protected byte  siteNumber;

   protected byte  applicationNumber;

   protected short  eventNumber;


/** Constructor */
 public EventIdentifierLiveEntity()
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

   marshalSize += 1;  // siteNumber
   marshalSize += 1;  // applicationNumber
   marshalSize += 2;  // eventNumber

   return marshalSize;
}


/** Setter for {@link EventIdentifierLiveEntity#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public EventIdentifierLiveEntity setSiteNumber(byte pSiteNumber)
{
    siteNumber = pSiteNumber;
    return this;
}
/** Utility setter for {@link EventIdentifierLiveEntity#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public EventIdentifierLiveEntity setSiteNumber(int pSiteNumber){
    siteNumber = (byte) pSiteNumber;
    return this;
}

/** Getter for {@link EventIdentifierLiveEntity#siteNumber}
  * @return value of interest */
public byte getSiteNumber()
{
    return siteNumber; 
}

/** Setter for {@link EventIdentifierLiveEntity#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public EventIdentifierLiveEntity setApplicationNumber(byte pApplicationNumber)
{
    applicationNumber = pApplicationNumber;
    return this;
}
/** Utility setter for {@link EventIdentifierLiveEntity#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public EventIdentifierLiveEntity setApplicationNumber(int pApplicationNumber){
    applicationNumber = (byte) pApplicationNumber;
    return this;
}

/** Getter for {@link EventIdentifierLiveEntity#applicationNumber}
  * @return value of interest */
public byte getApplicationNumber()
{
    return applicationNumber; 
}

/** Setter for {@link EventIdentifierLiveEntity#eventNumber}
  * @param pEventNumber new value of interest
  * @return same object to permit progressive setters */
public EventIdentifierLiveEntity setEventNumber(short pEventNumber)
{
    eventNumber = pEventNumber;
    return this;
}
/** Utility setter for {@link EventIdentifierLiveEntity#eventNumber}
  * @param pEventNumber new value of interest
  * @return same object to permit progressive setters */
public EventIdentifierLiveEntity setEventNumber(int pEventNumber){
    eventNumber = (short) pEventNumber;
    return this;
}

/** Getter for {@link EventIdentifierLiveEntity#eventNumber}
  * @return value of interest */
public short getEventNumber()
{
    return eventNumber; 
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
       dos.writeByte(siteNumber);
       dos.writeByte(applicationNumber);
       dos.writeShort(eventNumber);
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
        siteNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        applicationNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        eventNumber = (short)dis.readUnsignedShort();
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
   byteBuffer.put( (byte)siteNumber);
   byteBuffer.put( (byte)applicationNumber);
   byteBuffer.putShort( (short)eventNumber);
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
    siteNumber = (byte)(byteBuffer.get() & 0xFF);
    applicationNumber = (byte)(byteBuffer.get() & 0xFF);
    eventNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final EventIdentifierLiveEntity rhs = (EventIdentifierLiveEntity)obj;

     if( ! (siteNumber == rhs.siteNumber)) ivarsEqual = false;
     if( ! (applicationNumber == rhs.applicationNumber)) ivarsEqual = false;
     if( ! (eventNumber == rhs.eventNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" siteNumber: ").append(siteNumber).append("\n");
    sb.append(" applicationNumber: ").append(applicationNumber).append("\n");
    sb.append(" eventNumber: ").append(eventNumber).append("\n");

   return sb.toString();
 }
} // end of class