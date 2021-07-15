package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, <br>
 * UID 454 marshal size 32<br>
 * SpacePlatformCapabilities
 */
public class SpacePlatformCapabilities extends DisBitSet implements EntityCapabilities
{
  /**
   * Describes whether the entity is able to supply some type of ammunition in response to an appropriate service request
   */
  public static Bits AMMUNITIONSUPPLY = new Bits(0, 1);
  /**
   * Describes whether the entity is able to supply some type of fuel in response to an appropriate service request
   */
  public static Bits FUELSUPPLY = new Bits(1, 1);
  /**
   * Describes whether the entity is able to provide recovery (e.g., towing) services in response to an appropriate service request
   */
  public static Bits RECOVERY = new Bits(2, 1);
  /**
   * Describes whether the entity is able to supply certain repair services in response to an appropriate service request
   */
  public static Bits REPAIR = new Bits(3, 1);
  /**
   * This entry is reserved for backward compatibility and may not be reused
   */
  public static Bits RESERVED = new Bits(4, 1);

  /** Internal class */
  public static class Bits
  {
    private int position;
    private int length;
    private int inputmask;
    private Class cls;

    private Bits(int position) {
      this(position,1, null);
    }
    
    private Bits(int position, Class cls) {
      this(position,1, cls);
    }

    private Bits(int position, int length ) {
      this(position,length,null);
    }

    private Bits(int position, int length, Class cls) {
      this.position = position;
      this.length = length;
      this.cls = cls;
      inputmask = calculateMask(length);
    }
  }

  /** Default constructor */
  public SpacePlatformCapabilities()
  {
    super(32); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public SpacePlatformCapabilities(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public SpacePlatformCapabilities set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public SpacePlatformCapabilities set(Bits wh, Object val) throws Exception
  {
    if(val.getClass() != wh.cls)
      throw new EnumNotFoundException("bad enum passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+val.getClass().getSimpleName());;
    Method getValueMethod = wh.cls.getMethod("getValue",null);
    int bits = (int)getValueMethod.invoke(val, (Object[])null);
    setbits(wh.position,wh.length,bits);
    return this;
  }
*/
  /** Some bitfields are defined without specific bits enumerated
   * @param start initial position in bit array
   * @param length number of bits
   * @param value bits of interest
   * @return this object */
  public SpacePlatformCapabilities set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "SpacePlatformCapabilities: " + super.toString();
  }
}
