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
 *  Information initiating the dyanic allocation and control of simulation entities between two simulation applications.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class TransferOwnershipPdu extends EntityManagementFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "TransferOwnershipPdu";
   
   /** ID of entity originating request */
   protected EntityID  originatingEntityID = new EntityID(); 

   /** ID of entity receiving request */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** ID of request */
   protected int requestID;

   /** required level of reliability service. uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** type of transfer desired uid 224 */
   protected TransferControlTransferType transferType = TransferControlTransferType.values()[0];

   /** The entity for which control is being requested to transfer */
   protected EntityID  transferEntityID = new EntityID(); 

   /** recordSets is an undescribed parameter... */
   protected RecordSpecification  recordSets = new RecordSpecification(); 


/** Constructor creates and configures a new instance object */
 public TransferOwnershipPdu()
 {
    setPduType( DisPduType.TRANSFER_OWNERSHIP );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized TransferOwnershipPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized TransferOwnershipPdu copyByteBuffer()
 {
     TransferOwnershipPdu newCopy = new TransferOwnershipPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("TransferOwnershipPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace(System.err);
         System.exit(-1); // TODO: Abruptly ending VM not a good practice
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
 public synchronized TransferOwnershipPdu copyDataOutputStream()
 {
     TransferOwnershipPdu newCopy = new TransferOwnershipPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("TransferOwnershipPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace(System.err);
         System.exit(-1); // TODO: Abruptly ending VM not a good practice
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.err.println("TransferOwnershipPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
@Override
public synchronized int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (originatingEntityID != null)
       marshalSize += originatingEntityID.getMarshalledSize();
   if (receivingEntityID != null)
       marshalSize += receivingEntityID.getMarshalledSize();
   marshalSize += 4;  // requestID
   if (requiredReliabilityService != null)
       marshalSize += requiredReliabilityService.getMarshalledSize();
   if (transferType != null)
       marshalSize += transferType.getMarshalledSize();
   if (transferEntityID != null)
       marshalSize += transferEntityID.getMarshalledSize();
   if (recordSets != null)
       marshalSize += recordSets.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link TransferOwnershipPdu#originatingEntityID}
  * @param pOriginatingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized TransferOwnershipPdu setOriginatingEntityID(EntityID pOriginatingEntityID)
{
    originatingEntityID = pOriginatingEntityID;
    return this;
}
/** Getter for {@link TransferOwnershipPdu#originatingEntityID}
  * @return value of interest */
public EntityID getOriginatingEntityID()
{
    return originatingEntityID;
}


/** Setter for {@link TransferOwnershipPdu#receivingEntityID}
  * @param pReceivingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized TransferOwnershipPdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}
/** Getter for {@link TransferOwnershipPdu#receivingEntityID}
  * @return value of interest */
public EntityID getReceivingEntityID()
{
    return receivingEntityID;
}


/** Setter for {@link TransferOwnershipPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized TransferOwnershipPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link TransferOwnershipPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link TransferOwnershipPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public synchronized TransferOwnershipPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}
/** Getter for {@link TransferOwnershipPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link TransferOwnershipPdu#transferType}
  * @param pTransferType new value of interest
  * @return same object to permit progressive setters */
public synchronized TransferOwnershipPdu setTransferType(TransferControlTransferType pTransferType)
{
    transferType = pTransferType;
    return this;
}
/** Getter for {@link TransferOwnershipPdu#transferType}
  * @return value of interest */
public TransferControlTransferType getTransferType()
{
    return transferType; 
}

/** Setter for {@link TransferOwnershipPdu#transferEntityID}
  * @param pTransferEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized TransferOwnershipPdu setTransferEntityID(EntityID pTransferEntityID)
{
    transferEntityID = pTransferEntityID;
    return this;
}
/** Getter for {@link TransferOwnershipPdu#transferEntityID}
  * @return value of interest */
public EntityID getTransferEntityID()
{
    return transferEntityID;
}


/** Setter for {@link TransferOwnershipPdu#recordSets}
  * @param pRecordSets new value of interest
  * @return same object to permit progressive setters */
public synchronized TransferOwnershipPdu setRecordSets(RecordSpecification pRecordSets)
{
    recordSets = pRecordSets;
    return this;
}
/** Getter for {@link TransferOwnershipPdu#recordSets}
  * @return value of interest */
public RecordSpecification getRecordSets()
{
    return recordSets;
}


/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
@Override
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       originatingEntityID.marshal(dos);
       receivingEntityID.marshal(dos);
       dos.writeInt(requestID);
       requiredReliabilityService.marshal(dos);
       transferType.marshal(dos);
       transferEntityID.marshal(dos);
       recordSets.marshal(dos);
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
@Override
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += originatingEntityID.unmarshal(dis);
        uPosition += receivingEntityID.unmarshal(dis);
        requestID = dis.readInt();
        uPosition += 4;
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        transferType = TransferControlTransferType.unmarshalEnum(dis);
        uPosition += transferType.getMarshalledSize();
        uPosition += transferEntityID.unmarshal(dis);
        uPosition += recordSets.unmarshal(dis);
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
@Override
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   originatingEntityID.marshal(byteBuffer);
   receivingEntityID.marshal(byteBuffer);
   byteBuffer.putInt( (int)requestID);
   requiredReliabilityService.marshal(byteBuffer);
   transferType.marshal(byteBuffer);
   transferEntityID.marshal(byteBuffer);
   recordSets.marshal(byteBuffer);
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
@Override
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute originatingEntityID marked as not serialized
        originatingEntityID.unmarshal(byteBuffer);
        // attribute receivingEntityID marked as not serialized
        receivingEntityID.unmarshal(byteBuffer);
        // attribute requestID marked as not serialized
        requestID = byteBuffer.getInt();
        // attribute requiredReliabilityService marked as not serialized
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
        // attribute transferType marked as not serialized
        transferType = TransferControlTransferType.unmarshalEnum(byteBuffer);
        // attribute transferEntityID marked as not serialized
        transferEntityID.unmarshal(byteBuffer);
        // attribute recordSets marked as not serialized
        recordSets.unmarshal(byteBuffer);
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
     final TransferOwnershipPdu rhs = (TransferOwnershipPdu)obj;

     if( ! Objects.equals(originatingEntityID, rhs.originatingEntityID) ) return false;
     if( ! Objects.equals(receivingEntityID, rhs.receivingEntityID) ) return false;
     if( ! (requestID == rhs.requestID)) return false;
     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) return false;
     if( ! (transferType == rhs.transferType)) return false;
     if( ! Objects.equals(transferEntityID, rhs.transferEntityID) ) return false;
     if( ! Objects.equals(recordSets, rhs.recordSets) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" originatingEntityID:").append(originatingEntityID); // writeOneToString
    sb.append(" receivingEntityID:").append(receivingEntityID); // writeOneToString
    sb.append(" requestID:").append(requestID); // writeOneToString
    sb.append(" requiredReliabilityService:").append(requiredReliabilityService); // writeOneToString
    sb.append(" transferType:").append(transferType); // writeOneToString
    sb.append(" transferEntityID:").append(transferEntityID); // writeOneToString
    sb.append(" recordSets:").append(recordSets); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.originatingEntityID,
	                     this.receivingEntityID,
	                     this.requestID,
	                     this.requiredReliabilityService,
	                     this.transferType,
	                     this.transferEntityID,
	                     this.recordSets);
 }
} // end of TransferOwnershipPdu
