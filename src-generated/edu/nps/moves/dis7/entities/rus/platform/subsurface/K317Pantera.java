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
 * <p> Entity class <b><code>K317Pantera</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>K317Pantera.createInstance()</code> or <code>new K317Pantera()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack-Torpedo) = <code>3</code>; </li>
 *     <li> SubCategory: AkulaIAkulaIImprovedClass  = <code>8</code>; </li>
 *     <li> Specific: K317Pantera  = <code>3</code>; </li>
 *     <li> Entity type uid: 14792; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@176f7f3b. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackTorpedo
 * @see SubCategory

 */
public final class K317Pantera extends EntityType
{
    /** Default constructor */
    public K317Pantera()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 14779, SSN (Nuclear Attack-Torpedo)
        setSubCategory((byte)8); // uid 14789, Akula I / Akula I Improved Class
        setSpecific((byte)3); // uid 14792, K-317 Pantera
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static K317Pantera createInstance()
    {
            return new K317Pantera();
    }
}
