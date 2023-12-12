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
 * Grid axis record for fixed data. Section 6.2.41
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class GridAxisDescriptorFixed extends GridAxisDescriptor implements Serializable
{
   /** Number of grid locations along Xi axis */
   protected short numberOfPointsOnXiAxis;

   /** initial grid point for the current pdu */
   protected short initialIndex;


/** Constructor creates and configures a new instance object */
 public GridAxisDescriptorFixed()
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

   marshalSize = super.getMarshalledSize();
   marshalSize += 2;  // numberOfPointsOnXiAxis
   marshalSize += 2;  // initialIndex

   return marshalSize;
}


/** Setter for {@link GridAxisDescriptorFixed#numberOfPointsOnXiAxis}
  * @param pNumberOfPointsOnXiAxis new value of interest
  * @return same object to permit progressive setters */
public synchronized GridAxisDescriptorFixed setNumberOfPointsOnXiAxis(short pNumberOfPointsOnXiAxis)
{
    numberOfPointsOnXiAxis = pNumberOfPointsOnXiAxis;
    return this;
}
/** Utility setter for {@link GridAxisDescriptorFixed#numberOfPointsOnXiAxis}
  * @param pNumberOfPointsOnXiAxis new value of interest
  * @return same object to permit progressive setters */
public synchronized GridAxisDescriptorFixed setNumberOfPointsOnXiAxis(int pNumberOfPointsOnXiAxis){
    numberOfPointsOnXiAxis = (short) pNumberOfPointsOnXiAxis;
    return this;
}
/** Getter for {@link GridAxisDescriptorFixed#numberOfPointsOnXiAxis}
  * @return value of interest */
public short getNumberOfPointsOnXiAxis()
{
    return numberOfPointsOnXiAxis; 
}

/** Setter for {@link GridAxisDescriptorFixed#initialIndex}
  * @param pInitialIndex new value of interest
  * @return same object to permit progressive setters */
public synchronized GridAxisDescriptorFixed setInitialIndex(short pInitialIndex)
{
    initialIndex = pInitialIndex;
    return this;
}
/** Utility setter for {@link GridAxisDescriptorFixed#initialIndex}
  * @param pInitialIndex new value of interest
  * @return same object to permit progressive setters */
public synchronized GridAxisDescriptorFixed setInitialIndex(int pInitialIndex){
    initialIndex = (short) pInitialIndex;
    return this;
}
/** Getter for {@link GridAxisDescriptorFixed#initialIndex}
  * @return value of interest */
public short getInitialIndex()
{
    return initialIndex; 
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
       dos.writeShort(numberOfPointsOnXiAxis);
       dos.writeShort(initialIndex);
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
        numberOfPointsOnXiAxis = (short)dis.readUnsignedShort();
        uPosition += 2;
        initialIndex = (short)dis.readUnsignedShort();
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
   super.marshal(byteBuffer);
   byteBuffer.putShort( (short)numberOfPointsOnXiAxis);
   byteBuffer.putShort( (short)initialIndex);
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
        // attribute numberOfPointsOnXiAxis marked as not serialized
        numberOfPointsOnXiAxis = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute initialIndex marked as not serialized
        initialIndex = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final GridAxisDescriptorFixed rhs = (GridAxisDescriptorFixed)obj;

     if( ! (numberOfPointsOnXiAxis == rhs.numberOfPointsOnXiAxis)) ivarsEqual = false;
     if( ! (initialIndex == rhs.initialIndex)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" numberOfPointsOnXiAxis:").append(numberOfPointsOnXiAxis); // writeOneToString
    sb.append(" initialIndex:").append(initialIndex); // writeOneToString

   return sb.toString();
 }
} // end of class
