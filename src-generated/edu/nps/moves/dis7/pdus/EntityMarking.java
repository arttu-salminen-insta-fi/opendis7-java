/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Specifies the character set used inthe first byte, followed by 11 characters of text data. Section 6.29
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class EntityMarking extends Object implements Serializable
{
   /** The character set uid 45 */
   protected EntityMarkingCharacterSet characterSet = EntityMarkingCharacterSet.values()[0];

   /** The characters */
   protected byte[]  characters = new byte[11]; 


/** Constructor */
 public EntityMarking()
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

   marshalSize += characterSet.getMarshalledSize();
   marshalSize += characters.length * 1;

   return marshalSize;
}


/** Setter for {@link EntityMarking#characterSet}
  * @param pCharacterSet new value of interest
  * @return same object to permit progressive setters */
public EntityMarking setCharacterSet(EntityMarkingCharacterSet pCharacterSet)
{
    characterSet = pCharacterSet;
    return this;
}

/** Getter for {@link EntityMarking#characterSet}
  * @return value of interest */
public EntityMarkingCharacterSet getCharacterSet()
{
    return characterSet; 
}

/** Setter for {@link EntityMarking#characters}
  * @param pCharacters new value of interest
  * @return same object to permit progressive setters */
public EntityMarking setCharacters(byte[] pCharacters)
{
    characters = Arrays.copyOf(pCharacters, characters.length);
    return this;
}

/** Getter for {@link EntityMarking#characters}
  * @return value of interest */
public byte[] getCharacters()
{
    return characters; 
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
       characterSet.marshal(dos);

       for(int idx = 0; idx < characters.length; idx++)
           dos.writeByte(characters[idx]);

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
        characterSet = EntityMarkingCharacterSet.unmarshalEnum(dis);
        uPosition += characterSet.getMarshalledSize();
        for(int idx = 0; idx < characters.length; idx++)
            characters[idx] = dis.readByte();
        uPosition += (characters.length * 1);
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
   characterSet.marshal(byteBuffer);

   for(int idx = 0; idx < characters.length; idx++)
       byteBuffer.put((byte)characters[idx]);

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
    characterSet = EntityMarkingCharacterSet.unmarshalEnum(byteBuffer);
    for(int idx = 0; idx < characters.length; idx++)
        characters[idx] = byteBuffer.get();
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

     final EntityMarking rhs = (EntityMarking)obj;

     if( ! (characterSet == rhs.characterSet)) ivarsEqual = false;

     for(int idx = 0; idx < 11; idx++)
     {
          if(!(characters[idx] == rhs.characters[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" characterSet: ").append(characterSet).append("\n");
    sb.append(" characters: ").append("\n");
    sb.append(Arrays.toString(characters)).append("\n");

   return sb.toString();
 }
} // end of class
