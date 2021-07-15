/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * DE Precision Aimpoint Record. Section 6.2.20.3
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class DirectedEnergyPrecisionAimpoint extends Object implements Serializable
{
   /** Type of Record */
   protected int  recordType = (int)4000;

   /** Length of Record */
   protected short  recordLength = (short)88;

   /** Padding */
   protected short  padding = (short)0;

   /** Position of Target Spot in World Coordinates. */
   protected Vector3Double  targetSpotLocation = new Vector3Double(); 

   /** Position (meters) of Target Spot relative to Entity Position. */
   protected Vector3Float  targetSpotEntityLocation = new Vector3Float(); 

   /** Velocity (meters/sec) of Target Spot. */
   protected Vector3Float  targetSpotVelocity = new Vector3Float(); 

   /** Acceleration (meters/sec/sec) of Target Spot. */
   protected Vector3Float  targetSpotAcceleration = new Vector3Float(); 

   /** Unique ID of the target entity. */
   protected EntityID  targetEntityID = new EntityID(); 

   /** Target Component ID ENUM, same as in DamageDescriptionRecord. */
   protected byte  targetComponentID = (byte)0;

   /** Spot Shape ENUM. uid 311 */
   protected DEPrecisionAimpointBeamSpotType beamSpotType = DEPrecisionAimpointBeamSpotType.values()[0];

   /** Beam Spot Cross Section Semi-Major Axis. */
   protected float  beamSpotCrossSectionSemiMajorAxis = (float)0;

   /** Beam Spot Cross Section Semi-Major Axis. */
   protected float  beamSpotCrossSectionSemiMinorAxis = (float)0;

   /** Beam Spot Cross Section Orientation Angle. */
   protected float  beamSpotCrossSectionOrientationAngle = (float)0;

   /** Peak irradiance */
   protected float  peakIrradiance = (float)0;

   /** padding */
   protected int  padding2 = (int)0;


/** Constructor */
 public DirectedEnergyPrecisionAimpoint()
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

   marshalSize += 4;  // recordType
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // padding
   marshalSize += targetSpotLocation.getMarshalledSize();
   marshalSize += targetSpotEntityLocation.getMarshalledSize();
   marshalSize += targetSpotVelocity.getMarshalledSize();
   marshalSize += targetSpotAcceleration.getMarshalledSize();
   marshalSize += targetEntityID.getMarshalledSize();
   marshalSize += 1;  // targetComponentID
   marshalSize += beamSpotType.getMarshalledSize();
   marshalSize += 4;  // beamSpotCrossSectionSemiMajorAxis
   marshalSize += 4;  // beamSpotCrossSectionSemiMinorAxis
   marshalSize += 4;  // beamSpotCrossSectionOrientationAngle
   marshalSize += 4;  // peakIrradiance
   marshalSize += 4;  // padding2

   return marshalSize;
}


/** Setter for {@link DirectedEnergyPrecisionAimpoint#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setRecordType(int pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#recordType}
  * @return value of interest */
