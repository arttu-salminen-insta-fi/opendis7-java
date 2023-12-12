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
 * 9.4.2 The Time Space Position Information (TSPI) PDU shall communicate information about the LE’s state vector.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class TSPIPdu extends LiveEntityFamilyPdu implements Serializable
{
   /** liveEntityId is an undescribed parameter... */
   protected EntityID  liveEntityId = new EntityID(); 

   /** bit field */
   protected byte TSPIFlag;

   /** entityLocation is an undescribed parameter... */
   protected LiveEntityRelativeWorldCoordinates  entityLocation = new LiveEntityRelativeWorldCoordinates(); 

   /** entityLinearVelocity is an undescribed parameter... */
   protected LiveEntityLinearVelocity  entityLinearVelocity = new LiveEntityLinearVelocity(); 

   /** entityOrientation is an undescribed parameter... */
   protected LiveEntityOrientation  entityOrientation = new LiveEntityOrientation(); 

   /** positionError is an undescribed parameter... */
   protected LiveEntityPositionError  positionError = new LiveEntityPositionError(); 

   /** orientationError is an undescribed parameter... */
   protected LiveEntityOrientationError  orientationError = new LiveEntityOrientationError(); 

   /** deadReckoningParameters is an undescribed parameter... */
   protected LiveDeadReckoningParameters  deadReckoningParameters = new LiveDeadReckoningParameters(); 

   /** measuredSpeed is an undescribed parameter... */
   protected short measuredSpeed;

   /** systemSpecificDataLength is an undescribed parameter... */
   protected byte systemSpecificDataLength;

   /** systemSpecificData is an undescribed parameter... */
   protected byte[]  systemSpecificData = new byte[0]; 


/** Constructor creates and configures a new instance object */
 public TSPIPdu()
 {
    setPduType( DisPduType.TIME_SPACE_POSITION_INFORMATION );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized TSPIPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized TSPIPdu copyByteBuffer()
 {
     TSPIPdu newCopy = new TSPIPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("TSPIPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized TSPIPdu copyDataOutputStream()
 {
     TSPIPdu newCopy = new TSPIPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("TSPIPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("TSPIPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (liveEntityId != null)
       marshalSize += liveEntityId.getMarshalledSize();
   marshalSize += 1;  // TSPIFlag
   if (entityLocation != null)
       marshalSize += entityLocation.getMarshalledSize();
   if (entityLinearVelocity != null)
       marshalSize += entityLinearVelocity.getMarshalledSize();
   if (entityOrientation != null)
       marshalSize += entityOrientation.getMarshalledSize();
   if (positionError != null)
       marshalSize += positionError.getMarshalledSize();
   if (orientationError != null)
       marshalSize += orientationError.getMarshalledSize();
   if (deadReckoningParameters != null)
       marshalSize += deadReckoningParameters.getMarshalledSize();
   marshalSize += 2;  // measuredSpeed
   marshalSize += 1;  // systemSpecificDataLength
   if (systemSpecificData != null)
       marshalSize += systemSpecificData.length * 1;

   return marshalSize;
}


/** Setter for {@link TSPIPdu#liveEntityId}
  * @param pLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setLiveEntityId(EntityID pLiveEntityId)
{
    liveEntityId = pLiveEntityId;
    return this;
}
/** Getter for {@link TSPIPdu#liveEntityId}
  * @return value of interest */
public EntityID getLiveEntityId()
{
    return liveEntityId;
}


/** Setter for {@link TSPIPdu#TSPIFlag}
  * @param pTSPIFlag new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setTSPIFlag(byte pTSPIFlag)
{
    TSPIFlag = pTSPIFlag;
    return this;
}
/** Utility setter for {@link TSPIPdu#TSPIFlag}
  * @param pTSPIFlag new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setTSPIFlag(int pTSPIFlag){
    TSPIFlag = (byte) pTSPIFlag;
    return this;
}
/** Getter for {@link TSPIPdu#TSPIFlag}
  * @return value of interest */
public byte getTSPIFlag()
{
    return TSPIFlag; 
}

/** Setter for {@link TSPIPdu#entityLocation}
  * @param pEntityLocation new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setEntityLocation(LiveEntityRelativeWorldCoordinates pEntityLocation)
{
    entityLocation = pEntityLocation;
    return this;
}
/** Getter for {@link TSPIPdu#entityLocation}
  * @return value of interest */
public LiveEntityRelativeWorldCoordinates getEntityLocation()
{
    return entityLocation;
}


/** Setter for {@link TSPIPdu#entityLinearVelocity}
  * @param pEntityLinearVelocity new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setEntityLinearVelocity(LiveEntityLinearVelocity pEntityLinearVelocity)
{
    entityLinearVelocity = pEntityLinearVelocity;
    return this;
}
/** Getter for {@link TSPIPdu#entityLinearVelocity}
  * @return value of interest */
public LiveEntityLinearVelocity getEntityLinearVelocity()
{
    return entityLinearVelocity;
}


/** Setter for {@link TSPIPdu#entityOrientation}
  * @param pEntityOrientation new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setEntityOrientation(LiveEntityOrientation pEntityOrientation)
{
    entityOrientation = pEntityOrientation;
    return this;
}
/** Getter for {@link TSPIPdu#entityOrientation}
  * @return value of interest */
public LiveEntityOrientation getEntityOrientation()
{
    return entityOrientation;
}


/** Setter for {@link TSPIPdu#positionError}
  * @param pPositionError new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setPositionError(LiveEntityPositionError pPositionError)
{
    positionError = pPositionError;
    return this;
}
/** Getter for {@link TSPIPdu#positionError}
  * @return value of interest */
public LiveEntityPositionError getPositionError()
{
    return positionError;
}


/** Setter for {@link TSPIPdu#orientationError}
  * @param pOrientationError new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setOrientationError(LiveEntityOrientationError pOrientationError)
{
    orientationError = pOrientationError;
    return this;
}
/** Getter for {@link TSPIPdu#orientationError}
  * @return value of interest */
public LiveEntityOrientationError getOrientationError()
{
    return orientationError;
}


/** Setter for {@link TSPIPdu#deadReckoningParameters}
  * @param pDeadReckoningParameters new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setDeadReckoningParameters(LiveDeadReckoningParameters pDeadReckoningParameters)
{
    deadReckoningParameters = pDeadReckoningParameters;
    return this;
}
/** Getter for {@link TSPIPdu#deadReckoningParameters}
  * @return value of interest */
public LiveDeadReckoningParameters getDeadReckoningParameters()
{
    return deadReckoningParameters;
}


/** Setter for {@link TSPIPdu#measuredSpeed}
  * @param pMeasuredSpeed new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setMeasuredSpeed(short pMeasuredSpeed)
{
    measuredSpeed = pMeasuredSpeed;
    return this;
}
/** Utility setter for {@link TSPIPdu#measuredSpeed}
  * @param pMeasuredSpeed new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setMeasuredSpeed(int pMeasuredSpeed){
    measuredSpeed = (short) pMeasuredSpeed;
    return this;
}
/** Getter for {@link TSPIPdu#measuredSpeed}
  * @return value of interest */
public short getMeasuredSpeed()
{
    return measuredSpeed; 
}

/** Setter for {@link TSPIPdu#systemSpecificData}
  * @param pSystemSpecificData new value of interest
  * @return same object to permit progressive setters */
public synchronized TSPIPdu setSystemSpecificData(byte[] pSystemSpecificData)
{
    systemSpecificData = pSystemSpecificData;
    return this;
}
/** Getter for {@link TSPIPdu#systemSpecificData}
  * @return value of interest */
public byte[] getSystemSpecificData()
{
    return systemSpecificData; 
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
       liveEntityId.marshal(dos);
       dos.writeByte(TSPIFlag);
       entityLocation.marshal(dos);
       entityLinearVelocity.marshal(dos);
       entityOrientation.marshal(dos);
       positionError.marshal(dos);
       orientationError.marshal(dos);
       deadReckoningParameters.marshal(dos);
       dos.writeShort(measuredSpeed);
       dos.writeByte(systemSpecificData.length);

       for (int idx = 0; idx < systemSpecificData.length; idx++)
           dos.writeByte(systemSpecificData[idx]);

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
        uPosition += liveEntityId.unmarshal(dis);
        TSPIFlag = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += entityLocation.unmarshal(dis);
        uPosition += entityLinearVelocity.unmarshal(dis);
        uPosition += entityOrientation.unmarshal(dis);
        uPosition += positionError.unmarshal(dis);
        uPosition += orientationError.unmarshal(dis);
        uPosition += deadReckoningParameters.unmarshal(dis);
        measuredSpeed = (short)dis.readUnsignedShort();
        uPosition += 2;
        systemSpecificDataLength = (byte)dis.readUnsignedByte();
        uPosition += 1;
        for (int idx = 0; idx < systemSpecificData.length; idx++)
            systemSpecificData[idx] = dis.readByte();
        uPosition += (systemSpecificData.length * 1);
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
   liveEntityId.marshal(byteBuffer);
   byteBuffer.put( (byte)TSPIFlag);
   entityLocation.marshal(byteBuffer);
   entityLinearVelocity.marshal(byteBuffer);
   entityOrientation.marshal(byteBuffer);
   positionError.marshal(byteBuffer);
   orientationError.marshal(byteBuffer);
   deadReckoningParameters.marshal(byteBuffer);
   byteBuffer.putShort( (short)measuredSpeed);
   byteBuffer.put( (byte)systemSpecificData.length);

   for (int idx = 0; idx < systemSpecificData.length; idx++)
       byteBuffer.put((byte)systemSpecificData[idx]);

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
        // attribute liveEntityId marked as not serialized
        liveEntityId.unmarshal(byteBuffer);
        // attribute TSPIFlag marked as not serialized
        TSPIFlag = (byte)(byteBuffer.get() & 0xFF);
        // attribute entityLocation marked as not serialized
        entityLocation.unmarshal(byteBuffer);
        // attribute entityLinearVelocity marked as not serialized
        entityLinearVelocity.unmarshal(byteBuffer);
        // attribute entityOrientation marked as not serialized
        entityOrientation.unmarshal(byteBuffer);
        // attribute positionError marked as not serialized
        positionError.unmarshal(byteBuffer);
        // attribute orientationError marked as not serialized
        orientationError.unmarshal(byteBuffer);
        // attribute deadReckoningParameters marked as not serialized
        deadReckoningParameters.unmarshal(byteBuffer);
        // attribute measuredSpeed marked as not serialized
        measuredSpeed = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute systemSpecificDataLength marked as not serialized
        systemSpecificDataLength = (byte)(byteBuffer.get() & 0xFF);
        // attribute systemSpecificData marked as not serialized
        for (int idx = 0; idx < systemSpecificData.length; idx++)
            systemSpecificData[idx] = byteBuffer.get();
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

     final TSPIPdu rhs = (TSPIPdu)obj;

     if( ! (liveEntityId.equals( rhs.liveEntityId) )) ivarsEqual = false;
     if( ! (TSPIFlag == rhs.TSPIFlag)) ivarsEqual = false;
     if( ! (entityLocation.equals( rhs.entityLocation) )) ivarsEqual = false;
     if( ! (entityLinearVelocity.equals( rhs.entityLinearVelocity) )) ivarsEqual = false;
     if( ! (entityOrientation.equals( rhs.entityOrientation) )) ivarsEqual = false;
     if( ! (positionError.equals( rhs.positionError) )) ivarsEqual = false;
     if( ! (orientationError.equals( rhs.orientationError) )) ivarsEqual = false;
     if( ! (deadReckoningParameters.equals( rhs.deadReckoningParameters) )) ivarsEqual = false;
     if( ! (measuredSpeed == rhs.measuredSpeed)) ivarsEqual = false;

     for (int idx = 0; idx < 0; idx++)
     {
          if(!(systemSpecificData[idx] == rhs.systemSpecificData[idx])) ivarsEqual = false;
     }

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" liveEntityId:").append(liveEntityId); // writeOneToString
    sb.append(" TSPIFlag:").append(TSPIFlag); // writeOneToString
    sb.append(" entityLocation:").append(entityLocation); // writeOneToString
    sb.append(" entityLinearVelocity:").append(entityLinearVelocity); // writeOneToString
    sb.append(" entityOrientation:").append(entityOrientation); // writeOneToString
    sb.append(" positionError:").append(positionError); // writeOneToString
    sb.append(" orientationError:").append(orientationError); // writeOneToString
    sb.append(" deadReckoningParameters:").append(deadReckoningParameters); // writeOneToString
    sb.append(" measuredSpeed:").append(measuredSpeed); // writeOneToString
    sb.append(" systemSpecificData:");
    sb.append(Arrays.toString(systemSpecificData)); // writePrimitiveList

   return sb.toString();
 }
} // end of class
