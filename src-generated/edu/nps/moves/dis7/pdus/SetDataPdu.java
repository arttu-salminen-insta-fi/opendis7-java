/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Section 7.5.10. Initializing or changing internal state information shall be communicated using a Set Data PDU. See 5.6.5.10
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class SetDataPdu extends SimulationManagementFamilyPdu implements Serializable
{
   /** ID of request */
   protected int  requestID;

   /** padding */
   protected int  padding1 = (int)0;

   /** Number of fixed datum records */
   protected int  numberOfFixedDatumRecords;

   /** Number of variable datum records, handled automatically by marshaller at run time (and not modifiable by end-user programmers) */
   protected int  numberOfVariableDatumRecords;

   /** variable length list of fixed datums */
   protected List< FixedDatum > fixedDatums = new ArrayList< FixedDatum >();
 
   /** variable length list of variable length datums */
   protected List< VariableDatum > variableDatums = new ArrayList< VariableDatum >();
 

/** Constructor */
 public SetDataPdu()
 {
    setPduType( DISPDUType.SET_DATA );
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
   marshalSize += 4;  // requestID
   marshalSize += 4;  // padding1
   marshalSize += 4;  // numberOfFixedDatumRecords
   marshalSize += 4;  // numberOfVariableDatumRecords
   for(int idx=0; idx < fixedDatums.size(); idx++)
   {
        FixedDatum listElement = fixedDatums.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }
   for(int idx=0; idx < variableDatums.size(); idx++)
   {
        VariableDatum listElement = variableDatums.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link SetDataPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public SetDataPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}

/** Getter for {@link SetDataPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link SetDataPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public SetDataPdu setPadding1(int pPadding1)
{
    padding1 = pPadding1;
    return this;
}

/** Getter for {@link SetDataPdu#padding1}
  * @return value of interest */
public int getPadding1()
{
    return padding1; 
}

/** Setter for {@link SetDataPdu#fixedDatums}
  * @param pFixedDatums new value of interest
  * @return same object to permit progressive setters */
public SetDataPdu setFixedDatums(List<FixedDatum> pFixedDatums)
{
    fixedDatums = pFixedDatums;
    return this;
}

/** Getter for {@link SetDataPdu#fixedDatums}
  * @return value of interest */
public List<FixedDatum> getFixedDatums()
{
    return fixedDatums; 
}

/** Setter for {@link SetDataPdu#variableDatums}
  * @param pVariableDatums new value of interest
  * @return same object to permit progressive setters */
public SetDataPdu setVariableDatums(List<VariableDatum> pVariableDatums)
{
    variableDatums = pVariableDatums;
    return this;
}

/** Getter for {@link SetDataPdu#variableDatums}
  * @return value of interest */
public List<VariableDatum> getVariableDatums()
{
    return variableDatums; 
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
       dos.writeInt(requestID);
       dos.writeInt(padding1);
       dos.writeInt(fixedDatums.size());
       dos.writeInt(variableDatums.size());

       for(int idx = 0; idx < fixedDatums.size(); idx++)
       {
            FixedDatum aFixedDatum = fixedDatums.get(idx);
            aFixedDatum.marshal(dos);
       }


       for(int idx = 0; idx < variableDatums.size(); idx++)
       {
            VariableDatum aVariableDatum = variableDatums.get(idx);
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
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        requestID = dis.readInt();
        uPosition += 4;
        padding1 = dis.readInt();
        uPosition += 4;
        numberOfFixedDatumRecords = dis.readInt();
        uPosition += 4;
        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for(int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
            FixedDatum anX = new FixedDatum();
            uPosition += anX.unmarshal(dis);
            fixedDatums.add(anX);
        }

        for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
            VariableDatum anX = new VariableDatum();
            uPosition += anX.unmarshal(dis);
            variableDatums.add(anX);
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
   byteBuffer.putInt( (int)requestID);
   byteBuffer.putInt( (int)padding1);
   byteBuffer.putInt( (int)fixedDatums.size());
   byteBuffer.putInt( (int)variableDatums.size());

   for(int idx = 0; idx < fixedDatums.size(); idx++)
   {
        FixedDatum aFixedDatum = fixedDatums.get(idx);
        aFixedDatum.marshal(byteBuffer);
   }


   for(int idx = 0; idx < variableDatums.size(); idx++)
   {
        VariableDatum aVariableDatum = variableDatums.get(idx);
        aVariableDatum.marshal(byteBuffer);
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
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    requestID = byteBuffer.getInt();
    padding1 = byteBuffer.getInt();
    numberOfFixedDatumRecords = byteBuffer.getInt();
    numberOfVariableDatumRecords = byteBuffer.getInt();
    for(int idx = 0; idx < numberOfFixedDatumRecords; idx++)
    {
    FixedDatum anX = new FixedDatum();
    anX.unmarshal(byteBuffer);
    fixedDatums.add(anX);
    }

    for(int idx = 0; idx < numberOfVariableDatumRecords; idx++)
    {
    VariableDatum anX = new VariableDatum();
    anX.unmarshal(byteBuffer);
    variableDatums.add(anX);
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

     final SetDataPdu rhs = (SetDataPdu)obj;

     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;

     for(int idx = 0; idx < fixedDatums.size(); idx++)
        if( ! ( fixedDatums.get(idx).equals(rhs.fixedDatums.get(idx)))) ivarsEqual = false;


     for(int idx = 0; idx < variableDatums.size(); idx++)
        if( ! ( variableDatums.get(idx).equals(rhs.variableDatums.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" requestID: ").append(requestID).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" fixedDatums: ").append("\n");
    fixedDatums.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});
    sb.append(" variableDatums: ").append("\n");
    variableDatums.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
