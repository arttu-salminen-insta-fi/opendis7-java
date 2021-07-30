/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Section 7.5.5. Stop or freeze an enity or exercise. See 5.6.5.5
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class StopFreezePdu extends SimulationManagementFamilyPdu implements Serializable
{
   /** real-world(UTC) time at which the entity shall stop or freeze in the exercise */
   protected ClockTime  realWorldTime = new ClockTime(); 

   /** Reason the simulation was stopped or frozen (see section 7 of SISO-REF-010) represented by an 8-bit enumeration uid 67 */
   protected StopFreezeReason reason = StopFreezeReason.values()[0];

   /** Internal behavior of the entity(or simulation) and its appearance while frozen to the other participants uid 68 */
   protected StopFreezeFrozenBehavior frozenBehavior = new StopFreezeFrozenBehavior();

   /** padding */
   protected short  padding1 = (short)0;

   /** Request ID that is unique */
   protected int  requestID;


/** Constructor */
 public StopFreezePdu()
 {
    setPduType( DisPduType.STOP_FREEZE );
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
   marshalSize += realWorldTime.getMarshalledSize();
   marshalSize += reason.getMarshalledSize();
   marshalSize += frozenBehavior.getMarshalledSize();
   marshalSize += 2;  // padding1
   marshalSize += 4;  // requestID

   return marshalSize;
}


/** Setter for {@link StopFreezePdu#realWorldTime}
  * @param pRealWorldTime new value of interest
  * @return same object to permit progressive setters */
public StopFreezePdu setRealWorldTime(ClockTime pRealWorldTime)
{
    realWorldTime = pRealWorldTime;
    return this;
}

/** Getter for {@link StopFreezePdu#realWorldTime}
  * @return value of interest */
public ClockTime getRealWorldTime()
{
    return realWorldTime; 
}

/** Setter for {@link StopFreezePdu#reason}
  * @param pReason new value of interest
  * @return same object to permit progressive setters */
public StopFreezePdu setReason(StopFreezeReason pReason)
{
    reason = pReason;
    return this;
}

/** Getter for {@link StopFreezePdu#reason}
  * @return value of interest */
public StopFreezeReason getReason()
{
    return reason; 
}

/** Setter for {@link StopFreezePdu#frozenBehavior}
  * @param pFrozenBehavior new value of interest
  * @return same object to permit progressive setters */
public StopFreezePdu setFrozenBehavior(StopFreezeFrozenBehavior pFrozenBehavior)
{
    frozenBehavior = pFrozenBehavior;
    return this;
}

/** Getter for {@link StopFreezePdu#frozenBehavior}
  * @return value of interest */
public StopFreezeFrozenBehavior getFrozenBehavior()
{
    return frozenBehavior; 
}

/** Setter for {@link StopFreezePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public StopFreezePdu setPadding1(short pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link StopFreezePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public StopFreezePdu setPadding1(int pPadding1){
    padding1 = (short) pPadding1;
    return this;
}

/** Getter for {@link StopFreezePdu#padding1}
  * @return value of interest */
public short getPadding1()
{
    return padding1; 
}

/** Setter for {@link StopFreezePdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public StopFreezePdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}

/** Getter for {@link StopFreezePdu#requestID}
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
       realWorldTime.marshal(dos);
       reason.marshal(dos);
       frozenBehavior.marshal(dos);
       dos.writeShort(padding1);
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
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += realWorldTime.unmarshal(dis);
        reason = StopFreezeReason.unmarshalEnum(dis);
        uPosition += reason.getMarshalledSize();
        uPosition += frozenBehavior.unmarshal(dis);
        padding1 = (short)dis.readUnsignedShort();
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
   realWorldTime.marshal(byteBuffer);
   reason.marshal(byteBuffer);
   frozenBehavior.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding1);
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
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    realWorldTime.unmarshal(byteBuffer);
    reason = StopFreezeReason.unmarshalEnum(byteBuffer);
    frozenBehavior.unmarshal(byteBuffer);
    padding1 = (short)(byteBuffer.getShort() & 0xFFFF);
    requestID = byteBuffer.getInt();
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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final StopFreezePdu rhs = (StopFreezePdu)obj;

     if( ! (realWorldTime.equals( rhs.realWorldTime) )) ivarsEqual = false;
     if( ! (reason == rhs.reason)) ivarsEqual = false;
     if( ! (frozenBehavior.equals( rhs.frozenBehavior) )) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" realWorldTime: ").append(realWorldTime).append("\n");
    sb.append(" reason: ").append(reason).append("\n");
    sb.append(" frozenBehavior: ").append(frozenBehavior).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" requestID: ").append(requestID).append("\n");

   return sb.toString();
 }
} // end of class
