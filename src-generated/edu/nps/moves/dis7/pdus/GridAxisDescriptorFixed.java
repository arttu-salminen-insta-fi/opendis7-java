/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Grid axis record for fixed data. Section 6.2.41
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class GridAxisDescriptorFixed extends GridAxisDescriptor implements Serializable
{
   /** Number of grid locations along Xi axis */
   protected short  numberOfPointsOnXiAxis;

   /** initial grid point for the current pdu */
   protected short  initialIndex;


/** Constructor */
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
public GridAxisDescriptorFixed setNumberOfPointsOnXiAxis(short pNumberOfPointsOnXiAxis)
{
    numberOfPointsOnXiAxis = pNumberOfPointsOnXiAxis;
    return this;
}
/** Utility setter for {@link GridAxisDescriptorFixed#numberOfPointsOnXiAxis}
  * @param pNumberOfPointsOnXiAxis new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptorFixed setNumberOfPointsOnXiAxis(int pNumberOfPointsOnXiAxis){
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
public GridAxisDescriptorFixed setInitialIndex(short pInitialIndex)
{
    initialIndex = pInitialIndex;
    return this;
}
/** Utility setter for {@link GridAxisDescriptorFixed#initialIndex}
  * @param pInitialIndex new value of interest
  * @return same object to permit progressive setters */
public GridAxisDescriptorFixed setInitialIndex(int pInitialIndex){
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
public int unmarshal(DataInputStream dis) throws Exception
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
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    numberOfPointsOnXiAxis = (short)(byteBuffer.getShort() & 0xFFFF);
    initialIndex = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final GridAxisDescriptorFixed rhs = (GridAxisDescriptorFixed)obj;

     if( ! (numberOfPointsOnXiAxis == rhs.numberOfPointsOnXiAxis)) ivarsEqual = false;
     if( ! (initialIndex == rhs.initialIndex)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" numberOfPointsOnXiAxis: ").append(numberOfPointsOnXiAxis).append("\n");
    sb.append(" initialIndex: ").append(initialIndex).append("\n");

   return sb.toString();
 }
} // end of class
