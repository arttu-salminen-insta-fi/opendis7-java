/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TAGOS15Titan</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TAGOS15Titan.createInstance()</code> or <code>new TAGOS15Titan()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance Towed Array Sonar System (SURTASS) = <code>59</code>; </li>
 *     <li> SubCategory: StalwartClassOceanSurveillance  = <code>8</code>; </li>
 *     <li> Specific: TAGOS15Titan  = <code>15</code>; </li>
 *     <li> Entity type uid: 12077; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1ec88aa1. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceTowedArraySonarSystemSURTASS
 * @see SubCategory

 */
public final class TAGOS15Titan extends EntityType
{
    /** Default constructor */
    public TAGOS15Titan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)59); // uid 12049, Surveillance Towed Array Sonar System (SURTASS)
        setSubCategory((byte)8); // uid 12062, Stalwart Class (Ocean Surveillance)
        setSpecific((byte)15); // uid 12077, TAGOS 15 Titan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TAGOS15Titan createInstance()
    {
            return new TAGOS15Titan();
    }
}
