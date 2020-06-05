/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Requires hand coding to be useful. Section 6.2.43
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class IffDataSpecification extends Object implements Serializable
{
   /** Number of iff records */
   protected short  numberOfIffDataRecords;

   /** IFF data records */
   protected List< IFFData > iffDataRecords = new ArrayList< IFFData >();
 

/** Constructor */
 public IffDataSpecification()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 2;  // numberOfIffDataRecords
   for(int idx=0; idx < iffDataRecords.size(); idx++)
   {
        IFFData listElement = iffDataRecords.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link IffDataSpecification#iffDataRecords}*/
public IffDataSpecification setIffDataRecords(List<IFFData> pIffDataRecords)
{
    iffDataRecords = pIffDataRecords;
    return this;
}

/** Getter for {@link IffDataSpecification#iffDataRecords}*/
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

       for(int idx = 0; idx < iffDataRecords.size(); idx++)
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
 * Unserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @param dis the InputStream
 * @return unmarshalled size
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        numberOfIffDataRecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfIffDataRecords; idx++)
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
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer buff) throws Exception
{
   buff.putShort( (short)iffDataRecords.size());

   for(int idx = 0; idx < iffDataRecords.size(); idx++)
   {
        IFFData aIFFData = iffDataRecords.get(idx);
        aIFFData.marshal(buff);
   }

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
    numberOfIffDataRecords = (short)(buff.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfIffDataRecords; idx++)
    {
    IFFData anX = new IFFData();
    anX.unmarshal(buff);
    iffDataRecords.add(anX);
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


     for(int idx = 0; idx < iffDataRecords.size(); idx++)
        if( ! ( iffDataRecords.get(idx).equals(rhs.iffDataRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" iffDataRecords: ").append("\n");
    iffDataRecords.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
