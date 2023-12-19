/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SterlingActerrawHiWayE2500SpreaderandSnowPlow</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SterlingActerrawHiWayE2500SpreaderandSnowPlow.createInstance()</code> or <code>new SterlingActerrawHiWayE2500SpreaderandSnowPlow()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Construction Specialty Vehicle = <code>87</code>; </li>
 *     <li> SubCategory: DumpTruckOther  = <code>24</code>; </li>
 *     <li> Specific: SterlingActerra  = <code>1</code>; </li>
 *     <li> Entity type uid: 28519; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6fa02932. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ConstructionSpecialtyVehicle
 * @see SubCategory

 */
public final class SterlingActerrawHiWayE2500SpreaderandSnowPlow extends EntityType
{
    /** Default constructor */
    public SterlingActerrawHiWayE2500SpreaderandSnowPlow()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 26009, Construction Specialty Vehicle
        setSubCategory((byte)24); // uid 28517, Dump Truck, Other
        setSpecific((byte)1); // uid 28518, Sterling Acterra
        setExtra((byte)1); // uid 28519, Sterling Acterra w/ Hi-Way E2500 Spreader and Snow Plow
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SterlingActerrawHiWayE2500SpreaderandSnowPlow createInstance()
    {
            return new SterlingActerrawHiWayE2500SpreaderandSnowPlow();
    }
}
