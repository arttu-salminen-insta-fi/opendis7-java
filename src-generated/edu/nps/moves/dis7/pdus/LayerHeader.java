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
 * The identification of the additional information layer number, layer-specific information, and the length of the layer. Section 6.2.51
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class LayerHeader extends Object implements Serializable
{
   /** layerNumber is an undescribed parameter... */
   protected byte layerNumber;

   /** field shall specify layer-specific information that varies by System Type (see 6.2.86) and Layer Number. */
   protected byte layerSpecificInformation;

   /** This field shall specify the length in octets of the layer, including the Layer Header record */
   protected short length;


/** Constructor creates and configures a new instance object */
 public LayerHeader()
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

   marshalSize += 1;  // layerNumber
   marshalSize += 1;  // layerSpecificInformation
   marshalSize += 2;  // length

   return marshalSize;
}


/** Setter for {@link LayerHeader#layerNumber}
  * @param pLayerNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized LayerHeader setLayerNumber(byte pLayerNumber)
{
    layerNumber = pLayerNumber;
    return this;
}
/** Utility setter for {@link LayerHeader#layerNumber}
  * @param pLayerNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized LayerHeader setLayerNumber(int pLayerNumber){
    layerNumber = (byte) pLayerNumber;
    return this;
}
/** Getter for {@link LayerHeader#layerNumber}
  * @return value of interest */
public byte getLayerNumber()
{
    return layerNumber; 
}

/** Setter for {@link LayerHeader#layerSpecificInformation}
  * @param pLayerSpecificInformation new value of interest
  * @return same object to permit progressive setters */
public synchronized LayerHeader setLayerSpecificInformation(byte pLayerSpecificInformation)
{
    layerSpecificInformation = pLayerSpecificInformation;
    return this;
}
/** Utility setter for {@link LayerHeader#layerSpecificInformation}
  * @param pLayerSpecificInformation new value of interest
  * @return same object to permit progressive setters */
public synchronized LayerHeader setLayerSpecificInformation(int pLayerSpecificInformation){
    layerSpecificInformation = (byte) pLayerSpecificInformation;
    return this;
}
/** Getter for {@link LayerHeader#layerSpecificInformation}
  * @return value of interest */
public byte getLayerSpecificInformation()
{
    return layerSpecificInformation; 
}

/** Setter for {@link LayerHeader#length}
  * @param pLength new value of interest
  * @return same object to permit progressive setters */
public synchronized LayerHeader setLength(short pLength)
{
    length = pLength;
    return this;
}
/** Utility setter for {@link LayerHeader#length}
  * @param pLength new value of interest
  * @return same object to permit progressive setters */
public synchronized LayerHeader setLength(int pLength){
    length = (short) pLength;
    return this;
}
/** Getter for {@link LayerHeader#length}
  * @return value of interest */
public short getLength()
{
    return length; 
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
       dos.writeByte(layerNumber);
       dos.writeByte(layerSpecificInformation);
       dos.writeShort(length);
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
        layerNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        layerSpecificInformation = (byte)dis.readUnsignedByte();
        uPosition += 1;
        length = (short)dis.readUnsignedShort();
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
   byteBuffer.put( (byte)layerNumber);
   byteBuffer.put( (byte)layerSpecificInformation);
   byteBuffer.putShort( (short)length);
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
        // attribute layerNumber marked as not serialized
        layerNumber = (byte)(byteBuffer.get() & 0xFF);
        // attribute layerSpecificInformation marked as not serialized
        layerSpecificInformation = (byte)(byteBuffer.get() & 0xFF);
        // attribute length marked as not serialized
        length = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final LayerHeader rhs = (LayerHeader)obj;

     if( ! (layerNumber == rhs.layerNumber)) ivarsEqual = false;
     if( ! (layerSpecificInformation == rhs.layerSpecificInformation)) ivarsEqual = false;
     if( ! (length == rhs.length)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" layerNumber:").append(layerNumber); // writeOneToString
    sb.append(" layerSpecificInformation:").append(layerSpecificInformation); // writeOneToString
    sb.append(" length:").append(length); // writeOneToString

   return sb.toString();
 }
} // end of class
