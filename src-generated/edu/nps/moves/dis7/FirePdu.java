/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 7.3.2 Used to communicate the firing of a weapon or expendable.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class FirePdu extends WarfareFamilyPdu implements Serializable
{
   /** ID of the entity that shot */
   protected EntityID  firingEntityID = new EntityID(); 

   /** ID of the entity that is being shot at */
   protected EntityID  targetEntityID = new EntityID(); 

   /** This field shall specify the entity identification of the fired munition or expendable. This field shall be represented by an Entity Identifier record (see 6.2.28). */
   protected EntityID  munitionExpendibleID = new EntityID(); 

   /** This field shall contain an identification generated by the firing entity to associate related firing and detonation events. This field shall be represented by an Event Identifier record (see 6.2.34). */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** This field shall identify the fire mission (see 5.4.3.3). This field shall be represented by a 32-bit unsigned integer. */
   protected int  fireMissionIndex;

   /** This field shall specify the location, in world coordinates, from which the munition was launched, and shall be represented by a World Coordinates record (see 6.2.97). */
   protected Vector3Double  locationInWorldCoordinates = new Vector3Double(); 

   /** This field shall describe the firing or launch of a munition or expendable represented by one of the following types of Descriptor records: Munition Descriptor (6.2.20.2) or Expendable Descriptor (6.2.20.4). */
   protected MunitionDescriptor  descriptor = new MunitionDescriptor(); 

   /** This field shall specify the velocity of the fired munition at the point when the issuing simulation application intends the externally visible effects of the launch (e.g. exhaust plume or muzzle blast) to first become apparent. The velocity shall be represented in world coordinates. This field shall be represented by a Linear Velocity Vector record [see 6.2.95 item c)]. */
   protected Vector3Float  velocity = new Vector3Float(); 

   /** This field shall specify the range that an entity's fire control system has assumed in computing the fire control solution. This field shall be represented by a 32-bit floating point number in meters. For systems where range is unknown or unavailable, this field shall contain a value of zero. */
   protected float  range;


/** Constructor */
 public FirePdu()
 {
    setPduType( DISPDUType.FIRE );
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += firingEntityID.getMarshalledSize();
   marshalSize += targetEntityID.getMarshalledSize();
   marshalSize += munitionExpendibleID.getMarshalledSize();
   marshalSize += eventID.getMarshalledSize();
   marshalSize += 4;  // fireMissionIndex
   marshalSize += locationInWorldCoordinates.getMarshalledSize();
   marshalSize += descriptor.getMarshalledSize();
   marshalSize += velocity.getMarshalledSize();
   marshalSize += 4;  // range

   return marshalSize;
}


/** Setter for {@link FirePdu#firingEntityID}*/
public FirePdu setFiringEntityID(EntityID pFiringEntityID)
{
    firingEntityID = pFiringEntityID;
    return this;
}

/** Getter for {@link FirePdu#firingEntityID}*/
public EntityID getFiringEntityID()
{
    return firingEntityID; 
}

/** Setter for {@link FirePdu#targetEntityID}*/
public FirePdu setTargetEntityID(EntityID pTargetEntityID)
{
    targetEntityID = pTargetEntityID;
    return this;
}

/** Getter for {@link FirePdu#targetEntityID}*/
public EntityID getTargetEntityID()
{
    return targetEntityID; 
}

/** Setter for {@link FirePdu#munitionExpendibleID}*/
public FirePdu setMunitionExpendibleID(EntityID pMunitionExpendibleID)
{
    munitionExpendibleID = pMunitionExpendibleID;
    return this;
}

/** Getter for {@link FirePdu#munitionExpendibleID}*/
public EntityID getMunitionExpendibleID()
{
    return munitionExpendibleID; 
}

/** Setter for {@link FirePdu#eventID}*/
public FirePdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}

/** Getter for {@link FirePdu#eventID}*/
public EventIdentifier getEventID()
{
    return eventID; 
}

/** Setter for {@link FirePdu#fireMissionIndex}*/
public FirePdu setFireMissionIndex(int pFireMissionIndex)
{
    fireMissionIndex = pFireMissionIndex;
    return this;
}

/** Getter for {@link FirePdu#fireMissionIndex}*/
public int getFireMissionIndex()
{
    return fireMissionIndex; 
}

