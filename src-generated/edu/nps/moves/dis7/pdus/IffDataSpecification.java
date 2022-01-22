/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
// header autogenerated using string template dis7javalicense.txt

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Requires hand coding to be useful. Section 6.2.43
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class IffDataSpecification extends Object implements Serializable
{
   /** Number of iff records */
   protected short numberOfIffDataRecords;

   /** IFF data records */
   protected List< IFFData > iffDataRecords = new ArrayList< IFFData >();
 

/** Constructor creates and configures a new instance object */
 public IffDataSpecification()
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

   marshalSize += 2;  // numberOfIffDataRecords
   if (iffDataRecords != null)
       for (int idx=0; idx < iffDataRecords.size(); idx++)
       {
            IFFData listElement = iffDataRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link IffDataSpecification#iffDataRecords}
  * @param pIffDataRecords new value of interest
  * @return same object to permit progressive setters */
public IffDataSpecification setIffDataRecords(List<IFFData> pIffDataRecords)
{
    iffDataRecords = pIffDataRecords;
    return this;
}
/** Getter for {@link IffDataSpecification#iffDataRecords}
  * @return value of interest */
public List<IFFData> getIffDataRecords()
{
    return iffDataRecords; 
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
       dos.writeShort(iffDataRecords.size());

       for (int idx = 0; idx < iffDataRecords.size(); idx++)
       {
            IFFData aIFFData = iffDataRecords.get(idx);
            aIFFData.marshal(dos);
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
    try 
    {
        numberOfIffDataRecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfIffDataRecords; idx++)
        {
            IFFData anX = new IFFData();
            uPosition += anX.unmarshal(dis);
            iffDataRecords.add(anX);
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
   byteBuffer.putShort( (short)iffDataRecords.size());

   for (int idx = 0; idx < iffDataRecords.size(); idx++)
   {
        IFFData aIFFData = iffDataRecords.get(idx);
        aIFFData.marshal(byteBuffer);
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
    try
    {
        // attribute numberOfIffDataRecords marked as not serialized
        numberOfIffDataRecords = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute iffDataRecords marked as not serialized
        for (int idx = 0; idx < numberOfIffDataRecords; idx++)
        {
        IFFData anX = new IFFData();
        anX.unmarshal(byteBuffer);
        iffDataRecords.add(anX);
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

     final IffDataSpecification rhs = (IffDataSpecification)obj;


     for (int idx = 0; idx < iffDataRecords.size(); idx++)
        if( ! ( iffDataRecords.get(idx).equals(rhs.iffDataRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" iffDataRecords: ");
    iffDataRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
