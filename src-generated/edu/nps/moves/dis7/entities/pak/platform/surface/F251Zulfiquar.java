/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pak.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F251Zulfiquar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F251Zulfiquar.createInstance()</code> or <code>new F251Zulfiquar()</code>. </p>
 * <ul>
 *     <li> Country: Pakistan (PAK) = <code>165</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: F22PZulfiquarClass  = <code>1</code>; </li>
 *     <li> Specific: F251Zulfiquar  = <code>1</code>; </li>
 *     <li> Entity type uid: 28406; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@af78c87. </p>
 * @see Country#PAKISTAN_PAK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F251Zulfiquar extends EntityType
{
    /** Default constructor */
    public F251Zulfiquar()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28404, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 28405, F-22P Zulfiquar Class
        setSpecific((byte)1); // uid 28406, F-251 Zulfiquar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F251Zulfiquar createInstance()
    {
            return new F251Zulfiquar();
    }
}
