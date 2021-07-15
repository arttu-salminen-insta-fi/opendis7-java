/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Basic operational data for IFF. Section 6.2.39
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class FundamentalOperationalData extends Object implements Serializable
{
   /** system status, IEEE DIS 7 defined */
   protected byte  systemStatus;

   /** data field 1 */
   protected byte  dataField1;

   /** eight boolean fields */
   protected byte  informationLayers;

   /** enumeration */
   protected byte  dataField2;

   /** parameter, enumeration */
   protected short  parameter1;

   /** parameter, enumeration */
   protected short  parameter2;

   /** parameter, enumeration */
   protected short  parameter3;

   /** parameter, enumeration */
   protected short  parameter4;

   /** parameter, enumeration */
   protected short  parameter5;

   /** parameter, enumeration */
   protected short  parameter6;


/** Constructor */
 public FundamentalOperationalData()
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

   marshalSize += 1;  // systemStatus
   marshalSize += 1;  // dataField1
   marshalSize += 1;  // informationLayers
   marshalSize += 1;  // dataField2
   marshalSize += 2;  // parameter1
   marshalSize += 2;  // parameter2
   marshalSize += 2;  // parameter3
   marshalSize += 2;  // parameter4
   marshalSize += 2;  // parameter5
   marshalSize += 2;  // parameter6

   return marshalSize;
}


/** Setter for {@link FundamentalOperationalData#systemStatus}
  * @param pSystemStatus new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setSystemStatus(byte pSystemStatus)
{
    systemStatus = pSystemStatus;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#systemStatus}
  * @param pSystemStatus new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setSystemStatus(int pSystemStatus){
    systemStatus = (byte) pSystemStatus;
    return this;
}

/** Getter for {@link FundamentalOperationalData#systemStatus}
  * @return value of interest */
public byte getSystemStatus()
{
    return systemStatus; 
}

/** Setter for {@link FundamentalOperationalData#dataField1}
  * @param pDataField1 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setDataField1(byte pDataField1)
{
    dataField1 = pDataField1;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#dataField1}
  * @param pDataField1 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setDataField1(int pDataField1){
    dataField1 = (byte) pDataField1;
    return this;
}

/** Getter for {@link FundamentalOperationalData#dataField1}
  * @return value of interest */
public byte getDataField1()
{
    return dataField1; 
}

/** Setter for {@link FundamentalOperationalData#informationLayers}
  * @param pInformationLayers new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setInformationLayers(byte pInformationLayers)
{
    informationLayers = pInformationLayers;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#informationLayers}
  * @param pInformationLayers new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setInformationLayers(int pInformationLayers){
    informationLayers = (byte) pInformationLayers;
    return this;
}

/** Getter for {@link FundamentalOperationalData#informationLayers}
  * @return value of interest */
public byte getInformationLayers()
{
    return informationLayers; 
}

/** Setter for {@link FundamentalOperationalData#dataField2}
  * @param pDataField2 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setDataField2(byte pDataField2)
{
    dataField2 = pDataField2;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#dataField2}
  * @param pDataField2 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setDataField2(int pDataField2){
    dataField2 = (byte) pDataField2;
    return this;
}

/** Getter for {@link FundamentalOperationalData#dataField2}
  * @return value of interest */
public byte getDataField2()
{
    return dataField2; 
}

/** Setter for {@link FundamentalOperationalData#parameter1}
  * @param pParameter1 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter1(short pParameter1)
{
    parameter1 = pParameter1;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#parameter1}
  * @param pParameter1 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter1(int pParameter1){
    parameter1 = (short) pParameter1;
    return this;
}

/** Getter for {@link FundamentalOperationalData#parameter1}
  * @return value of interest */
public short getParameter1()
{
    return parameter1; 
}

/** Setter for {@link FundamentalOperationalData#parameter2}
  * @param pParameter2 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter2(short pParameter2)
{
    parameter2 = pParameter2;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#parameter2}
  * @param pParameter2 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter2(int pParameter2){
    parameter2 = (short) pParameter2;
    return this;
}

/** Getter for {@link FundamentalOperationalData#parameter2}
  * @return value of interest */
public short getParameter2()
{
    return parameter2; 
}

/** Setter for {@link FundamentalOperationalData#parameter3}
  * @param pParameter3 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter3(short pParameter3)
{
    parameter3 = pParameter3;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#parameter3}
  * @param pParameter3 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter3(int pParameter3){
    parameter3 = (short) pParameter3;
    return this;
}

/** Getter for {@link FundamentalOperationalData#parameter3}
  * @return value of interest */
public short getParameter3()
{
    return parameter3; 
}

/** Setter for {@link FundamentalOperationalData#parameter4}
  * @param pParameter4 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter4(short pParameter4)
{
    parameter4 = pParameter4;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#parameter4}
  * @param pParameter4 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter4(int pParameter4){
    parameter4 = (short) pParameter4;
    return this;
}

/** Getter for {@link FundamentalOperationalData#parameter4}
  * @return value of interest */
