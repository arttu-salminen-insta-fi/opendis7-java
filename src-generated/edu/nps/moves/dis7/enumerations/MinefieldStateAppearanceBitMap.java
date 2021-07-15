package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, <br>
 * UID 190 marshal size 16<br>
 * MinefieldStateAppearanceBitMap
 */
public class MinefieldStateAppearanceBitMap extends DisBitSet 
{
  /**
   * Identifies the type of minefield, Use {@link MinefieldAppearanceMinefieldType} values for this field
   */
  public static Bits MINEFIELDTYPE = new Bits(0, 2, MinefieldAppearanceMinefieldType.class);
  /**
   * Describes whether the minefield is active or inactive, Use {@link MinefieldAppearanceActiveStatus} values for this field
   */
  public static Bits ACTIVESTATUS = new Bits(2, 1, MinefieldAppearanceActiveStatus.class);
  /**
   * Identifies whether the minefield has an active or inactive lane, Use {@link MinefieldAppearanceLane} values for this field
   */
  public static Bits LANE = new Bits(3, 1, MinefieldAppearanceLane.class);
  /**
   * Describes the state of the minefield, Use {@link MinefieldAppearanceState} values for this field
   */
  public static Bits STATE = new Bits(13, 1, MinefieldAppearanceState.class);

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
  public MinefieldStateAppearanceBitMap()
  {
    super(16); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public MinefieldStateAppearanceBitMap(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public MinefieldStateAppearanceBitMap set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public MinefieldStateAppearanceBitMap set(Bits wh, Object val) throws Exception
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
  public MinefieldStateAppearanceBitMap set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "MinefieldStateAppearanceBitMap: " + super.toString();
  }
}
