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
import java.nio.ByteBuffer;

/**
 * 7.3.3 Used to communicate the detonation or impact of munitions, as well as non-munition explosions, the burst or initial bloom of chaff, and the ignition of a flare.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class DetonationPdu extends WarfareFamilyPdu implements Serializable
{
   /** ID of the entity that shot */
   protected EntityID  sourceEntityID = new EntityID(); 

   /** ID of the entity that is being shot at */
   protected EntityID  targetEntityID = new EntityID(); 

   /** ID of the expendable entity, Section 7.3.3  */
   protected EntityID  explodingEntityID = new EntityID(); 

   /** ID of event, Section 7.3.3 */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** velocity of the munition immediately before detonation/impact, Section 7.3.3  */
   protected Vector3Float  velocity = new Vector3Float(); 

   /** location of the munition detonation, the expendable detonation, Section 7.3.3  */
   protected Vector3Double  locationInWorldCoordinates = new Vector3Double(); 

   /** Describes the detonation represented, Section 7.3.3  */
   protected MunitionDescriptor  descriptor = new MunitionDescriptor(); 

   /** Velocity of the ammunition, Section 7.3.3  */
   protected Vector3Float  locationOfEntityCoordinates = new Vector3Float(); 

   /** result of the detonation, Section 7.3.3  uid 62 */
   protected DetonationResult detonationResult = DetonationResult.values()[0];

   /** How many articulation parameters we have, Section 7.3.3  */
   protected byte numberOfVariableParameters;

   /** padding */
   protected short pad;

   /** specify the parameter values for each Variable Parameter record, Section 7.3.3  */
   protected List< VariableParameter > variableParameters = new ArrayList< VariableParameter >();
 