/** Setter for {@link FirePdu#locationInWorldCoordinates}*/
public FirePdu setLocationInWorldCoordinates(Vector3Double pLocationInWorldCoordinates)
{
    locationInWorldCoordinates = pLocationInWorldCoordinates;
    return this;
}

/** Getter for {@link FirePdu#locationInWorldCoordinates}*/
public Vector3Double getLocationInWorldCoordinates()
{
    return locationInWorldCoordinates; 
}

/** Setter for {@link FirePdu#descriptor}*/
public FirePdu setDescriptor(MunitionDescriptor pDescriptor)
{
    descriptor = pDescriptor;
    return this;
}

/** Getter for {@link FirePdu#descriptor}*/
public MunitionDescriptor getDescriptor()
{
    return descriptor; 
}

/** Setter for {@link FirePdu#velocity}*/
public FirePdu setVelocity(Vector3Float pVelocity)
{
    velocity = pVelocity;
    return this;
}

/** Getter for {@link FirePdu#velocity}*/
public Vector3Float getVelocity()
{
    return velocity; 
}

/** Setter for {@link FirePdu#range}*/
public FirePdu setRange(float pRange)
{
    range = pRange;
    return this;
}

/** Getter for {@link FirePdu#range}*/
public float getRange()
{
    return range; 
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
       firingEntityID.marshal(dos);
       targetEntityID.marshal(dos);
       munitionExpendibleID.marshal(dos);
       eventID.marshal(dos);
       dos.writeInt(fireMissionIndex);
       locationInWorldCoordinates.marshal(dos);
       descriptor.marshal(dos);
       velocity.marshal(dos);
       dos.writeFloat(range);
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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += firingEntityID.unmarshal(dis);
        uPosition += targetEntityID.unmarshal(dis);
        uPosition += munitionExpendibleID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        fireMissionIndex = dis.readInt();
        uPosition += 4;
        uPosition += locationInWorldCoordinates.unmarshal(dis);
        uPosition += descriptor.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        range = dis.readFloat();
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
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer buff) throws Exception
{
   super.marshal(buff);
   firingEntityID.marshal(buff);
   targetEntityID.marshal(buff);
   munitionExpendibleID.marshal(buff);
   eventID.marshal(buff);
   buff.putInt( (int)fireMissionIndex);
   locationInWorldCoordinates.marshal(buff);
   descriptor.marshal(buff);
   velocity.marshal(buff);
   buff.putFloat( (float)range);
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
    super.unmarshal(buff);

    firingEntityID.unmarshal(buff);
    targetEntityID.unmarshal(buff);
    munitionExpendibleID.unmarshal(buff);
    eventID.unmarshal(buff);
    fireMissionIndex = buff.getInt();
    locationInWorldCoordinates.unmarshal(buff);
    descriptor.unmarshal(buff);
    velocity.unmarshal(buff);
    range = buff.getFloat();
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

     final FirePdu rhs = (FirePdu)obj;

     if( ! (firingEntityID.equals( rhs.firingEntityID) )) ivarsEqual = false;
     if( ! (targetEntityID.equals( rhs.targetEntityID) )) ivarsEqual = false;
     if( ! (munitionExpendibleID.equals( rhs.munitionExpendibleID) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (fireMissionIndex == rhs.fireMissionIndex)) ivarsEqual = false;
     if( ! (locationInWorldCoordinates.equals( rhs.locationInWorldCoordinates) )) ivarsEqual = false;
     if( ! (descriptor.equals( rhs.descriptor) )) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;
     if( ! (range == rhs.range)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" firingEntityID: ").append(firingEntityID).append("\n");
    sb.append(" targetEntityID: ").append(targetEntityID).append("\n");
    sb.append(" munitionExpendibleID: ").append(munitionExpendibleID).append("\n");
    sb.append(" eventID: ").append(eventID).append("\n");
    sb.append(" fireMissionIndex: ").append(fireMissionIndex).append("\n");
    sb.append(" locationInWorldCoordinates: ").append(locationInWorldCoordinates).append("\n");
    sb.append(" descriptor: ").append(descriptor).append("\n");
    sb.append(" velocity: ").append(velocity).append("\n");
    sb.append(" range: ").append(range).append("\n");

   return sb.toString();
 }
} // end of class
