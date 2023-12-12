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
 * Information about an entity's engine fuel. Section 6.2.84.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class StorageFuel extends Object implements Serializable
{
   /** Fuel quantity, units specified by next field */
   protected int fuelQuantity;

   /** Units in which the fuel is measured uid 328 */
   protected FuelMeasurementUnits fuelMeasurementUnits = FuelMeasurementUnits.values()[0];

   /** Type of fuel uid 413 */
   protected SupplyFuelType fuelType = SupplyFuelType.values()[0];

   /** Location of fuel as related to entity. See section 14 of EBV document uid 329 */
   protected FuelLocation fuelLocation = FuelLocation.values()[0];

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected byte padding = (byte)0;


/** Constructor creates and configures a new instance object */
 public StorageFuel()
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

   marshalSize += 4;  // fuelQuantity
   if (fuelMeasurementUnits != null)
       marshalSize += fuelMeasurementUnits.getMarshalledSize();
   if (fuelType != null)
       marshalSize += fuelType.getMarshalledSize();
   if (fuelLocation != null)
       marshalSize += fuelLocation.getMarshalledSize();
   marshalSize += 1;  // padding

   return marshalSize;
}


/** Setter for {@link StorageFuel#fuelQuantity}
  * @param pFuelQuantity new value of interest
  * @return same object to permit progressive setters */
public synchronized StorageFuel setFuelQuantity(int pFuelQuantity)
{
    fuelQuantity = pFuelQuantity;
    return this;
}
/** Getter for {@link StorageFuel#fuelQuantity}
  * @return value of interest */
public int getFuelQuantity()
{
    return fuelQuantity; 
}

/** Setter for {@link StorageFuel#fuelMeasurementUnits}
  * @param pFuelMeasurementUnits new value of interest
  * @return same object to permit progressive setters */
public synchronized StorageFuel setFuelMeasurementUnits(FuelMeasurementUnits pFuelMeasurementUnits)
{
    fuelMeasurementUnits = pFuelMeasurementUnits;
    return this;
}
/** Getter for {@link StorageFuel#fuelMeasurementUnits}
  * @return value of interest */
public FuelMeasurementUnits getFuelMeasurementUnits()
{
    return fuelMeasurementUnits; 
}

/** Setter for {@link StorageFuel#fuelType}
  * @param pFuelType new value of interest
  * @return same object to permit progressive setters */
public synchronized StorageFuel setFuelType(SupplyFuelType pFuelType)
{
    fuelType = pFuelType;
    return this;
}
/** Getter for {@link StorageFuel#fuelType}
  * @return value of interest */
public SupplyFuelType getFuelType()
{
    return fuelType; 
}

/** Setter for {@link StorageFuel#fuelLocation}
  * @param pFuelLocation new value of interest
  * @return same object to permit progressive setters */
public synchronized StorageFuel setFuelLocation(FuelLocation pFuelLocation)
{
    fuelLocation = pFuelLocation;
    return this;
}
/** Getter for {@link StorageFuel#fuelLocation}
  * @return value of interest */
public FuelLocation getFuelLocation()
{
    return fuelLocation; 
}

/** Setter for {@link StorageFuel#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized StorageFuel setPadding(byte pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link StorageFuel#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized StorageFuel setPadding(int pPadding){
    padding = (byte) pPadding;
    return this;
}
/** Getter for {@link StorageFuel#padding}
  * @return value of interest */
public byte getPadding()
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
       dos.writeInt(fuelQuantity);
       fuelMeasurementUnits.marshal(dos);
       fuelType.marshal(dos);
       fuelLocation.marshal(dos);
       dos.writeByte(padding);
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
        fuelQuantity = dis.readInt();
        uPosition += 4;
        fuelMeasurementUnits = FuelMeasurementUnits.unmarshalEnum(dis);
        uPosition += fuelMeasurementUnits.getMarshalledSize();
        fuelType = SupplyFuelType.unmarshalEnum(dis);
        uPosition += fuelType.getMarshalledSize();
        fuelLocation = FuelLocation.unmarshalEnum(dis);
        uPosition += fuelLocation.getMarshalledSize();
        padding = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
   byteBuffer.putInt( (int)fuelQuantity);
   fuelMeasurementUnits.marshal(byteBuffer);
   fuelType.marshal(byteBuffer);
   fuelLocation.marshal(byteBuffer);
   byteBuffer.put( (byte)padding);
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
        // attribute fuelQuantity marked as not serialized
        fuelQuantity = byteBuffer.getInt();
        // attribute fuelMeasurementUnits marked as not serialized
        fuelMeasurementUnits = FuelMeasurementUnits.unmarshalEnum(byteBuffer);
        // attribute fuelType marked as not serialized
        fuelType = SupplyFuelType.unmarshalEnum(byteBuffer);
        // attribute fuelLocation marked as not serialized
        fuelLocation = FuelLocation.unmarshalEnum(byteBuffer);
        // attribute padding marked as not serialized
        padding = (byte)(byteBuffer.get() & 0xFF);
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

     final StorageFuel rhs = (StorageFuel)obj;

     if( ! (fuelQuantity == rhs.fuelQuantity)) ivarsEqual = false;
     if( ! (fuelMeasurementUnits == rhs.fuelMeasurementUnits)) ivarsEqual = false;
     if( ! (fuelType == rhs.fuelType)) ivarsEqual = false;
     if( ! (fuelLocation == rhs.fuelLocation)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" fuelQuantity:").append(fuelQuantity); // writeOneToString
    sb.append(" fuelMeasurementUnits:").append(fuelMeasurementUnits); // writeOneToString
    sb.append(" fuelType:").append(fuelType); // writeOneToString
    sb.append(" fuelLocation:").append(fuelLocation); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString

   return sb.toString();
 }
} // end of class
