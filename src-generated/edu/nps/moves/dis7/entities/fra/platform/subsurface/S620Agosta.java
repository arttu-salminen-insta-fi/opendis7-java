/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S620Agosta</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S620Agosta.createInstance()</code> or <code>new S620Agosta()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) (Sous-Marins D'attaque) = <code>5</code>; </li>
 *     <li> SubCategory: AgostaClass  = <code>1</code>; </li>
 *     <li> Specific: S620Agosta  = <code>1</code>; </li>
 *     <li> Entity type uid: 16197; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c7ba306. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrolSousMarinsDattaque
 * @see SubCategory

 */
public final class S620Agosta extends EntityType
{
    /** Default constructor */
    public S620Agosta()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 16195, SS (Conventional Attack-Torpedo, Patrol) (Sous-Marins D'attaque)
        setSubCategory((byte)1); // uid 16196, Agosta Class
        setSpecific((byte)1); // uid 16197, S 620 Agosta
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S620Agosta createInstance()
    {
            return new S620Agosta();
    }
}
