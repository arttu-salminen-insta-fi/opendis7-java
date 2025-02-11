// autogenerated using string template disbitset1.txt

package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML,
 *  UID 33, marshal size 32,
 * SurfacePlatformAppearance
 */
public class SurfacePlatformAppearance extends DisBitSet 
{

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 0, boolean) Describes the visual paint design,  use {@link AppearancePaintScheme} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits PAINTSCHEME = new Bits(0, 1, AppearancePaintScheme.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 1, boolean) Describes whether it is capable of moving on its own power
   */
  // autogenerated using string template disbitset15.txt
  public static Bits MOBILITYKILLED = new Bits(1, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 3, length=2) Describes the damaged appearance,  use {@link AppearanceDamage} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits DAMAGE = new Bits(3, 2, AppearanceDamage.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 5, boolean) Describes whether or not smoke is emanating from the entity
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISSMOKEEMANATING = new Bits(5, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 6, boolean) Describes whether or not the engine is emitting smoke
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISENGINEEMITTINGSMOKE = new Bits(6, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 7, length=2) Describes the size of the wake trailing effect,  use {@link AppearanceTrailingEffects} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits WAKESIZE = new Bits(7, 2, AppearanceTrailingEffects.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 12, boolean) Describes whether running lights are on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits RUNNINGLIGHTSON = new Bits(12, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 15, boolean) Describes whether the entity is burning and flames are visible
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISFLAMING = new Bits(15, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 16, boolean) Describes if the accomodation ladder is lowered or not
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISACCOMODATIONLADDERLOWERED = new Bits(16, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 17, boolean) Describes whether the safety fence around a helicopter landing deck is raised
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISFENCERAISED = new Bits(17, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 18, boolean) Describes whether the national identification flag is raised
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISFLAGRAISED = new Bits(18, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 21, boolean) Describes whether the entity is frozen and should not be dead reckoned
   */
  // autogenerated using string template disbitset15.txt
  public static Bits ISFROZEN = new Bits(21, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 22, boolean) Describes whether the power plant is on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits POWERPLANTON = new Bits(22, 1);

  // autogenerated using string template disbitsetcommentxref.txt
  /**
   * (bit position 23, boolean) Describes whether the entity is active or deactivated,  use {@link AppearanceEntityorObjectState} values for this field
   */
  // autogenerated using string template disbitset16.txt
  public static Bits STATE = new Bits(23, 1, AppearanceEntityorObjectState.class);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 28, boolean) Describes whether spot lights are on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits SPOTLIGHTSON = new Bits(28, 1);

  // autogenerated using string template disbitsetcomment.txt
  /**
   * (bit position 29, boolean) Describes whether interior lights are on or off
   */
  // autogenerated using string template disbitset15.txt
  public static Bits INTERIORLIGHTSON = new Bits(29, 1);
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
  public SurfacePlatformAppearance()
  {
    super(32); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public SurfacePlatformAppearance(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public SurfacePlatformAppearance set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public SurfacePlatformAppearance set(Bits wh, Object val) throws Exception
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
  public SurfacePlatformAppearance set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "SurfacePlatformAppearance: " + super.toString();
  }
}