public int getRecordType()
{
    return recordType; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link DirectedEnergyPrecisionAimpoint#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link DirectedEnergyPrecisionAimpoint#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#targetSpotLocation}
  * @param pTargetSpotLocation new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setTargetSpotLocation(Vector3Double pTargetSpotLocation)
{
    targetSpotLocation = pTargetSpotLocation;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#targetSpotLocation}
  * @return value of interest */
public Vector3Double getTargetSpotLocation()
{
    return targetSpotLocation; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#targetSpotEntityLocation}
  * @param pTargetSpotEntityLocation new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setTargetSpotEntityLocation(Vector3Float pTargetSpotEntityLocation)
{
    targetSpotEntityLocation = pTargetSpotEntityLocation;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#targetSpotEntityLocation}
  * @return value of interest */
public Vector3Float getTargetSpotEntityLocation()
{
    return targetSpotEntityLocation; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#targetSpotVelocity}
  * @param pTargetSpotVelocity new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setTargetSpotVelocity(Vector3Float pTargetSpotVelocity)
{
    targetSpotVelocity = pTargetSpotVelocity;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#targetSpotVelocity}
  * @return value of interest */
public Vector3Float getTargetSpotVelocity()
{
    return targetSpotVelocity; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#targetSpotAcceleration}
  * @param pTargetSpotAcceleration new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setTargetSpotAcceleration(Vector3Float pTargetSpotAcceleration)
{
    targetSpotAcceleration = pTargetSpotAcceleration;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#targetSpotAcceleration}
  * @return value of interest */
public Vector3Float getTargetSpotAcceleration()
{
    return targetSpotAcceleration; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#targetEntityID}
  * @param pTargetEntityID new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setTargetEntityID(EntityID pTargetEntityID)
{
    targetEntityID = pTargetEntityID;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#targetEntityID}
  * @return value of interest */
public EntityID getTargetEntityID()
{
    return targetEntityID; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#targetComponentID}
  * @param pTargetComponentID new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setTargetComponentID(byte pTargetComponentID)
{
    targetComponentID = pTargetComponentID;
    return this;
}
/** Utility setter for {@link DirectedEnergyPrecisionAimpoint#targetComponentID}
  * @param pTargetComponentID new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setTargetComponentID(int pTargetComponentID){
    targetComponentID = (byte) pTargetComponentID;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#targetComponentID}
  * @return value of interest */
public byte getTargetComponentID()
{
    return targetComponentID; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#beamSpotType}
  * @param pBeamSpotType new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setBeamSpotType(DEPrecisionAimpointBeamSpotType pBeamSpotType)
{
    beamSpotType = pBeamSpotType;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#beamSpotType}
  * @return value of interest */
public DEPrecisionAimpointBeamSpotType getBeamSpotType()
{
    return beamSpotType; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#beamSpotCrossSectionSemiMajorAxis}
  * @param pBeamSpotCrossSectionSemiMajorAxis new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setBeamSpotCrossSectionSemiMajorAxis(float pBeamSpotCrossSectionSemiMajorAxis)
{
    beamSpotCrossSectionSemiMajorAxis = pBeamSpotCrossSectionSemiMajorAxis;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#beamSpotCrossSectionSemiMajorAxis}
  * @return value of interest */
public float getBeamSpotCrossSectionSemiMajorAxis()
{
    return beamSpotCrossSectionSemiMajorAxis; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#beamSpotCrossSectionSemiMinorAxis}
  * @param pBeamSpotCrossSectionSemiMinorAxis new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setBeamSpotCrossSectionSemiMinorAxis(float pBeamSpotCrossSectionSemiMinorAxis)
{
    beamSpotCrossSectionSemiMinorAxis = pBeamSpotCrossSectionSemiMinorAxis;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#beamSpotCrossSectionSemiMinorAxis}
  * @return value of interest */
public float getBeamSpotCrossSectionSemiMinorAxis()
{
    return beamSpotCrossSectionSemiMinorAxis; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#beamSpotCrossSectionOrientationAngle}
  * @param pBeamSpotCrossSectionOrientationAngle new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setBeamSpotCrossSectionOrientationAngle(float pBeamSpotCrossSectionOrientationAngle)
{
    beamSpotCrossSectionOrientationAngle = pBeamSpotCrossSectionOrientationAngle;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#beamSpotCrossSectionOrientationAngle}
  * @return value of interest */
public float getBeamSpotCrossSectionOrientationAngle()
{
    return beamSpotCrossSectionOrientationAngle; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#peakIrradiance}
  * @param pPeakIrradiance new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setPeakIrradiance(float pPeakIrradiance)
{
    peakIrradiance = pPeakIrradiance;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#peakIrradiance}
  * @return value of interest */
public float getPeakIrradiance()
{
    return peakIrradiance; 
}

/** Setter for {@link DirectedEnergyPrecisionAimpoint#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public DirectedEnergyPrecisionAimpoint setPadding2(int pPadding2)
{
    padding2 = pPadding2;
    return this;
}

/** Getter for {@link DirectedEnergyPrecisionAimpoint#padding2}
  * @return value of interest */
public int getPadding2()
{
    return padding2; 
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
       dos.writeInt(recordType);
       dos.writeShort(recordLength);
       dos.writeShort(padding);
       targetSpotLocation.marshal(dos);
       targetSpotEntityLocation.marshal(dos);
       targetSpotVelocity.marshal(dos);
       targetSpotAcceleration.marshal(dos);
       targetEntityID.marshal(dos);
       dos.writeByte(targetComponentID);
       beamSpotType.marshal(dos);
       dos.writeFloat(beamSpotCrossSectionSemiMajorAxis);
       dos.writeFloat(beamSpotCrossSectionSemiMinorAxis);
       dos.writeFloat(beamSpotCrossSectionOrientationAngle);
       dos.writeFloat(peakIrradiance);
       dos.writeInt(padding2);
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
        recordType = dis.readInt();
        uPosition += 4;
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += targetSpotLocation.unmarshal(dis);
        uPosition += targetSpotEntityLocation.unmarshal(dis);
        uPosition += targetSpotVelocity.unmarshal(dis);
        uPosition += targetSpotAcceleration.unmarshal(dis);
        uPosition += targetEntityID.unmarshal(dis);
        targetComponentID = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamSpotType = DEPrecisionAimpointBeamSpotType.unmarshalEnum(dis);
        uPosition += beamSpotType.getMarshalledSize();
        beamSpotCrossSectionSemiMajorAxis = dis.readFloat();
        uPosition += 4;
        beamSpotCrossSectionSemiMinorAxis = dis.readFloat();
        uPosition += 4;
        beamSpotCrossSectionOrientationAngle = dis.readFloat();
        uPosition += 4;
        peakIrradiance = dis.readFloat();
        uPosition += 4;
        padding2 = dis.readInt();
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
   byteBuffer.putInt( (int)recordType);
   byteBuffer.putShort( (short)recordLength);
   byteBuffer.putShort( (short)padding);
   targetSpotLocation.marshal(byteBuffer);
   targetSpotEntityLocation.marshal(byteBuffer);
   targetSpotVelocity.marshal(byteBuffer);
   targetSpotAcceleration.marshal(byteBuffer);
   targetEntityID.marshal(byteBuffer);
   byteBuffer.put( (byte)targetComponentID);
   beamSpotType.marshal(byteBuffer);
   byteBuffer.putFloat( (float)beamSpotCrossSectionSemiMajorAxis);
   byteBuffer.putFloat( (float)beamSpotCrossSectionSemiMinorAxis);
   byteBuffer.putFloat( (float)beamSpotCrossSectionOrientationAngle);
   byteBuffer.putFloat( (float)peakIrradiance);
   byteBuffer.putInt( (int)padding2);
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
    recordType = byteBuffer.getInt();
    recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
    padding = (short)(byteBuffer.getShort() & 0xFFFF);
    targetSpotLocation.unmarshal(byteBuffer);
    targetSpotEntityLocation.unmarshal(byteBuffer);
    targetSpotVelocity.unmarshal(byteBuffer);
    targetSpotAcceleration.unmarshal(byteBuffer);
    targetEntityID.unmarshal(byteBuffer);
    targetComponentID = (byte)(byteBuffer.get() & 0xFF);
    beamSpotType = DEPrecisionAimpointBeamSpotType.unmarshalEnum(byteBuffer);
    beamSpotCrossSectionSemiMajorAxis = byteBuffer.getFloat();
    beamSpotCrossSectionSemiMinorAxis = byteBuffer.getFloat();
    beamSpotCrossSectionOrientationAngle = byteBuffer.getFloat();
    peakIrradiance = byteBuffer.getFloat();
    padding2 = byteBuffer.getInt();
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

     final DirectedEnergyPrecisionAimpoint rhs = (DirectedEnergyPrecisionAimpoint)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (targetSpotLocation.equals( rhs.targetSpotLocation) )) ivarsEqual = false;
     if( ! (targetSpotEntityLocation.equals( rhs.targetSpotEntityLocation) )) ivarsEqual = false;
     if( ! (targetSpotVelocity.equals( rhs.targetSpotVelocity) )) ivarsEqual = false;
     if( ! (targetSpotAcceleration.equals( rhs.targetSpotAcceleration) )) ivarsEqual = false;
     if( ! (targetEntityID.equals( rhs.targetEntityID) )) ivarsEqual = false;
     if( ! (targetComponentID == rhs.targetComponentID)) ivarsEqual = false;
     if( ! (beamSpotType == rhs.beamSpotType)) ivarsEqual = false;
     if( ! (beamSpotCrossSectionSemiMajorAxis == rhs.beamSpotCrossSectionSemiMajorAxis)) ivarsEqual = false;
     if( ! (beamSpotCrossSectionSemiMinorAxis == rhs.beamSpotCrossSectionSemiMinorAxis)) ivarsEqual = false;
     if( ! (beamSpotCrossSectionOrientationAngle == rhs.beamSpotCrossSectionOrientationAngle)) ivarsEqual = false;
     if( ! (peakIrradiance == rhs.peakIrradiance)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" recordLength: ").append(recordLength).append("\n");
    sb.append(" padding: ").append(padding).append("\n");
    sb.append(" targetSpotLocation: ").append(targetSpotLocation).append("\n");
    sb.append(" targetSpotEntityLocation: ").append(targetSpotEntityLocation).append("\n");
    sb.append(" targetSpotVelocity: ").append(targetSpotVelocity).append("\n");
    sb.append(" targetSpotAcceleration: ").append(targetSpotAcceleration).append("\n");
    sb.append(" targetEntityID: ").append(targetEntityID).append("\n");
    sb.append(" targetComponentID: ").append(targetComponentID).append("\n");
    sb.append(" beamSpotType: ").append(beamSpotType).append("\n");
    sb.append(" beamSpotCrossSectionSemiMajorAxis: ").append(beamSpotCrossSectionSemiMajorAxis).append("\n");
    sb.append(" beamSpotCrossSectionSemiMinorAxis: ").append(beamSpotCrossSectionSemiMinorAxis).append("\n");
    sb.append(" beamSpotCrossSectionOrientationAngle: ").append(beamSpotCrossSectionOrientationAngle).append("\n");
    sb.append(" peakIrradiance: ").append(peakIrradiance).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");

   return sb.toString();
 }
} // end of class
