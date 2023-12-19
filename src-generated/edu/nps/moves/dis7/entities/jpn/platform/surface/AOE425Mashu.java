/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AOE425Mashu</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AOE425Mashu.createInstance()</code> or <code>new AOE425Mashu()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Combat Support Ship = <code>60</code>; </li>
 *     <li> SubCategory: MashuClassAOE  = <code>1</code>; </li>
 *     <li> Specific: AOE425Mashu  = <code>1</code>; </li>
 *     <li> Entity type uid: 33673; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24b52d3e. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastCombatSupportShip
 * @see SubCategory

 */
public final class AOE425Mashu extends EntityType
{
    /** Default constructor */
    public AOE425Mashu()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)60); // uid 33671, Fast Combat Support Ship
        setSubCategory((byte)1); // uid 33672, Mashu Class (AOE)
        setSpecific((byte)1); // uid 33673, AOE-425 Mashu
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AOE425Mashu createInstance()
    {
            return new AOE425Mashu();
    }
}
