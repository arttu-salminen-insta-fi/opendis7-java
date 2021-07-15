package edu.nps.moves.dis7.enumerations;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, <br>
 * UID 230 marshal size 16<br>
 * PointObjectAppearanceBuildingStructure
 */
public class PointObjectAppearanceBuildingStructure extends DisBitSet 
{
  /**
   * Describes the color of the building or structure, Use {@link Color} values for this field
   */
  public static Bits COLOR = new Bits(0, 8, Color.class);
  /**
   * Describes the visual paint design, Use {@link BuildingPaintScheme} values for this field
   */
  public static Bits PAINTSCHEME = new Bits(8, 8, BuildingPaintScheme.class);
  /**
   * Describes whether the aperture (e.g., tent) is open or closed
   */
  public static Bits ISAPERTUREOPEN = new Bits(16, 1);

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
  public PointObjectAppearanceBuildingStructure()
  {
    super(16); // length from bitfield element
  }

  /** Default constructor with parameters
   * @param wh Bits custom data structure
   * @param value bits of interest  */
  public PointObjectAppearanceBuildingStructure(Bits wh, int value)
  {
    this();
    set(wh,value);
  }

  /** Accessor method to set value
   * @param wh Bits custom data structure
   * @param value bits of interest
   * @return this object */
  public PointObjectAppearanceBuildingStructure set(Bits wh, int value)
  {
    //if((value & ~wh.inputmask) != 0)
    //  throw new EnumNotFoundException("bad bits passed to "+getClass().getSimpleName()+", field "+wh.name() + " cannot be "+value);

    setbits(wh.position,wh.length,value);
    return this;
  }
/*
  public PointObjectAppearanceBuildingStructure set(Bits wh, Object val) throws Exception
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
  public PointObjectAppearanceBuildingStructure set(int start, int length, int value)
  {
      setbits(start,length,value);
      return this;
  }

  /** Provide string representation
   * @return string representation */
  @Override
  public String toString()
  {
      return "PointObjectAppearanceBuildingStructure: " + super.toString();
  }
}
