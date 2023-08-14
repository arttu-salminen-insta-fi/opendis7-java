/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pak.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PACMFI17Mushshak</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PACMFI17Mushshak.createInstance()</code> or <code>new PACMFI17Mushshak()</code>. </p>
 * <ul>
 *     <li> Country: Pakistan (PAK) = <code>165</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: PACMFI17Mushshak  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29198; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3b6c624. </p>
 * @see Country#PAKISTAN_PAK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class PACMFI17Mushshak extends EntityType
{
    /** Default constructor */
    public PACMFI17Mushshak()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 29197, Trainer
        setSubCategory((byte)1); // uid 29198, PAC MFI-17 Mushshak
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PACMFI17Mushshak createInstance()
    {
            return new PACMFI17Mushshak();
    }
}
