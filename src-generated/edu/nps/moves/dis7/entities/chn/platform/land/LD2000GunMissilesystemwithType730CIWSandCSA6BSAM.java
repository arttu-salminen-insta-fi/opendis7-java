/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LD2000GunMissilesystemwithType730CIWSandCSA6BSAM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LD2000GunMissilesystemwithType730CIWSandCSA6BSAM.createInstance()</code> or <code>new LD2000GunMissilesystemwithType730CIWSandCSA6BSAM()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SelfPropelledVSHORADGunMissileSystem  = <code>4</code>; </li>
 *     <li> Specific: LD200030mmSPAAGlandbasedType730CIWS  = <code>7</code>; </li>
 *     <li> Entity type uid: 36273; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2b6faea6. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class LD2000GunMissilesystemwithType730CIWSandCSA6BSAM extends EntityType
{
    /** Default constructor */
    public LD2000GunMissilesystemwithType730CIWSandCSA6BSAM()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16937, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 16955, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)7); // uid 33995, LD-2000 30mm SPAAG (land-based Type 730 CIWS)
        setExtra((byte)1); // uid 36273, LD-2000 Gun/Missile system with Type 730 CIWS and CSA-6B SAM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LD2000GunMissilesystemwithType730CIWSandCSA6BSAM createInstance()
    {
            return new LD2000GunMissilesystemwithType730CIWSandCSA6BSAM();
    }
}