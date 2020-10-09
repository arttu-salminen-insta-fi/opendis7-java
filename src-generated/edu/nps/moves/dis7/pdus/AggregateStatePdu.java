/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.9.2.2 The Aggregate State PDU shall be used to communicate the state and other pertinent information about an aggregated unit.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class AggregateStatePdu extends EntityManagementFamilyPdu implements Serializable
{
   /** ID of aggregated entities */
   protected AggregateIdentifier  aggregateID = new AggregateIdentifier(); 

   /** force ID uid 6 */
   protected ForceID forceID = ForceID.values()[0];

   /** state of aggregate uid 204 */
   protected AggregateStateAggregateState aggregateState = AggregateStateAggregateState.values()[0];

   /** entity type of the aggregated entities */
   protected AggregateType  aggregateType = new AggregateType(); 

   /** formation of aggregated entities uid 205 */
   protected AggregateStateFormation formation = AggregateStateFormation.values()[0];

   /** marking for aggregate; first char is charset type, rest is char data */
   protected AggregateMarking  aggregateMarking = new AggregateMarking(); 

   /** dimensions of bounding box for the aggregated entities, origin at the center of mass */
   protected Vector3Float  dimensions = new Vector3Float(); 

   /** orientation of the bounding box */
   protected Vector3Float  orientation = new Vector3Float(); 

   /** center of mass of the aggregation */
   protected Vector3Double  centerOfMass = new Vector3Double(); 

   /** velocity of aggregation */
   protected Vector3Float  velocity = new Vector3Float(); 

   /** number of aggregates */
   protected short  numberOfDisAggregates;

   /** number of entities */
   protected short  numberOfDisEntities;

   /** number of silent aggregate types */
   protected short  numberOfSilentAggregateTypes;

   /** Number of silent entity types, handled automatically by marshaller at run time (and not modifiable by end-user programmers) */
   protected short  numberOfSilentEntityTypes;

   /** aggregates  list */
   protected List< AggregateIdentifier > aggregateIDList = new ArrayList< AggregateIdentifier >();
 
   /** entity ID list */
   protected List< EntityID > entityIDList = new ArrayList< EntityID >();
 
   private byte[] padTo32 = new byte[0]; // pad to 32-bit boundary

   /** silent entity types */
   protected List< EntityType > silentAggregateSystemList = new ArrayList< EntityType >();
 
   /** silent entity types */
   protected List< EntityType > silentEntitySystemList = new ArrayList< EntityType >();
 
   /** Number of variable datum records, handled automatically by marshaller at run time (and not modifiable by end-user programmers) */
   protected int  numberOfVariableDatumRecords;

   /** variableDatums */
   protected List< VariableDatum > variableDatumList = new ArrayList< VariableDatum >();
 

/** Constructor */
 public AggregateStatePdu()
 {
    setPduType( DISPDUType.AGGREGATE_STATE );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += aggregateID.getMarshalledSize();
   marshalSize += forceID.getMarshalledSize();
   marshalSize += aggregateState.getMarshalledSize();
   marshalSize += aggregateType.getMarshalledSize();
   marshalSize += formation.getMarshalledSize();
   marshalSize += aggregateMarking.getMarshalledSize();
   marshalSize += dimensions.getMarshalledSize();
   marshalSize += orientation.getMarshalledSize();
   marshalSize += centerOfMass.getMarshalledSize();
   marshalSize += velocity.getMarshalledSize();
   marshalSize += 2;  // numberOfDisAggregates
   marshalSize += 2;  // numberOfDisEntities
   marshalSize += 2;  // numberOfSilentAggregateTypes
   marshalSize += 2;  // numberOfSilentEntityTypes
   for(int idx=0; idx < aggregateIDList.size(); idx++)
   {
        AggregateIdentifier listElement = aggregateIDList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < entityIDList.size(); idx++)
   {
        EntityID listElement = entityIDList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += padTo32.length;
   for(int idx=0; idx < silentAggregateSystemList.size(); idx++)
   {
        EntityType listElement = silentAggregateSystemList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < silentEntitySystemList.size(); idx++)
   {
        EntityType listElement = silentEntitySystemList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   marshalSize += 4;  // numberOfVariableDatumRecords
   for(int idx=0; idx < variableDatumList.size(); idx++)
   {
        VariableDatum listElement = variableDatumList.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link AggregateStatePdu#aggregateID}
  * @param pAggregateID new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setAggregateID(AggregateIdentifier pAggregateID)
{
    aggregateID = pAggregateID;
    return this;
}

/** Getter for {@link AggregateStatePdu#aggregateID}
  * @return value of interest */
public AggregateIdentifier getAggregateID()
{
    return aggregateID; 
}

/** Setter for {@link AggregateStatePdu#forceID}
  * @param pForceID new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setForceID(ForceID pForceID)
{
    forceID = pForceID;
    return this;
}

/** Getter for {@link AggregateStatePdu#forceID}
  * @return value of interest */
public ForceID getForceID()
{
    return forceID; 
}

/** Setter for {@link AggregateStatePdu#aggregateState}
  * @param pAggregateState new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setAggregateState(AggregateStateAggregateState pAggregateState)
{
    aggregateState = pAggregateState;
    return this;
}

/** Getter for {@link AggregateStatePdu#aggregateState}
  * @return value of interest */
public AggregateStateAggregateState getAggregateState()
{
    return aggregateState; 
}

/** Setter for {@link AggregateStatePdu#aggregateType}
  * @param pAggregateType new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setAggregateType(AggregateType pAggregateType)
{
    aggregateType = pAggregateType;
    return this;
}

/** Getter for {@link AggregateStatePdu#aggregateType}
  * @return value of interest */
public AggregateType getAggregateType()
{
    return aggregateType; 
}

/** Setter for {@link AggregateStatePdu#formation}
  * @param pFormation new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setFormation(AggregateStateFormation pFormation)
{
    formation = pFormation;
    return this;
}

/** Getter for {@link AggregateStatePdu#formation}
  * @return value of interest */
public AggregateStateFormation getFormation()
{
    return formation; 
}

/** Setter for {@link AggregateStatePdu#aggregateMarking}
  * @param pAggregateMarking new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setAggregateMarking(AggregateMarking pAggregateMarking)
{
    aggregateMarking = pAggregateMarking;
    return this;
}

/** Getter for {@link AggregateStatePdu#aggregateMarking}
  * @return value of interest */
public AggregateMarking getAggregateMarking()
{
    return aggregateMarking; 
}

/** Setter for {@link AggregateStatePdu#dimensions}
  * @param pDimensions new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setDimensions(Vector3Float pDimensions)
{
    dimensions = pDimensions;
    return this;
}

/** Getter for {@link AggregateStatePdu#dimensions}
  * @return value of interest */
public Vector3Float getDimensions()
{
    return dimensions; 
}

/** Setter for {@link AggregateStatePdu#orientation}
  * @param pOrientation new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setOrientation(Vector3Float pOrientation)
{
    orientation = pOrientation;
    return this;
}

/** Getter for {@link AggregateStatePdu#orientation}
  * @return value of interest */
public Vector3Float getOrientation()
{
    return orientation; 
}

/** Setter for {@link AggregateStatePdu#centerOfMass}
  * @param pCenterOfMass new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setCenterOfMass(Vector3Double pCenterOfMass)
{
    centerOfMass = pCenterOfMass;
    return this;
}

/** Getter for {@link AggregateStatePdu#centerOfMass}
  * @return value of interest */
public Vector3Double getCenterOfMass()
{
    return centerOfMass; 
}

/** Setter for {@link AggregateStatePdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setVelocity(Vector3Float pVelocity)
{
    velocity = pVelocity;
    return this;
}

/** Getter for {@link AggregateStatePdu#velocity}
  * @return value of interest */
public Vector3Float getVelocity()
{
    return velocity; 
}

/** Setter for {@link AggregateStatePdu#aggregateIDList}
  * @param pAggregateIDList new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setAggregateIDList(List<AggregateIdentifier> pAggregateIDList)
{
    aggregateIDList = pAggregateIDList;
    return this;
}

/** Getter for {@link AggregateStatePdu#aggregateIDList}
  * @return value of interest */
public List<AggregateIdentifier> getAggregateIDList()
{
    return aggregateIDList; 
}

/** Setter for {@link AggregateStatePdu#entityIDList}
  * @param pEntityIDList new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setEntityIDList(List<EntityID> pEntityIDList)
{
    entityIDList = pEntityIDList;
    return this;
}

/** Getter for {@link AggregateStatePdu#entityIDList}
  * @return value of interest */
public List<EntityID> getEntityIDList()
{
    return entityIDList; 
}

/** Setter for {@link AggregateStatePdu#silentAggregateSystemList}
  * @param pSilentAggregateSystemList new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setSilentAggregateSystemList(List<EntityType> pSilentAggregateSystemList)
{
    silentAggregateSystemList = pSilentAggregateSystemList;
    return this;
}

/** Getter for {@link AggregateStatePdu#silentAggregateSystemList}
  * @return value of interest */
public List<EntityType> getSilentAggregateSystemList()
{
    return silentAggregateSystemList; 
}

/** Setter for {@link AggregateStatePdu#silentEntitySystemList}
  * @param pSilentEntitySystemList new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setSilentEntitySystemList(List<EntityType> pSilentEntitySystemList)
{
    silentEntitySystemList = pSilentEntitySystemList;
    return this;
}

/** Getter for {@link AggregateStatePdu#silentEntitySystemList}
  * @return value of interest */
public List<EntityType> getSilentEntitySystemList()
{
    return silentEntitySystemList; 
}

/** Setter for {@link AggregateStatePdu#variableDatumList}
  * @param pVariableDatumList new value of interest
  * @return same object to permit progressive setters */
public AggregateStatePdu setVariableDatumList(List<VariableDatum> pVariableDatumList)
{
    variableDatumList = pVariableDatumList;
    return this;
}

/** Getter for {@link AggregateStatePdu#variableDatumList}
  * @return value of interest */
public List<VariableDatum> getVariableDatumList()
{
    return variableDatumList; 
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
       aggregateID.marshal(dos);
       forceID.marshal(dos);
       aggregateState.marshal(dos);
       aggregateType.marshal(dos);
       formation.marshal(dos);
       aggregateMarking.marshal(dos);
       dimensions.marshal(dos);
       orientation.marshal(dos);
       centerOfMass.marshal(dos);
       velocity.marshal(dos);
       dos.writeShort(aggregateIDList.size());
       dos.writeShort(entityIDList.size());
       dos.writeShort(silentAggregateSystemList.size());
       dos.writeShort(silentEntitySystemList.size());

       for(int idx = 0; idx < aggregateIDList.size(); idx++)
       {
            AggregateIdentifier aAggregateIdentifier = aggregateIDList.get(idx);
            aAggregateIdentifier.marshal(dos);
       }


       for(int idx = 0; idx < entityIDList.size(); idx++)
       {
            EntityID aEntityID = entityIDList.get(idx);
            aEntityID.marshal(dos);
       }

       padTo32 = new byte[Align.to32bits(dos)];

       for(int idx = 0; idx < silentAggregateSystemList.size(); idx++)
       {
            EntityType aEntityType = silentAggregateSystemList.get(idx);
            aEntityType.marshal(dos);
       }


       for(int idx = 0; idx < silentEntitySystemList.size(); idx++)
       {
            EntityType aEntityType = silentEntitySystemList.get(idx);
            aEntityType.marshal(dos);
       }

       dos.writeInt(variableDatumList.size());

       for(int idx = 0; idx < variableDatumList.size(); idx++)
       {
            VariableDatum aVariableDatum = variableDatumList.get(idx);
            aVariableDatum.marshal(dos);
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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += aggregateID.unmarshal(dis);
        forceID = ForceID.unmarshalEnum(dis);
        uPosition += forceID.getMarshalledSize();
        aggregateState = AggregateStateAggregateState.unmarshalEnum(dis);
        uPosition += aggregateState.getMarshalledSize();
        uPosition += aggregateType.unmarshal(dis);
        formation = AggregateStateFormation.unmarshalEnum(dis);
        uPosition += formation.getMarshalledSize();
        uPosition += aggregateMarking.unmarshal(dis);
        uPosition += dimensions.unmarshal(dis);
        uPosition += orientation.unmarshal(dis);
        uPosition += centerOfMass.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        numberOfDisAggregates = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfDisEntities = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfSilentAggregateTypes = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfSilentEntityTypes = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfDisAggregates; idx++)
        {
            AggregateIdentifier anX = new AggregateIdentifier();
            uPosition += anX.unmarshal(dis);
            aggregateIDList.add(anX);
        }

        for(int idx = 0; idx < numberOfDisEntities; idx++)
        {
            EntityID anX = new EntityID();
            uPosition += anX.unmarshal(dis);
            entityIDList.add(anX);
        }

        padTo32 = new byte[Align.from32bits(uPosition,dis)];
        uPosition += padTo32.length;
        for(int idx = 0; idx < numberOfSilentAggregateTypes; idx++)
        {
            EntityType anX = new EntityType();
            uPosition += anX.unmarshal(dis);
            silentAggregateSystemList.add(anX);
        }

        for(int idx = 0; idx < numberOfSilentEntityTypes; idx++)
        {
            EntityType anX = new EntityType();
            uPosition += anX.unmarshal(dis);
            silentEntitySystemList.add(anX);
        }

        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
            VariableDatum anX = new VariableDatum();
            uPosition += anX.unmarshal(dis);
            variableDatumList.add(anX);
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
   aggregateID.marshal(byteBuffer);
   forceID.marshal(byteBuffer);
   aggregateState.marshal(byteBuffer);
   aggregateType.marshal(byteBuffer);
   formation.marshal(byteBuffer);
   aggregateMarking.marshal(byteBuffer);
   dimensions.marshal(byteBuffer);
   orientation.marshal(byteBuffer);
   centerOfMass.marshal(byteBuffer);
   velocity.marshal(byteBuffer);
   byteBuffer.putShort( (short)aggregateIDList.size());
   byteBuffer.putShort( (short)entityIDList.size());
   byteBuffer.putShort( (short)silentAggregateSystemList.size());
   byteBuffer.putShort( (short)silentEntitySystemList.size());

   for(int idx = 0; idx < aggregateIDList.size(); idx++)
   {
        AggregateIdentifier aAggregateIdentifier = aggregateIDList.get(idx);
        aAggregateIdentifier.marshal(byteBuffer);
   }


   for(int idx = 0; idx < entityIDList.size(); idx++)
   {
        EntityID aEntityID = entityIDList.get(idx);
        aEntityID.marshal(byteBuffer);
   }

   padTo32 = new byte[Align.to32bits(byteBuffer)];

   for(int idx = 0; idx < silentAggregateSystemList.size(); idx++)
   {
        EntityType aEntityType = silentAggregateSystemList.get(idx);
        aEntityType.marshal(byteBuffer);
   }


   for(int idx = 0; idx < silentEntitySystemList.size(); idx++)
   {
        EntityType aEntityType = silentEntitySystemList.get(idx);
        aEntityType.marshal(byteBuffer);
   }

   byteBuffer.putInt( (int)variableDatumList.size());

   for(int idx = 0; idx < variableDatumList.size(); idx++)
   {
        VariableDatum aVariableDatum = variableDatumList.get(idx);
        aVariableDatum.marshal(byteBuffer);
   }

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
    super.unmarshal(byteBuffer);

    aggregateID.unmarshal(byteBuffer);
    forceID = ForceID.unmarshalEnum(byteBuffer);
    aggregateState = AggregateStateAggregateState.unmarshalEnum(byteBuffer);
    aggregateType.unmarshal(byteBuffer);
    formation = AggregateStateFormation.unmarshalEnum(byteBuffer);
    aggregateMarking.unmarshal(byteBuffer);
    dimensions.unmarshal(byteBuffer);
    orientation.unmarshal(byteBuffer);
    centerOfMass.unmarshal(byteBuffer);
    velocity.unmarshal(byteBuffer);
    numberOfDisAggregates = (short)(byteBuffer.getShort() & 0xFFFF);
    numberOfDisEntities = (short)(byteBuffer.getShort() & 0xFFFF);
    numberOfSilentAggregateTypes = (short)(byteBuffer.getShort() & 0xFFFF);
    numberOfSilentEntityTypes = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfDisAggregates; idx++)
    {
    AggregateIdentifier anX = new AggregateIdentifier();
    anX.unmarshal(byteBuffer);
    aggregateIDList.add(anX);
    }

    for(int idx = 0; idx < numberOfDisEntities; idx++)
    {
    EntityID anX = new EntityID();
    anX.unmarshal(byteBuffer);
    entityIDList.add(anX);
    }

    padTo32 = new byte[Align.from32bits(byteBuffer)];
    for(int idx = 0; idx < numberOfSilentAggregateTypes; idx++)
    {
    EntityType anX = new EntityType();
    anX.unmarshal(byteBuffer);
    silentAggregateSystemList.add(anX);
    }

    for(int idx = 0; idx < numberOfSilentEntityTypes; idx++)
    {
    EntityType anX = new EntityType();
    anX.unmarshal(byteBuffer);
    silentEntitySystemList.add(anX);
    }

    numberOfVariableDatumRecords = byteBuffer.getInt();
    for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
    {
    VariableDatum anX = new VariableDatum();
    anX.unmarshal(byteBuffer);
    variableDatumList.add(anX);
    }

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

     final AggregateStatePdu rhs = (AggregateStatePdu)obj;

     if( ! (aggregateID.equals( rhs.aggregateID) )) ivarsEqual = false;
     if( ! (forceID == rhs.forceID)) ivarsEqual = false;
     if( ! (aggregateState == rhs.aggregateState)) ivarsEqual = false;
     if( ! (aggregateType.equals( rhs.aggregateType) )) ivarsEqual = false;
     if( ! (formation == rhs.formation)) ivarsEqual = false;
     if( ! (aggregateMarking.equals( rhs.aggregateMarking) )) ivarsEqual = false;
     if( ! (dimensions.equals( rhs.dimensions) )) ivarsEqual = false;
     if( ! (orientation.equals( rhs.orientation) )) ivarsEqual = false;
     if( ! (centerOfMass.equals( rhs.centerOfMass) )) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;

     for(int idx = 0; idx < aggregateIDList.size(); idx++)
        if( ! ( aggregateIDList.get(idx).equals(rhs.aggregateIDList.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < entityIDList.size(); idx++)
        if( ! ( entityIDList.get(idx).equals(rhs.entityIDList.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < silentAggregateSystemList.size(); idx++)
        if( ! ( silentAggregateSystemList.get(idx).equals(rhs.silentAggregateSystemList.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < silentEntitySystemList.size(); idx++)
        if( ! ( silentEntitySystemList.get(idx).equals(rhs.silentEntitySystemList.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < variableDatumList.size(); idx++)
        if( ! ( variableDatumList.get(idx).equals(rhs.variableDatumList.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" aggregateID: ").append(aggregateID).append("\n");
    sb.append(" forceID: ").append(forceID).append("\n");
    sb.append(" aggregateState: ").append(aggregateState).append("\n");
    sb.append(" aggregateType: ").append(aggregateType).append("\n");
    sb.append(" formation: ").append(formation).append("\n");
    sb.append(" aggregateMarking: ").append(aggregateMarking).append("\n");
    sb.append(" dimensions: ").append(dimensions).append("\n");
    sb.append(" orientation: ").append(orientation).append("\n");
    sb.append(" centerOfMass: ").append(centerOfMass).append("\n");
    sb.append(" velocity: ").append(velocity).append("\n");
    sb.append(" padTo32: ").append(padTo32).append("\n");
    sb.append(" aggregateIDList: ").append("\n");
    aggregateIDList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" entityIDList: ").append("\n");
    entityIDList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" silentAggregateSystemList: ").append("\n");
    silentAggregateSystemList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" silentEntitySystemList: ").append("\n");
    silentEntitySystemList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" variableDatumList: ").append("\n");
    variableDatumList.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class