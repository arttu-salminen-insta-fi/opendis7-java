/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IvecoACTL4x4CargoSM4431</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IvecoACTL4x4CargoSM4431.createInstance()</code> or <code>new IvecoACTL4x4CargoSM4431()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: IvecoACTL4x4  = <code>3</code>; </li>
 *     <li> Specific: IvecoACTL4x4CargoSM4431  = <code>1</code>; </li>
 *     <li> Entity type uid: 36261; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@aec50a1. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class IvecoACTL4x4CargoSM4431 extends EntityType
{
    /** Default constructor */
    public IvecoACTL4x4CargoSM4431()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 35885, Small Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 36260, Iveco ACTL (4x4)
        setSpecific((byte)1); // uid 36261, Iveco ACTL (4x4), Cargo SM 44.31
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IvecoACTL4x4CargoSM4431 createInstance()
    {
            return new IvecoACTL4x4CargoSM4431();
    }
}
