/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_1302YungChia</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_1302YungChia.createInstance()</code> or <code>new _1302YungChia()</code>. </p>
 * <ul>
 *     <li> Country: Taiwan, Province of China (TWN) = <code>208</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Coutermeasures Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: YunFengClass  = <code>1</code>; </li>
 *     <li> Specific: _1302YungChia  = <code>2</code>; </li>
 *     <li> Entity type uid: 19222; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7dffda8b. </p>
 * @see Country#TAIWAN_PROVINCE_OF_CHINA_TWN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCoutermeasuresShipCraft
 * @see SubCategory

 */
public final class _1302YungChia extends EntityType
{
    /** Default constructor */
    public _1302YungChia()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19219, Mine Coutermeasures Ship/Craft
        setSubCategory((byte)1); // uid 19220, Yun Feng Class
        setSpecific((byte)2); // uid 19222, 1302 Yung Chia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _1302YungChia createInstance()
    {
            return new _1302YungChia();
    }
}
