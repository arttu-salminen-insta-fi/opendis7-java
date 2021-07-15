package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, <br>
 * UID 317 marshal size 8<br>
 * DEDamageDescriptionComponentVisualDamageStatus
 */
public class DEDamageDescriptionComponentVisualDamageStatus extends DisBitSet 
{
  /**
   * Describes presence of fire at the damage site
   */
  public static Bits ISFIREPRESENT = new Bits(0, 1);
  /**
   * Describes presence of smoke emanating from the damage site, Use {@link ComponentVisualDamageStatusSmoke} values for this field
   */
  public static Bits SMOKE = new Bits(1, 2, ComponentVisualDamageStatusSmoke.class);
  /**
   * Describes general surface appearance at the damage site, Use {@link ComponentVisualDamageStatusSurfaceDamage} values for this field
   */
  public static Bits SURFACEDAMAGE = new Bits(3, 2, ComponentVisualDamageStatusSurfaceDamage.class);

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
  public DEDamageDescriptionComponentVisualDamageStatus()
  {
    super(8); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public DEDamageDescriptionComponentVisualDamageStatus(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public DEDamageDescriptionComponentVisualDamageStatus set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public DEDamageDescriptionComponentVisualDamageStatus set(Bits wh, Object val) throws Exception
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
  public DEDamageDescriptionComponentVisualDamageStatus set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "DEDamageDescriptionComponentVisualDamageStatus: " + super.toString();
  }
}
