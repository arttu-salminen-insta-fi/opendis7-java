/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YuyiClassType7263330</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YuyiClassType7263330.createInstance()</code> or <code>new YuyiClassType7263330()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Cushion/Surface Effect = <code>15</code>; </li>
 *     <li> SubCategory: YuyiClassType726  = <code>3</code>; </li>
 *     <li> Specific: _3330  = <code>8</code>; </li>
 *     <li> Entity type uid: 34831; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23348b5d. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirCushionSurfaceEffect
 * @see SubCategory

 */
public final class YuyiClassType7263330 extends EntityType
{
    /** Default constructor */
    public YuyiClassType7263330()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 17228, Air Cushion/Surface Effect
        setSubCategory((byte)3); // uid 34823, Yuyi Class (Type 726)
        setSpecific((byte)8); // uid 34831, 3330
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YuyiClassType7263330 createInstance()
    {
            return new YuyiClassType7263330();
    }
}