public short getParameter4()
{
    return parameter4; 
}

/** Setter for {@link FundamentalOperationalData#parameter5}
  * @param pParameter5 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter5(short pParameter5)
{
    parameter5 = pParameter5;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#parameter5}
  * @param pParameter5 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter5(int pParameter5){
    parameter5 = (short) pParameter5;
    return this;
}

/** Getter for {@link FundamentalOperationalData#parameter5}
  * @return value of interest */
public short getParameter5()
{
    return parameter5; 
}

/** Setter for {@link FundamentalOperationalData#parameter6}
  * @param pParameter6 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter6(short pParameter6)
{
    parameter6 = pParameter6;
    return this;
}
/** Utility setter for {@link FundamentalOperationalData#parameter6}
  * @param pParameter6 new value of interest
  * @return same object to permit progressive setters */
public FundamentalOperationalData setParameter6(int pParameter6){
    parameter6 = (short) pParameter6;
    return this;
}

/** Getter for {@link FundamentalOperationalData#parameter6}
  * @return value of interest */
public short getParameter6()
{
    return parameter6; 
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
       dos.writeByte(systemStatus);
       dos.writeByte(dataField1);
       dos.writeByte(informationLayers);
       dos.writeByte(dataField2);
       dos.writeShort(parameter1);
       dos.writeShort(parameter2);
       dos.writeShort(parameter3);
       dos.writeShort(parameter4);
       dos.writeShort(parameter5);
       dos.writeShort(parameter6);
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
        systemStatus = (byte)dis.readUnsignedByte();
        uPosition += 1;
        dataField1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        informationLayers = (byte)dis.readUnsignedByte();
        uPosition += 1;
        dataField2 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        parameter1 = (short)dis.readUnsignedShort();
        uPosition += 2;
        parameter2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        parameter3 = (short)dis.readUnsignedShort();
        uPosition += 2;
        parameter4 = (short)dis.readUnsignedShort();
        uPosition += 2;
        parameter5 = (short)dis.readUnsignedShort();
        uPosition += 2;
        parameter6 = (short)dis.readUnsignedShort();
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
   byteBuffer.put( (byte)systemStatus);
   byteBuffer.put( (byte)dataField1);
   byteBuffer.put( (byte)informationLayers);
   byteBuffer.put( (byte)dataField2);
   byteBuffer.putShort( (short)parameter1);
   byteBuffer.putShort( (short)parameter2);
   byteBuffer.putShort( (short)parameter3);
   byteBuffer.putShort( (short)parameter4);
   byteBuffer.putShort( (short)parameter5);
   byteBuffer.putShort( (short)parameter6);
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
    systemStatus = (byte)(byteBuffer.get() & 0xFF);
    dataField1 = (byte)(byteBuffer.get() & 0xFF);
    informationLayers = (byte)(byteBuffer.get() & 0xFF);
    dataField2 = (byte)(byteBuffer.get() & 0xFF);
    parameter1 = (short)(byteBuffer.getShort() & 0xFFFF);
    parameter2 = (short)(byteBuffer.getShort() & 0xFFFF);
    parameter3 = (short)(byteBuffer.getShort() & 0xFFFF);
    parameter4 = (short)(byteBuffer.getShort() & 0xFFFF);
    parameter5 = (short)(byteBuffer.getShort() & 0xFFFF);
    parameter6 = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final FundamentalOperationalData rhs = (FundamentalOperationalData)obj;

     if( ! (systemStatus == rhs.systemStatus)) ivarsEqual = false;
     if( ! (dataField1 == rhs.dataField1)) ivarsEqual = false;
     if( ! (informationLayers == rhs.informationLayers)) ivarsEqual = false;
     if( ! (dataField2 == rhs.dataField2)) ivarsEqual = false;
     if( ! (parameter1 == rhs.parameter1)) ivarsEqual = false;
     if( ! (parameter2 == rhs.parameter2)) ivarsEqual = false;
     if( ! (parameter3 == rhs.parameter3)) ivarsEqual = false;
     if( ! (parameter4 == rhs.parameter4)) ivarsEqual = false;
     if( ! (parameter5 == rhs.parameter5)) ivarsEqual = false;
     if( ! (parameter6 == rhs.parameter6)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" systemStatus: ").append(systemStatus).append("\n");
    sb.append(" dataField1: ").append(dataField1).append("\n");
    sb.append(" informationLayers: ").append(informationLayers).append("\n");
    sb.append(" dataField2: ").append(dataField2).append("\n");
    sb.append(" parameter1: ").append(parameter1).append("\n");
    sb.append(" parameter2: ").append(parameter2).append("\n");
    sb.append(" parameter3: ").append(parameter3).append("\n");
    sb.append(" parameter4: ").append(parameter4).append("\n");
    sb.append(" parameter5: ").append(parameter5).append("\n");
    sb.append(" parameter6: ").append(parameter6).append("\n");

   return sb.toString();
 }
} // end of class
