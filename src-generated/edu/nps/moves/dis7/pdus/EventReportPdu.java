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
 * 7.5.12 A managed entity shall report the occurrence of a significant event to the simulation manager (SM) using an Event Report PDU. See 5.6.5.12.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class EventReportPdu extends SimulationManagementFamilyPdu implements Serializable
{
   /** Type of event uid 73 */
   protected EventReportEventType eventType = EventReportEventType.values()[0];

   /** padding */
   protected int padding1 = (int)0;

   /** Number of fixed datum records */
   protected int numberOfFixedDatumRecords;

   /** Number of variable datum records, handled automatically by marshaller at run time (and not modifiable by end-user programmers) */
   protected int numberOfVariableDatumRecords;

   /** variable length list of fixed datums */
   protected List< FixedDatum > fixedDatums = new ArrayList< FixedDatum >();
 
   /** variable length list of variable length datums */
   protected List< VariableDatum > variableDatums = new ArrayList< VariableDatum >();
 

/** Constructor creates and configures a new instance object */
 public EventReportPdu()
 {
    setPduType( DisPduType.EVENT_REPORT );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized EventReportPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized EventReportPdu copyByteBuffer()
 {
     EventReportPdu newCopy = new EventReportPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("EventReportPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized EventReportPdu copyDataOutputStream()
 {
     EventReportPdu newCopy = new EventReportPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("EventReportPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("EventReportPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (eventType != null)
       marshalSize += eventType.getMarshalledSize();
   marshalSize += 4;  // padding1
   marshalSize += 4;  // numberOfFixedDatumRecords
   marshalSize += 4;  // numberOfVariableDatumRecords
   if (fixedDatums != null)
       for (int idx=0; idx < fixedDatums.size(); idx++)
       {
            FixedDatum listElement = fixedDatums.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }
   if (variableDatums != null)
       for (int idx=0; idx < variableDatums.size(); idx++)
       {
            VariableDatum listElement = variableDatums.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link EventReportPdu#eventType}
  * @param pEventType new value of interest
  * @return same object to permit progressive setters */
public synchronized EventReportPdu setEventType(EventReportEventType pEventType)
{
    eventType = pEventType;
    return this;
}
/** Getter for {@link EventReportPdu#eventType}
  * @return value of interest */
public EventReportEventType getEventType()
{
    return eventType; 
}

/** Setter for {@link EventReportPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public synchronized EventReportPdu setPadding1(int pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Getter for {@link EventReportPdu#padding1}
  * @return value of interest */
public int getPadding1()
{
    return padding1; 
}

/** Setter for {@link EventReportPdu#fixedDatums}
  * @param pFixedDatums new value of interest
  * @return same object to permit progressive setters */
public synchronized EventReportPdu setFixedDatums(List<FixedDatum> pFixedDatums)
{
    fixedDatums = pFixedDatums;
    return this;
}
/** Getter for {@link EventReportPdu#fixedDatums}
  * @return value of interest */
public List<FixedDatum> getFixedDatums()
{
    return fixedDatums; 
}

/** Setter for {@link EventReportPdu#variableDatums}
  * @param pVariableDatums new value of interest
  * @return same object to permit progressive setters */
public synchronized EventReportPdu setVariableDatums(List<VariableDatum> pVariableDatums)
{
    variableDatums = pVariableDatums;
    return this;
}
/** Getter for {@link EventReportPdu#variableDatums}
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
       eventType.marshal(dos);
       dos.writeInt(padding1);
       dos.writeInt(fixedDatums.size());
       dos.writeInt(variableDatums.size());

       for (int idx = 0; idx < fixedDatums.size(); idx++)
       {
            FixedDatum aFixedDatum = fixedDatums.get(idx);
            aFixedDatum.marshal(dos);
       }


       for (int idx = 0; idx < variableDatums.size(); idx++)
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
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        eventType = EventReportEventType.unmarshalEnum(dis);
        uPosition += eventType.getMarshalledSize();
        padding1 = dis.readInt();
        uPosition += 4;
        numberOfFixedDatumRecords = dis.readInt();
        uPosition += 4;
        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
            FixedDatum anX = new FixedDatum();
            uPosition += anX.unmarshal(dis);
            fixedDatums.add(anX);
        }

        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
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
   eventType.marshal(byteBuffer);
   byteBuffer.putInt( (int)padding1);
   byteBuffer.putInt( (int)fixedDatums.size());
   byteBuffer.putInt( (int)variableDatums.size());

   for (int idx = 0; idx < fixedDatums.size(); idx++)
   {
        FixedDatum aFixedDatum = fixedDatums.get(idx);
        aFixedDatum.marshal(byteBuffer);
   }


   for (int idx = 0; idx < variableDatums.size(); idx++)
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
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute eventType marked as not serialized
        eventType = EventReportEventType.unmarshalEnum(byteBuffer);
        // attribute padding1 marked as not serialized
        padding1 = byteBuffer.getInt();
        // attribute numberOfFixedDatumRecords marked as not serialized
        numberOfFixedDatumRecords = byteBuffer.getInt();
        // attribute numberOfVariableDatumRecords marked as not serialized
        numberOfVariableDatumRecords = byteBuffer.getInt();
        // attribute fixedDatums marked as not serialized
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
        FixedDatum anX = new FixedDatum();
        anX.unmarshal(byteBuffer);
        fixedDatums.add(anX);
        }

        // attribute variableDatums marked as not serialized
        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
        VariableDatum anX = new VariableDatum();
        anX.unmarshal(byteBuffer);
        variableDatums.add(anX);
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

     final EventReportPdu rhs = (EventReportPdu)obj;

     if( ! (eventType == rhs.eventType)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;

     for (int idx = 0; idx < fixedDatums.size(); idx++)
        if( ! ( fixedDatums.get(idx).equals(rhs.fixedDatums.get(idx)))) ivarsEqual = false;


     for (int idx = 0; idx < variableDatums.size(); idx++)
        if( ! ( variableDatums.get(idx).equals(rhs.variableDatums.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" eventType:").append(eventType); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" fixedDatums: ");
    fixedDatums.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset
    sb.append(" variableDatums: ");
    variableDatums.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
