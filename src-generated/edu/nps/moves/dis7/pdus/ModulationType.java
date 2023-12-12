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
 * Information about the type of modulation used for radio transmission. 6.2.59 
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class ModulationType extends Object implements Serializable
{
   /** This field shall indicate the spread spectrum technique or combination of spread spectrum techniques in use. Bit field. 0=freq hopping, 1=psuedo noise, time hopping=2, reamining bits unused */
   protected short spreadSpectrum;

   /** The major classification of the modulation type.  UID 155 */
   protected TransmitterMajorModulation majorModulation = TransmitterMajorModulation.values()[0];

   /** provide certain detailed information depending upon the major modulation type, uid 156-162 */
   protected short detail;

   /** The radio system associated with this Transmitter PDU and shall be used as the basis to interpret other fields whose values depend on a specific radio system. uid =163 */
   protected TransmitterModulationTypeSystem radioSystem = TransmitterModulationTypeSystem.values()[0];


/** Constructor creates and configures a new instance object */
 public ModulationType()
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

   marshalSize += 2;  // spreadSpectrum
   if (majorModulation != null)
       marshalSize += majorModulation.getMarshalledSize();
   marshalSize += 2;  // detail
   if (radioSystem != null)
       marshalSize += radioSystem.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link ModulationType#spreadSpectrum}
  * @param pSpreadSpectrum new value of interest
  * @return same object to permit progressive setters */
public synchronized ModulationType setSpreadSpectrum(short pSpreadSpectrum)
{
    spreadSpectrum = pSpreadSpectrum;
    return this;
}
/** Utility setter for {@link ModulationType#spreadSpectrum}
  * @param pSpreadSpectrum new value of interest
  * @return same object to permit progressive setters */
public synchronized ModulationType setSpreadSpectrum(int pSpreadSpectrum){
    spreadSpectrum = (short) pSpreadSpectrum;
    return this;
}
/** Getter for {@link ModulationType#spreadSpectrum}
  * @return value of interest */
public short getSpreadSpectrum()
{
    return spreadSpectrum; 
}

/** Setter for {@link ModulationType#majorModulation}
  * @param pMajorModulation new value of interest
  * @return same object to permit progressive setters */
public synchronized ModulationType setMajorModulation(TransmitterMajorModulation pMajorModulation)
{
    majorModulation = pMajorModulation;
    return this;
}
/** Getter for {@link ModulationType#majorModulation}
  * @return value of interest */
public TransmitterMajorModulation getMajorModulation()
{
    return majorModulation; 
}

/** Setter for {@link ModulationType#detail}
  * @param pDetail new value of interest
  * @return same object to permit progressive setters */
public synchronized ModulationType setDetail(short pDetail)
{
    detail = pDetail;
    return this;
}
/** Utility setter for {@link ModulationType#detail}
  * @param pDetail new value of interest
  * @return same object to permit progressive setters */
public synchronized ModulationType setDetail(int pDetail){
    detail = (short) pDetail;
    return this;
}
/** Getter for {@link ModulationType#detail}
  * @return value of interest */
public short getDetail()
{
    return detail; 
}

/** Setter for {@link ModulationType#radioSystem}
  * @param pRadioSystem new value of interest
  * @return same object to permit progressive setters */
public synchronized ModulationType setRadioSystem(TransmitterModulationTypeSystem pRadioSystem)
{
    radioSystem = pRadioSystem;
    return this;
}
/** Getter for {@link ModulationType#radioSystem}
  * @return value of interest */
public TransmitterModulationTypeSystem getRadioSystem()
{
    return radioSystem; 
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
       dos.writeShort(spreadSpectrum);
       majorModulation.marshal(dos);
       dos.writeShort(detail);
       radioSystem.marshal(dos);
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
    try 
    {
        spreadSpectrum = (short)dis.readUnsignedShort();
        uPosition += 2;
        majorModulation = TransmitterMajorModulation.unmarshalEnum(dis);
        uPosition += majorModulation.getMarshalledSize();
        detail = (short)dis.readUnsignedShort();
        uPosition += 2;
        radioSystem = TransmitterModulationTypeSystem.unmarshalEnum(dis);
        uPosition += radioSystem.getMarshalledSize();
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
   byteBuffer.putShort( (short)spreadSpectrum);
   majorModulation.marshal(byteBuffer);
   byteBuffer.putShort( (short)detail);
   radioSystem.marshal(byteBuffer);
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
    try
    {
        // attribute spreadSpectrum marked as not serialized
        spreadSpectrum = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute majorModulation marked as not serialized
        majorModulation = TransmitterMajorModulation.unmarshalEnum(byteBuffer);
        // attribute detail marked as not serialized
        detail = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute radioSystem marked as not serialized
        radioSystem = TransmitterModulationTypeSystem.unmarshalEnum(byteBuffer);
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public synchronized boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final ModulationType rhs = (ModulationType)obj;

     if( ! (spreadSpectrum == rhs.spreadSpectrum)) ivarsEqual = false;
     if( ! (majorModulation == rhs.majorModulation)) ivarsEqual = false;
     if( ! (detail == rhs.detail)) ivarsEqual = false;
     if( ! (radioSystem == rhs.radioSystem)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" spreadSpectrum:").append(spreadSpectrum); // writeOneToString
    sb.append(" majorModulation:").append(majorModulation); // writeOneToString
    sb.append(" detail:").append(detail); // writeOneToString
    sb.append(" radioSystem:").append(radioSystem); // writeOneToString

   return sb.toString();
 }
} // end of class
