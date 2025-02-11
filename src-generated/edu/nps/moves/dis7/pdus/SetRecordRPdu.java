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
 * 5.12.4.15 Used to set or change certain parameter values. These parameter values are contained within a record format as compared to the datum format used in the Set Data-R PDU.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class SetRecordRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "SetRecordRPdu";
   
   /** request ID provides a unique identifier */
   protected int requestID;

   /** level of reliability service used for this transaction uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** pad1 is an undescribed parameter... */
   protected byte pad1;

   /** pad2 is an undescribed parameter... */
   protected short pad2;

   /** pad3 is an undescribed parameter... */
   protected int pad3;

   /** Number of record sets in list */
   protected int numberOfRecordSets;

   /** record sets */
   protected List< RecordSpecification > recordSets = new ArrayList<>();
 

/** Constructor creates and configures a new instance object */
 public SetRecordRPdu()
 {
    setPduType( DisPduType.SET_RECORD_RELIABLE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized SetRecordRPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized SetRecordRPdu copyByteBuffer()
 {
     SetRecordRPdu newCopy = new SetRecordRPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("SetRecordRPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized SetRecordRPdu copyDataOutputStream()
 {
     SetRecordRPdu newCopy = new SetRecordRPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("SetRecordRPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("SetRecordRPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   marshalSize += 4;  // requestID
   if (requiredReliabilityService != null)
       marshalSize += requiredReliabilityService.getMarshalledSize();
   marshalSize += 1;  // pad1
   marshalSize += 2;  // pad2
   marshalSize += 4;  // pad3
   marshalSize += 4;  // numberOfRecordSets
   if (recordSets != null)
       for (int idx=0; idx < recordSets.size(); idx++)
       {
            RecordSpecification listElement = recordSets.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link SetRecordRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link SetRecordRPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link SetRecordRPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}
/** Getter for {@link SetRecordRPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link SetRecordRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setPad1(byte pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Utility setter for {@link SetRecordRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setPad1(int pPad1){
    pad1 = (byte) pPad1;
    return this;
}
/** Getter for {@link SetRecordRPdu#pad1}
  * @return value of interest */
public byte getPad1()
{
    return pad1; 
}

/** Setter for {@link SetRecordRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setPad2(short pPad2)
{
    pad2 = pPad2;
    return this;
}
/** Utility setter for {@link SetRecordRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setPad2(int pPad2){
    pad2 = (short) pPad2;
    return this;
}
/** Getter for {@link SetRecordRPdu#pad2}
  * @return value of interest */
public short getPad2()
{
    return pad2; 
}

/** Setter for {@link SetRecordRPdu#pad3}
  * @param pPad3 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setPad3(int pPad3)
{
    pad3 = pPad3;
    return this;
}
/** Getter for {@link SetRecordRPdu#pad3}
  * @return value of interest */
public int getPad3()
{
    return pad3; 
}

/** Setter for {@link SetRecordRPdu#recordSets}
  * @param pRecordSets new value of interest
  * @return same object to permit progressive setters */
public synchronized SetRecordRPdu setRecordSets(List<RecordSpecification> pRecordSets)
{
    recordSets = pRecordSets;
    return this;
}
/** Getter for {@link SetRecordRPdu#recordSets}
  * @return value of interest */
public List<RecordSpecification> getRecordSets()
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
       dos.writeInt(requestID);
       requiredReliabilityService.marshal(dos);
       dos.writeByte(pad1);
       dos.writeShort(pad2);
       dos.writeInt(pad3);
       dos.writeInt(recordSets.size());

       for (int idx = 0; idx < recordSets.size(); idx++)
       {
            RecordSpecification aRecordSpecification = recordSets.get(idx);
            aRecordSpecification.marshal(dos);
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
@Override
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        requestID = dis.readInt();
        uPosition += 4;
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        pad1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        pad3 = dis.readInt();
        uPosition += 4;
        numberOfRecordSets = dis.readInt();
        uPosition += 4;
        for (int idx = 0; idx < numberOfRecordSets; idx++)
        {
            RecordSpecification anX = new RecordSpecification();
            uPosition += anX.unmarshal(dis);
            recordSets.add(anX);
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
@Override
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   byteBuffer.putInt( (int)requestID);
   requiredReliabilityService.marshal(byteBuffer);
   byteBuffer.put( (byte)pad1);
   byteBuffer.putShort( (short)pad2);
   byteBuffer.putInt( (int)pad3);
   byteBuffer.putInt( (int)recordSets.size());

   for (int idx = 0; idx < recordSets.size(); idx++)
   {
        RecordSpecification aRecordSpecification = recordSets.get(idx);
        aRecordSpecification.marshal(byteBuffer);
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
@Override
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute requestID marked as not serialized
        requestID = byteBuffer.getInt();
        // attribute requiredReliabilityService marked as not serialized
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
        // attribute pad1 marked as not serialized
        pad1 = (byte)(byteBuffer.get() & 0xFF);
        // attribute pad2 marked as not serialized
        pad2 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute pad3 marked as not serialized
        pad3 = byteBuffer.getInt();
        // attribute numberOfRecordSets marked as not serialized
        numberOfRecordSets = byteBuffer.getInt();
        // attribute recordSets marked as not serialized
        for (int idx = 0; idx < numberOfRecordSets; idx++)
        {
        RecordSpecification anX = new RecordSpecification();
        anX.unmarshal(byteBuffer);
        recordSets.add(anX);
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
     final SetRecordRPdu rhs = (SetRecordRPdu)obj;

     if( ! (requestID == rhs.requestID)) return false;
     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) return false;
     if( ! (pad1 == rhs.pad1)) return false;
     if( ! (pad2 == rhs.pad2)) return false;
     if( ! (pad3 == rhs.pad3)) return false;
     if( ! Objects.equals(recordSets, rhs.recordSets) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" requestID:").append(requestID); // writeOneToString
    sb.append(" requiredReliabilityService:").append(requiredReliabilityService); // writeOneToString
    sb.append(" pad1:").append(pad1); // writeOneToString
    sb.append(" pad2:").append(pad2); // writeOneToString
    sb.append(" pad3:").append(pad3); // writeOneToString
    sb.append(" recordSets: ");
    recordSets.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.requestID,
	                     this.requiredReliabilityService,
	                     this.pad1,
	                     this.pad2,
	                     this.pad3,
	                     this.numberOfRecordSets,
	                     this.recordSets);
 }
} // end of SetRecordRPdu
