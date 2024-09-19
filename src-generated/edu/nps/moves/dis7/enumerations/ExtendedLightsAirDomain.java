// autogenerated using string template disbitset1.txt

package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML,
 *  UID 548, marshal size 32,
 * ExtendedLightsAirDomain
 */
public class ExtendedLightsAirDomain extends DisBitSet 
{

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 0, length=3) Describes the intensity (brightness) of the formation lights,  use {@link SpecialLightsIntensity} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits FORMATIONLIGHTSINTENSITY = new Bits(0, 3, SpecialLightsIntensity.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 3, boolean) Describes whether or not the formation lights are flashing
   */
  // autogenerated using string template disbitset15.txt
  public static Bits AREFORMATIONLIGHTSFLASHING = new Bits(3, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 4, boolean) Describes whether the spot/search light #2 is on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits SPOTSEARCH2ON = new Bits(4, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 5, boolean) Describes the Night Vision Goggles (NVG) indicator for search light #1,  use {@link AppearanceNVGMode} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits SEARCHLIGHT1NVGMODE = new Bits(5, 1, AppearanceNVGMode.class);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 6, boolean) Describes the Night Vision Goggles (NVG) indicator for search light #2,  use {@link AppearanceNVGMode} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits SEARCHLIGHT2NVGMODE = new Bits(6, 1, AppearanceNVGMode.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 7, boolean) Describes whether search light #1 is retracted or extended
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISSEARCHLIGHT1EXTENDED = new Bits(7, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 8, boolean) Describes whether search light #2 is retracted or extended
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISSEARCHLIGHT2EXTENDED = new Bits(8, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 9, boolean) Describes whether the aft navigation/position light is on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits AFTNAVIGATIONPOSITIONLIGHTON = new Bits(9, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 10, boolean) Describes whether the landing lights are retracted or extended
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ARELANDINGLIGHTSEXTENDED = new Bits(10, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 11, length=3) Describes the flash pattern used by the IR Anti-Collision Lights,  use {@link IRAntiCollisionFlashPattern} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits IRANTICOLLISIONFLASHPATTERN = new Bits(11, 3, IRAntiCollisionFlashPattern.class);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 14, length=3) Describes the intensity (brightness) of the IR Anti-Collision lights (where 0 is off and 1-5 indicate intensity),  use {@link SpecialLightsIntensity} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits IRANTICOLLISIONINTENSITY = new Bits(14, 3, SpecialLightsIntensity.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 17, boolean) Describes whether the spot/search light #3 is on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits SPOTSEARCH3ON = new Bits(17, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 18, boolean) Describes whether the spot/search light #4 is on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits SPOTSEARCH4ON = new Bits(18, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 19, boolean) Describes the Night Vision Goggles (NVG) indicator for interior lights,  use {@link AppearanceNVGMode} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits INTERIORLIGHTSNVGMODE = new Bits(19, 1, AppearanceNVGMode.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 20, boolean) Describes whether the taxi lights are on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits TAXILIGHTSON = new Bits(20, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 21, boolean) Describes whether both the red and white anti-collision lights are on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits BOTHREDANDWHITEANTICOLLISIONLIGHTSON = new Bits(21, 1);
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
  public ExtendedLightsAirDomain()
  {
    super(32); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public ExtendedLightsAirDomain(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public ExtendedLightsAirDomain set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public ExtendedLightsAirDomain set(Bits wh, Object val) throws Exception
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
  public ExtendedLightsAirDomain set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "ExtendedLightsAirDomain: " + super.toString();
  }
}