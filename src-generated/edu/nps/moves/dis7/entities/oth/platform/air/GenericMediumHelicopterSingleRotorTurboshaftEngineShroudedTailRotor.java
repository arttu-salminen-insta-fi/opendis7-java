/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor.createInstance()</code> or <code>new GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg) = <code>91</code>; </li>
 *     <li> SubCategory: GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor  = <code>13</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24726; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@31ddd4a4. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterMediumupto20000lbs9072kg
 * @see SubCategory

 */
public final class GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor extends EntityType
{
    /** Default constructor */
    public GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 24723, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)13); // uid 24726, Generic Medium Helicopter, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor createInstance()
    {
            return new GenericMediumHelicopterSingleRotorTurboshaftEngineShroudedTailRotor();
    }
}
