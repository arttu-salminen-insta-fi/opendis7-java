/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_386SilasPapare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_386SilasPapare.createInstance()</code> or <code>new _386SilasPapare()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: KapitanPattimuraClassProject1331M  = <code>4</code>; </li>
 *     <li> Specific: _386SilasPapare  = <code>14</code>; </li>
 *     <li> Entity type uid: 30532; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78fb9a67. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class _386SilasPapare extends EntityType
{
    /** Default constructor */
    public _386SilasPapare()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28859, Frigate (including Corvette)
        setSubCategory((byte)4); // uid 30518, Kapitan Pattimura Class (Project 1331M)
        setSpecific((byte)14); // uid 30532, 386 Silas Papare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _386SilasPapare createInstance()
    {
            return new _386SilasPapare();
    }
}
