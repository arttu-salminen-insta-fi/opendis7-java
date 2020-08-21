/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Explosion of a non-munition. Section 6.2.19.3
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class ExplosionDescriptor extends Object implements Serializable
{
   /** Type of the object that exploded. See 6.2.30 */
   protected EntityType  explodingObject = new EntityType(); 

   /** Material that exploded. Can be grain dust, tnt, gasoline, etc. Enumeration uid 310 */
   protected ExplosiveMaterialCategories explosiveMaterial = ExplosiveMaterialCategories.values()[0];

   /** padding */
   protected short  padding = (short)0;

   /** Force of explosion, in equivalent KG of TNT */
   protected float  explosiveForce;


/** Constructor */
 public ExplosionDescriptor()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += explodingObject.getMarshalledSize();
   marshalSize += explosiveMaterial.getMarshalledSize();
   marshalSize += 2;  // padding
   marshalSize += 4;  // explosiveForce

   return marshalSize;
}


/** Setter for {@link ExplosionDescriptor#explodingObject}*/
public ExplosionDescriptor setExplodingObject(EntityType pExplodingObject)
{
    explodingObject = pExplodingObject;
    return this;
}

/** Getter for {@link ExplosionDescriptor#explodingObject}*/
public EntityType getExplodingObject()
{
    return explodingObject; 
}

/** Setter for {@link ExplosionDescriptor#explosiveMaterial}*/
public ExplosionDescriptor setExplosiveMaterial(ExplosiveMaterialCategories pExplosiveMaterial)
{
    explosiveMaterial = pExplosiveMaterial;
    return this;
}

/** Getter for {@link ExplosionDescriptor#explosiveMaterial}*/
public ExplosiveMaterialCategories getExplosiveMaterial()
{
    return explosiveMaterial; 
}

/** Setter for {@link ExplosionDescriptor#padding}*/
public ExplosionDescriptor setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}

/** Getter for {@link ExplosionDescriptor#padding}*/
public short getPadding()
{
    return padding; 
}

/** Setter for {@link ExplosionDescriptor#explosiveForce}*/
public ExplosionDescriptor setExplosiveForce(float pExplosiveForce)
{
    explosiveForce = pExplosiveForce;
    return this;
}

/** Getter for {@link ExplosionDescriptor#explosiveForce}*/
public float getExplosiveForce()
{
    return explosiveForce; 
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
       explodingObject.marshal(dos);
       explosiveMaterial.marshal(dos);
       dos.writeShort(padding);
       dos.writeFloat(explosiveForce);
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
 * @param dis the InputStream
 * @return unmarshalled size
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        uPosition += explodingObject.unmarshal(dis);
        explosiveMaterial = ExplosiveMaterialCategories.unmarshalEnum(dis);
        uPosition += explosiveMaterial.getMarshalledSize();
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        explosiveForce = dis.readFloat();
        uPosition += 4;
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
   explodingObject.marshal(buff);
   explosiveMaterial.marshal(buff);
   buff.putShort( (short)padding);
   buff.putFloat( (float)explosiveForce);
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
    explodingObject.unmarshal(buff);
    explosiveMaterial = ExplosiveMaterialCategories.unmarshalEnum(buff);
    padding = (short)(buff.getShort() & 0xFFFF);
    explosiveForce = buff.getFloat();
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

     final ExplosionDescriptor rhs = (ExplosionDescriptor)obj;

     if( ! (explodingObject.equals( rhs.explodingObject) )) ivarsEqual = false;
     if( ! (explosiveMaterial == rhs.explosiveMaterial)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (explosiveForce == rhs.explosiveForce)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" explodingObject: ").append(explodingObject).append("\n");
    sb.append(" explosiveMaterial: ").append(explosiveMaterial).append("\n");
    sb.append(" padding: ").append(padding).append("\n");
    sb.append(" explosiveForce: ").append(explosiveForce).append("\n");

   return sb.toString();
 }
} // end of class
