// autogenerated using string template disbitset1.txt

package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML,
 *  UID 562, marshal size 16,
 * ExtendedEquipmentCulturalFeatures
 */
public class ExtendedEquipmentCulturalFeatures extends DisBitSet 
{

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 5, boolean) Describes whether or not the entity is currently sling loaded
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISSLINGLOADED = new Bits(5, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 9, length=2) Describes whether an IED is present and, if so, how well it is hidden,  use {@link AppearanceObjectGeneralIEDPresent} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits IED = new Bits(9, 2, AppearanceObjectGeneralIEDPresent.class);
  // autogenerated using string template disbitset2.txt
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
  public ExtendedEquipmentCulturalFeatures()
  {
    super(16); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public ExtendedEquipmentCulturalFeatures(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public ExtendedEquipmentCulturalFeatures set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public ExtendedEquipmentCulturalFeatures set(Bits wh, Object val) throws Exception
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
  public ExtendedEquipmentCulturalFeatures set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "ExtendedEquipmentCulturalFeatures: " + super.toString();
  }
}