/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 16 bit fixed binaries
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class LiveEntityOrientationError extends Object implements Serializable
{
   protected short  azimuthError;

   protected short  elevationError;

   protected short  rotationError;


/** Constructor */
 public LiveEntityOrientationError()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 2;  // azimuthError
   marshalSize += 2;  // elevationError
   marshalSize += 2;  // rotationError

   return marshalSize;
}


/** Setter for {@link LiveEntityOrientationError#azimuthError}*/
public LiveEntityOrientationError setAzimuthError(short pAzimuthError)
{
    azimuthError = pAzimuthError;
    return this;
}

/** Getter for {@link LiveEntityOrientationError#azimuthError}*/
public short getAzimuthError()
{
    return azimuthError; 
}

/** Setter for {@link LiveEntityOrientationError#elevationError}*/
public LiveEntityOrientationError setElevationError(short pElevationError)
{
    elevationError = pElevationError;
    return this;
}

/** Getter for {@link LiveEntityOrientationError#elevationError}*/
public short getElevationError()
{
    return elevationError; 
}

/** Setter for {@link LiveEntityOrientationError#rotationError}*/
public LiveEntityOrientationError setRotationError(short pRotationError)
{
    rotationError = pRotationError;
    return this;
}

/** Getter for {@link LiveEntityOrientationError#rotationError}*/
public short getRotationError()
{
    return rotationError; 
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
       dos.writeShort(azimuthError);
       dos.writeShort(elevationError);
       dos.writeShort(rotationError);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Unserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @param dis the InputStream
 * @return unmarshalled size
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        azimuthError = (short)dis.readUnsignedShort();
        uPosition += 2;
        elevationError = (short)dis.readUnsignedShort();
        uPosition += 2;
        rotationError = (short)dis.readUnsignedShort();
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
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer buff) throws Exception
{
   buff.putShort( (short)azimuthError);
   buff.putShort( (short)elevationError);
   buff.putShort( (short)rotationError);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 * @return marshalled size
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    azimuthError = (short)(buff.getShort() & 0xFFFF);
    elevationError = (short)(buff.getShort() & 0xFFFF);
    rotationError = (short)(buff.getShort() & 0xFFFF);
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

     final LiveEntityOrientationError rhs = (LiveEntityOrientationError)obj;

     if( ! (azimuthError == rhs.azimuthError)) ivarsEqual = false;
     if( ! (elevationError == rhs.elevationError)) ivarsEqual = false;
     if( ! (rotationError == rhs.rotationError)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" azimuthError: ").append(azimuthError).append("\n");
    sb.append(" elevationError: ").append(elevationError).append("\n");
    sb.append(" rotationError: ").append(rotationError).append("\n");

   return sb.toString();
 }
} // end of class
