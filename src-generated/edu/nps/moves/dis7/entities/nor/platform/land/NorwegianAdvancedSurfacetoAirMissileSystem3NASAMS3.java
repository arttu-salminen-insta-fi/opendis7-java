/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3.createInstance()</code> or <code>new NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3  = <code>3</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 35628; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@35d3ab60. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3 extends EntityType
{
    /** Default constructor */
    public NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 30278, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)3); // uid 35628, Norwegian Advanced Surface to Air Missile System 3 (NASAMS 3)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3 createInstance()
    {
            return new NorwegianAdvancedSurfacetoAirMissileSystem3NASAMS3();
    }
}
