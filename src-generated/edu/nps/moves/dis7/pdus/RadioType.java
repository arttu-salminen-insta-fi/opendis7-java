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

/**
 * Identifies the type of radio. Section 6.2.71
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class RadioType extends Object implements Serializable
{
   /** Kind of entity uid 7 */
   protected EntityKind entityKind = EntityKind.RADIO;

   /** Domain of entity (air, surface, subsurface, space, etc.) */
   protected byte domain;

   /** country to which the design of the entity is attributed uid 29 */
   protected Country country = Country.values()[0];

   /** category of entity uid 22 */
   protected RadioCategory category = RadioCategory.values()[0];

   /** specific info based on subcategory field uid 23 */
   protected RadioSubcategory subcategory = RadioSubcategory.values()[0];

   /** specific is an undescribed parameter... */
   protected byte specific;

   /** extra is an undescribed parameter... */
   protected byte extra;


/** Constructor creates and configures a new instance object */
 public RadioType()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public synchronized int getMarshalledSize()
{
   int marshalSize = 0; 

   if (entityKind != null)
       marshalSize += entityKind.getMarshalledSize();
   marshalSize += 1;  // domain
   if (country != null)
       marshalSize += country.getMarshalledSize();
   if (category != null)
       marshalSize += category.getMarshalledSize();
   if (subcategory != null)
       marshalSize += subcategory.getMarshalledSize();
   marshalSize += 1;  // specific
   marshalSize += 1;  // extra

   return marshalSize;
}


/** Setter for {@link RadioType#entityKind}
  * @param pEntityKind new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setEntityKind(EntityKind pEntityKind)
{
    entityKind = pEntityKind;
    return this;
}
/** Getter for {@link RadioType#entityKind}
  * @return value of interest */
public EntityKind getEntityKind()
{
    return entityKind; 
}

/** Setter for {@link RadioType#domain}
  * @param pDomain new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setDomain(byte pDomain)
{
    domain = pDomain;
    return this;
}
/** Utility setter for {@link RadioType#domain}
  * @param pDomain new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setDomain(int pDomain){
    domain = (byte) pDomain;
    return this;
}
/** Getter for {@link RadioType#domain}
  * @return value of interest */
public byte getDomain()
{
    return domain; 
}

/** Setter for {@link RadioType#country}
  * @param pCountry new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setCountry(Country pCountry)
{
    country = pCountry;
    return this;
}
/** Getter for {@link RadioType#country}
  * @return value of interest */
public Country getCountry()
{
    return country; 
}

/** Setter for {@link RadioType#category}
  * @param pCategory new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setCategory(RadioCategory pCategory)
{
    category = pCategory;
    return this;
}
/** Getter for {@link RadioType#category}
  * @return value of interest */
public RadioCategory getCategory()
{
    return category; 
}

/** Setter for {@link RadioType#subcategory}
  * @param pSubcategory new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setSubcategory(RadioSubcategory pSubcategory)
{
    subcategory = pSubcategory;
    return this;
}
/** Getter for {@link RadioType#subcategory}
  * @return value of interest */
public RadioSubcategory getSubcategory()
{
    return subcategory; 
}

/** Setter for {@link RadioType#specific}
  * @param pSpecific new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setSpecific(byte pSpecific)
{
    specific = pSpecific;
    return this;
}
/** Utility setter for {@link RadioType#specific}
  * @param pSpecific new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setSpecific(int pSpecific){
    specific = (byte) pSpecific;
    return this;
}
/** Getter for {@link RadioType#specific}
  * @return value of interest */
public byte getSpecific()
{
    return specific; 
}

/** Setter for {@link RadioType#extra}
  * @param pExtra new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setExtra(byte pExtra)
{
    extra = pExtra;
    return this;
}
/** Utility setter for {@link RadioType#extra}
  * @param pExtra new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioType setExtra(int pExtra){
    extra = (byte) pExtra;
    return this;
}
/** Getter for {@link RadioType#extra}
  * @return value of interest */
public byte getExtra()
{
    return extra; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       entityKind.marshal(dos);
       dos.writeByte(domain);
       country.marshal(dos);
       category.marshal(dos);
       subcategory.marshal(dos);
       dos.writeByte(specific);
       dos.writeByte(extra);
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
    try 
    {
        entityKind = EntityKind.unmarshalEnum(dis);
        uPosition += entityKind.getMarshalledSize();
        domain = (byte)dis.readUnsignedByte();
        uPosition += 1;
        country = Country.unmarshalEnum(dis);
        uPosition += country.getMarshalledSize();
        category = RadioCategory.unmarshalEnum(dis);
        uPosition += category.getMarshalledSize();
        subcategory = RadioSubcategory.unmarshalEnum(dis);
        uPosition += subcategory.getMarshalledSize();
        specific = (byte)dis.readUnsignedByte();
        uPosition += 1;
        extra = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   entityKind.marshal(byteBuffer);
   byteBuffer.put( (byte)domain);
   country.marshal(byteBuffer);
   category.marshal(byteBuffer);
   subcategory.marshal(byteBuffer);
   byteBuffer.put( (byte)specific);
   byteBuffer.put( (byte)extra);
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
    try
    {
        // attribute entityKind marked as not serialized
        entityKind = EntityKind.unmarshalEnum(byteBuffer);
        // attribute domain marked as not serialized
        domain = (byte)(byteBuffer.get() & 0xFF);
        // attribute country marked as not serialized
        country = Country.unmarshalEnum(byteBuffer);
        // attribute category marked as not serialized
        category = RadioCategory.unmarshalEnum(byteBuffer);
        // attribute subcategory marked as not serialized
        subcategory = RadioSubcategory.unmarshalEnum(byteBuffer);
        // attribute specific marked as not serialized
        specific = (byte)(byteBuffer.get() & 0xFF);
        // attribute extra marked as not serialized
        extra = (byte)(byteBuffer.get() & 0xFF);
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public synchronized boolean equalsImpl(Object obj)
 {
     final RadioType rhs = (RadioType)obj;

     if( ! (entityKind == rhs.entityKind)) return false;
     if( ! (domain == rhs.domain)) return false;
     if( ! (country == rhs.country)) return false;
     if( ! (category == rhs.category)) return false;
     if( ! (subcategory == rhs.subcategory)) return false;
     if( ! (specific == rhs.specific)) return false;
     if( ! (extra == rhs.extra)) return false;
    return true;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" entityKind:").append(entityKind); // writeOneToString
    sb.append(" domain:").append(domain); // writeOneToString
    sb.append(" country:").append(country); // writeOneToString
    sb.append(" category:").append(category); // writeOneToString
    sb.append(" subcategory:").append(subcategory); // writeOneToString
    sb.append(" specific:").append(specific); // writeOneToString
    sb.append(" extra:").append(extra); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.entityKind,
	                     this.domain,
	                     this.country,
	                     this.category,
	                     this.subcategory,
	                     this.specific,
	                     this.extra);
 }
} // end of RadioType
