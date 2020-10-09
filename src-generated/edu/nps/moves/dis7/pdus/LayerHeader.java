/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The identification of the additional information layer number, layer-specific information, and the length of the layer. Section 6.2.51
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class LayerHeader extends Object implements Serializable
{
   protected byte  layerNumber;

   /** field shall specify layer-specific information that varies by System Type (see 6.2.86) and Layer Number. */
   protected byte  layerSpecificInformation;

   /** This field shall specify the length in octets of the layer, including the Layer Header record */
   protected short  length;


/** Constructor */
 public LayerHeader()
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

   marshalSize += 1;  // layerNumber
   marshalSize += 1;  // layerSpecificInformation
   marshalSize += 2;  // length

   return marshalSize;
}


/** Setter for {@link LayerHeader#layerNumber}
  * @param pLayerNumber new value of interest
  * @return same object to permit progressive setters */
public LayerHeader setLayerNumber(byte pLayerNumber)
{
    layerNumber = pLayerNumber;
    return this;
}
/** Utility setter for {@link LayerHeader#layerNumber}
  * @param pLayerNumber new value of interest
  * @return same object to permit progressive setters */
public LayerHeader setLayerNumber(int pLayerNumber){
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
public LayerHeader setLayerSpecificInformation(byte pLayerSpecificInformation)
{
    layerSpecificInformation = pLayerSpecificInformation;
    return this;
}
/** Utility setter for {@link LayerHeader#layerSpecificInformation}
  * @param pLayerSpecificInformation new value of interest
  * @return same object to permit progressive setters */
public LayerHeader setLayerSpecificInformation(int pLayerSpecificInformation){
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
public LayerHeader setLength(short pLength)
{
    length = pLength;
    return this;
}
/** Utility setter for {@link LayerHeader#length}
  * @param pLength new value of interest
  * @return same object to permit progressive setters */
public LayerHeader setLength(int pLength){
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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    layerNumber = (byte)(byteBuffer.get() & 0xFF);
    layerSpecificInformation = (byte)(byteBuffer.get() & 0xFF);
    length = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final LayerHeader rhs = (LayerHeader)obj;

     if( ! (layerNumber == rhs.layerNumber)) ivarsEqual = false;
     if( ! (layerSpecificInformation == rhs.layerSpecificInformation)) ivarsEqual = false;
     if( ! (length == rhs.length)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" layerNumber: ").append(layerNumber).append("\n");
    sb.append(" layerSpecificInformation: ").append(layerSpecificInformation).append("\n");
    sb.append(" length: ").append(length).append("\n");

   return sb.toString();
 }
} // end of class