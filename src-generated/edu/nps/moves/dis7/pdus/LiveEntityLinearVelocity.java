/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 16-bit fixed binaries
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class LiveEntityLinearVelocity extends Object implements Serializable
{
   /** xComponent is an undescribed parameter... */
   protected short  xComponent;

   /** yComponent is an undescribed parameter... */
   protected short  yComponent;

   /** zComponent is an undescribed parameter... */
   protected short  zComponent;


/** Constructor */
 public LiveEntityLinearVelocity()
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

   marshalSize += 2;  // xComponent
   marshalSize += 2;  // yComponent
   marshalSize += 2;  // zComponent

   return marshalSize;
}


/** Setter for {@link LiveEntityLinearVelocity#xComponent}
  * @param pXComponent new value of interest
  * @return same object to permit progressive setters */
public LiveEntityLinearVelocity setXComponent(short pXComponent)
{
    xComponent = pXComponent;
    return this;
}
/** Utility setter for {@link LiveEntityLinearVelocity#xComponent}
  * @param pXComponent new value of interest
  * @return same object to permit progressive setters */
public LiveEntityLinearVelocity setXComponent(int pXComponent){
    xComponent = (short) pXComponent;
    return this;
}

/** Getter for {@link LiveEntityLinearVelocity#xComponent}
  * @return value of interest */
public short getXComponent()
{
    return xComponent; 
}

/** Setter for {@link LiveEntityLinearVelocity#yComponent}
  * @param pYComponent new value of interest
  * @return same object to permit progressive setters */
public LiveEntityLinearVelocity setYComponent(short pYComponent)
{
    yComponent = pYComponent;
    return this;
}
/** Utility setter for {@link LiveEntityLinearVelocity#yComponent}
  * @param pYComponent new value of interest
  * @return same object to permit progressive setters */
public LiveEntityLinearVelocity setYComponent(int pYComponent){
    yComponent = (short) pYComponent;
    return this;
}

/** Getter for {@link LiveEntityLinearVelocity#yComponent}
  * @return value of interest */
public short getYComponent()
{
    return yComponent; 
}

/** Setter for {@link LiveEntityLinearVelocity#zComponent}
  * @param pZComponent new value of interest
  * @return same object to permit progressive setters */
public LiveEntityLinearVelocity setZComponent(short pZComponent)
{
    zComponent = pZComponent;
    return this;
}
/** Utility setter for {@link LiveEntityLinearVelocity#zComponent}
  * @param pZComponent new value of interest
  * @return same object to permit progressive setters */
public LiveEntityLinearVelocity setZComponent(int pZComponent){
    zComponent = (short) pZComponent;
    return this;
}

/** Getter for {@link LiveEntityLinearVelocity#zComponent}
  * @return value of interest */
public short getZComponent()
{
    return zComponent; 
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
       dos.writeShort(xComponent);
       dos.writeShort(yComponent);
       dos.writeShort(zComponent);
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
    try 
    {
        xComponent = (short)dis.readUnsignedShort();
        uPosition += 2;
        yComponent = (short)dis.readUnsignedShort();
        uPosition += 2;
        zComponent = (short)dis.readUnsignedShort();
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
   byteBuffer.putShort( (short)xComponent);
   byteBuffer.putShort( (short)yComponent);
   byteBuffer.putShort( (short)zComponent);
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
    xComponent = (short)(byteBuffer.getShort() & 0xFFFF);
    yComponent = (short)(byteBuffer.getShort() & 0xFFFF);
    zComponent = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final LiveEntityLinearVelocity rhs = (LiveEntityLinearVelocity)obj;

     if( ! (xComponent == rhs.xComponent)) ivarsEqual = false;
     if( ! (yComponent == rhs.yComponent)) ivarsEqual = false;
     if( ! (zComponent == rhs.zComponent)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" xComponent: ").append(xComponent).append("\n");
    sb.append(" yComponent: ").append(yComponent).append("\n");
    sb.append(" zComponent: ").append(zComponent).append("\n");

   return sb.toString();
 }
} // end of class
