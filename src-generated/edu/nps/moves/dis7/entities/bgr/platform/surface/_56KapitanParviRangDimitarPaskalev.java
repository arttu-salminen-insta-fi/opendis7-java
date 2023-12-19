/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_56KapitanParviRangDimitarPaskalev</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_56KapitanParviRangDimitarPaskalev.createInstance()</code> or <code>new _56KapitanParviRangDimitarPaskalev()</code>. </p>
 * <ul>
 *     <li> Country: Bulgaria (BGR) = <code>33</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: OlyaClassProject1259  = <code>3</code>; </li>
 *     <li> Specific: _56KapitanParviRangDimitarPaskalev  = <code>6</code>; </li>
 *     <li> Entity type uid: 32902; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1786dec2. </p>
 * @see Country#BULGARIA_BGR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _56KapitanParviRangDimitarPaskalev extends EntityType
{
    /** Default constructor */
    public _56KapitanParviRangDimitarPaskalev()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27886, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 32896, Olya Class (Project 1259)
        setSpecific((byte)6); // uid 32902, 56 Kapitan Parvi Rang Dimitar Paskalev
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _56KapitanParviRangDimitarPaskalev createInstance()
    {
            return new _56KapitanParviRangDimitarPaskalev();
    }
}
