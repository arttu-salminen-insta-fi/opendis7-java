/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>UnimogU1300</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>UnimogU1300.createInstance()</code> or <code>new UnimogU1300()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MBUnimogTruck  = <code>5</code>; </li>
 *     <li> Specific: UnimogU1300  = <code>1</code>; </li>
 *     <li> Entity type uid: 26336; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7fb95505. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class UnimogU1300 extends EntityType
{
    /** Default constructor */
    public UnimogU1300()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 16279, Large Wheeled Utility Vehicle
        setSubCategory((byte)5); // uid 26335, MB Unimog Truck
        setSpecific((byte)1); // uid 26336, Unimog U1300
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static UnimogU1300 createInstance()
    {
            return new UnimogU1300();
    }
}
