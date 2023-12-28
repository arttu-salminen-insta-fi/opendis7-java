/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NASAMSCEATACRadarHawkei</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NASAMSCEATACRadarHawkei.createInstance()</code> or <code>new NASAMSCEATACRadarHawkei()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: NASAMSAustralianAirDefenseSystem  = <code>1</code>; </li>
 *     <li> Specific: NASAMSCEATACRadarHawkei  = <code>5</code>; </li>
 *     <li> Entity type uid: 35906; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3cb5cdba. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class NASAMSCEATACRadarHawkei extends EntityType
{
    /** Default constructor */
    public NASAMSCEATACRadarHawkei()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 35900, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 35901, NASAMS Australian Air Defense System
        setSpecific((byte)5); // uid 35906, NASAMS CEATAC Radar - Hawkei
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NASAMSCEATACRadarHawkei createInstance()
    {
            return new NASAMSCEATACRadarHawkei();
    }
}
