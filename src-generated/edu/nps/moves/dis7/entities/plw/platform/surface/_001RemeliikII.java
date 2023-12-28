/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.plw.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_001RemeliikII</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_001RemeliikII.createInstance()</code> or <code>new _001RemeliikII()</code>. </p>
 * <ul>
 *     <li> Country: Palau (PLW) = <code>216</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: GuardianClassPacificPatrolBoatsPPBR  = <code>2</code>; </li>
 *     <li> Specific: _001RemeliikII  = <code>1</code>; </li>
 *     <li> Entity type uid: 35670; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b016b4e. </p>
 * @see Country#PALAU_PLW
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _001RemeliikII extends EntityType
{
    /** Default constructor */
    public _001RemeliikII()
    {
        setCountry(Country.PALAU_PLW);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26727, Light/Patrol Craft
        setSubCategory((byte)2); // uid 35669, Guardian Class, Pacific Patrol Boats (PPB-R)
        setSpecific((byte)1); // uid 35670, 001 Remeliik II
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _001RemeliikII createInstance()
    {
            return new _001RemeliikII();
    }
}