/** Constructor creates and configures a new instance object */
 public DetonationPdu()
 {
    setPduType( DisPduType.DETONATION );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized DetonationPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized DetonationPdu copyByteBuffer()
 {
     DetonationPdu newCopy = new DetonationPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("DetonationPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
     return newCopy;
 }

/** byteArrayOutputStream (baos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/** dataOutputStream (dos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected DataOutputStream      dataOutputStream      = new DataOutputStream(byteArrayOutputStream);

/** copy method creates a deep copy of current object using DataOutputStream methods.
 * @return deep copy of PDU */
 public synchronized DetonationPdu copyDataOutputStream()
 {
     DetonationPdu newCopy = new DetonationPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("DetonationPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.out.println("DetonationPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
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
   if (sourceEntityID != null)
       marshalSize += sourceEntityID.getMarshalledSize();
   if (targetEntityID != null)
       marshalSize += targetEntityID.getMarshalledSize();
   if (explodingEntityID != null)
       marshalSize += explodingEntityID.getMarshalledSize();
   if (eventID != null)
       marshalSize += eventID.getMarshalledSize();
   if (velocity != null)
       marshalSize += velocity.getMarshalledSize();
   if (locationInWorldCoordinates != null)
       marshalSize += locationInWorldCoordinates.getMarshalledSize();
   if (descriptor != null)
       marshalSize += descriptor.getMarshalledSize();
   if (locationOfEntityCoordinates != null)
       marshalSize += locationOfEntityCoordinates.getMarshalledSize();
   if (detonationResult != null)
       marshalSize += detonationResult.getMarshalledSize();
   marshalSize += 1;  // numberOfVariableParameters
   marshalSize += 2;  // pad
   if (variableParameters != null)
       for (int idx=0; idx < variableParameters.size(); idx++)
       {
            VariableParameter listElement = variableParameters.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link DetonationPdu#sourceEntityID}
  * @param pSourceEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setSourceEntityID(EntityID pSourceEntityID)
{
    sourceEntityID = pSourceEntityID;
    return this;
}
/** Getter for {@link DetonationPdu#sourceEntityID}
  * @return value of interest */
public EntityID getSourceEntityID()
{
    return sourceEntityID;
}


/** Setter for {@link DetonationPdu#targetEntityID}
  * @param pTargetEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setTargetEntityID(EntityID pTargetEntityID)
{
    targetEntityID = pTargetEntityID;
    return this;
}
/** Getter for {@link DetonationPdu#targetEntityID}
  * @return value of interest */
public EntityID getTargetEntityID()
{
    return targetEntityID;
}


/** Setter for {@link DetonationPdu#explodingEntityID}
  * @param pExplodingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setExplodingEntityID(EntityID pExplodingEntityID)
{
    explodingEntityID = pExplodingEntityID;
    return this;
}
/** Getter for {@link DetonationPdu#explodingEntityID}
  * @return value of interest */
public EntityID getExplodingEntityID()
{
    return explodingEntityID;
}


/** Setter for {@link DetonationPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}
/** Getter for {@link DetonationPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID;
}


/** Setter for {@link DetonationPdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setVelocity(Vector3Float pVelocity)
{
    velocity = pVelocity;
    return this;
}
/** Getter for {@link DetonationPdu#velocity}
  * @return value of interest */
public Vector3Float getVelocity()
{
    return velocity;
}


/** Setter for {@link DetonationPdu#locationInWorldCoordinates}
  * @param pLocationInWorldCoordinates new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setLocationInWorldCoordinates(Vector3Double pLocationInWorldCoordinates)
{
    locationInWorldCoordinates = pLocationInWorldCoordinates;
    return this;
}
/** Getter for {@link DetonationPdu#locationInWorldCoordinates}
  * @return value of interest */
public Vector3Double getLocationInWorldCoordinates()
{
    return locationInWorldCoordinates;
}


/** Setter for {@link DetonationPdu#descriptor}
  * @param pDescriptor new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setDescriptor(MunitionDescriptor pDescriptor)
{
    descriptor = pDescriptor;
    return this;
}
/** Getter for {@link DetonationPdu#descriptor}
  * @return value of interest */
public MunitionDescriptor getDescriptor()
{
    return descriptor;
}


/** Setter for {@link DetonationPdu#locationOfEntityCoordinates}
  * @param pLocationOfEntityCoordinates new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setLocationOfEntityCoordinates(Vector3Float pLocationOfEntityCoordinates)
{
    locationOfEntityCoordinates = pLocationOfEntityCoordinates;
    return this;
}
/** Getter for {@link DetonationPdu#locationOfEntityCoordinates}
  * @return value of interest */
public Vector3Float getLocationOfEntityCoordinates()
{
    return locationOfEntityCoordinates;
}


/** Setter for {@link DetonationPdu#detonationResult}
  * @param pDetonationResult new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setDetonationResult(DetonationResult pDetonationResult)
{
    detonationResult = pDetonationResult;
    return this;
}
/** Getter for {@link DetonationPdu#detonationResult}
  * @return value of interest */
public DetonationResult getDetonationResult()
{
    return detonationResult; 
}

/** Setter for {@link DetonationPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setPad(short pPad)
{
    pad = pPad;
    return this;
}
/** Utility setter for {@link DetonationPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setPad(int pPad){
    pad = (short) pPad;
    return this;
}
/** Getter for {@link DetonationPdu#pad}
  * @return value of interest */
public short getPad()
{
    return pad; 
}

/** Setter for {@link DetonationPdu#variableParameters}
  * @param pVariableParameters new value of interest
  * @return same object to permit progressive setters */
public synchronized DetonationPdu setVariableParameters(List<VariableParameter> pVariableParameters)
{
    variableParameters = pVariableParameters;
    return this;
}
/** Getter for {@link DetonationPdu#variableParameters}
  * @return value of interest */
public List<VariableParameter> getVariableParameters()
{
    return variableParameters; 
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
       sourceEntityID.marshal(dos);
       targetEntityID.marshal(dos);
       explodingEntityID.marshal(dos);
       eventID.marshal(dos);
       velocity.marshal(dos);
       locationInWorldCoordinates.marshal(dos);
       descriptor.marshal(dos);
       locationOfEntityCoordinates.marshal(dos);
       detonationResult.marshal(dos);
       dos.writeByte(variableParameters.size());
       dos.writeShort(pad);

       for (int idx = 0; idx < variableParameters.size(); idx++)
       {
            VariableParameter aVariableParameter = variableParameters.get(idx);
            aVariableParameter.marshal(dos);
       }

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
        uPosition += sourceEntityID.unmarshal(dis);
        uPosition += targetEntityID.unmarshal(dis);
        uPosition += explodingEntityID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        uPosition += locationInWorldCoordinates.unmarshal(dis);
        uPosition += descriptor.unmarshal(dis);
        uPosition += locationOfEntityCoordinates.unmarshal(dis);
        detonationResult = DetonationResult.unmarshalEnum(dis);
        uPosition += detonationResult.getMarshalledSize();
        numberOfVariableParameters = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfVariableParameters; idx++)
        {
            VariableParameter anX = new VariableParameter();
            uPosition += anX.unmarshal(dis);
            variableParameters.add(anX);
        }

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
   sourceEntityID.marshal(byteBuffer);
   targetEntityID.marshal(byteBuffer);
   explodingEntityID.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   velocity.marshal(byteBuffer);
   locationInWorldCoordinates.marshal(byteBuffer);
   descriptor.marshal(byteBuffer);
   locationOfEntityCoordinates.marshal(byteBuffer);
   detonationResult.marshal(byteBuffer);
   byteBuffer.put( (byte)variableParameters.size());
   byteBuffer.putShort( (short)pad);

   for (int idx = 0; idx < variableParameters.size(); idx++)
   {
        VariableParameter aVariableParameter = variableParameters.get(idx);
        aVariableParameter.marshal(byteBuffer);
   }

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
        // attribute sourceEntityID marked as not serialized
        sourceEntityID.unmarshal(byteBuffer);
        // attribute targetEntityID marked as not serialized
        targetEntityID.unmarshal(byteBuffer);
        // attribute explodingEntityID marked as not serialized
        explodingEntityID.unmarshal(byteBuffer);
        // attribute eventID marked as not serialized
        eventID.unmarshal(byteBuffer);
        // attribute velocity marked as not serialized
        velocity.unmarshal(byteBuffer);
        // attribute locationInWorldCoordinates marked as not serialized
        locationInWorldCoordinates.unmarshal(byteBuffer);
        // attribute descriptor marked as not serialized
        descriptor.unmarshal(byteBuffer);
        // attribute locationOfEntityCoordinates marked as not serialized
        locationOfEntityCoordinates.unmarshal(byteBuffer);
        // attribute detonationResult marked as not serialized
        detonationResult = DetonationResult.unmarshalEnum(byteBuffer);
        // attribute numberOfVariableParameters marked as not serialized
        numberOfVariableParameters = (byte)(byteBuffer.get() & 0xFF);
        // attribute pad marked as not serialized
        pad = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute variableParameters marked as not serialized
        for (int idx = 0; idx < numberOfVariableParameters; idx++)
        {
        VariableParameter anX = new VariableParameter();
        anX.unmarshal(byteBuffer);
        variableParameters.add(anX);
        }

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

     final DetonationPdu rhs = (DetonationPdu)obj;

     if( ! (sourceEntityID.equals( rhs.sourceEntityID) )) ivarsEqual = false;
     if( ! (targetEntityID.equals( rhs.targetEntityID) )) ivarsEqual = false;
     if( ! (explodingEntityID.equals( rhs.explodingEntityID) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;
     if( ! (locationInWorldCoordinates.equals( rhs.locationInWorldCoordinates) )) ivarsEqual = false;
     if( ! (descriptor.equals( rhs.descriptor) )) ivarsEqual = false;
     if( ! (locationOfEntityCoordinates.equals( rhs.locationOfEntityCoordinates) )) ivarsEqual = false;
     if( ! (detonationResult == rhs.detonationResult)) ivarsEqual = false;
     if( ! (pad == rhs.pad)) ivarsEqual = false;

     for (int idx = 0; idx < variableParameters.size(); idx++)
        if( ! ( variableParameters.get(idx).equals(rhs.variableParameters.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" sourceEntityID:").append(sourceEntityID); // writeOneToString
    sb.append(" targetEntityID:").append(targetEntityID); // writeOneToString
    sb.append(" explodingEntityID:").append(explodingEntityID); // writeOneToString
    sb.append(" eventID:").append(eventID); // writeOneToString
    sb.append(" velocity:").append(velocity); // writeOneToString
    sb.append(" locationInWorldCoordinates:").append(locationInWorldCoordinates); // writeOneToString
    sb.append(" descriptor:").append(descriptor); // writeOneToString
    sb.append(" locationOfEntityCoordinates:").append(locationOfEntityCoordinates); // writeOneToString
    sb.append(" detonationResult:").append(detonationResult); // writeOneToString
    sb.append(" pad:").append(pad); // writeOneToString
    sb.append(" variableParameters: ");
    variableParameters.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
