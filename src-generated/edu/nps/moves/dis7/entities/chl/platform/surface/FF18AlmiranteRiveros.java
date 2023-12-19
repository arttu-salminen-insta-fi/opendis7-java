/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FF18AlmiranteRiveros</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FF18AlmiranteRiveros.createInstance()</code> or <code>new FF18AlmiranteRiveros()</code>. </p>
 * <ul>
 *     <li> Country: Chile (CHL) = <code>44</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: KarelDoormanClass  = <code>3</code>; </li>
 *     <li> Specific: FF18AlmiranteRiveros  = <code>1</code>; </li>
 *     <li> Entity type uid: 27466; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@60438a68. </p>
 * @see Country#CHILE_CHL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class FF18AlmiranteRiveros extends EntityType
{
    /** Default constructor */
    public FF18AlmiranteRiveros()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27464, Guided Missile Frigate (FFG)
        setSubCategory((byte)3); // uid 27465, Karel Doorman Class
        setSpecific((byte)1); // uid 27466, FF-18 Almirante Riveros
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FF18AlmiranteRiveros createInstance()
    {
            return new FF18AlmiranteRiveros();
    }
}
