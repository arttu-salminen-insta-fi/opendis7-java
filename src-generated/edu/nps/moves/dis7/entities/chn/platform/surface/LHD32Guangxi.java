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
 * <p> Entity class <b><code>LHD32Guangxi</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LHD32Guangxi.createInstance()</code> or <code>new LHD32Guangxi()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Assault Ship = <code>54</code>; </li>
 *     <li> SubCategory: LHDYushenClassType075  = <code>1</code>; </li>
 *     <li> Specific: LHD32Guangxi  = <code>2</code>; </li>
 *     <li> Entity type uid: 35576; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ddc9a9f. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousAssaultShip
 * @see SubCategory

 */
public final class LHD32Guangxi extends EntityType
{
    /** Default constructor */
    public LHD32Guangxi()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 35573, Amphibious Assault Ship
        setSubCategory((byte)1); // uid 35574, LHD Yushen Class (Type 075)
        setSpecific((byte)2); // uid 35576, LHD 32 Guangxi
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LHD32Guangxi createInstance()
    {
            return new LHD32Guangxi();
    }
}
