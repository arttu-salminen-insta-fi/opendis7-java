/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>K573Novosibirsk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>K573Novosibirsk.createInstance()</code> or <code>new K573Novosibirsk()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSGN (Nuclear Guided Missile) = <code>2</code>; </li>
 *     <li> SubCategory: YasenMClassProject885M8851  = <code>8</code>; </li>
 *     <li> Specific: K573Novosibirsk  = <code>2</code>; </li>
 *     <li> Entity type uid: 35237; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6419a0e1. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSGNNuclearGuidedMissile
 * @see SubCategory

 */
public final class K573Novosibirsk extends EntityType
{
    /** Default constructor */
    public K573Novosibirsk()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)2); // uid 14771, SSGN (Nuclear Guided Missile)
        setSubCategory((byte)8); // uid 35235, Yasen-M Class (Project 885M/885.1)
        setSpecific((byte)2); // uid 35237, K-573 Novosibirsk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static K573Novosibirsk createInstance()
    {
            return new K573Novosibirsk();
    }
}
