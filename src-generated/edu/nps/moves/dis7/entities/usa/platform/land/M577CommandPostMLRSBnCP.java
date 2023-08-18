/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M577CommandPostMLRSBnCP</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M577CommandPostMLRSBnCP.createInstance()</code> or <code>new M577CommandPostMLRSBnCP()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: M577M577A1M577A2CommandPost  = <code>11</code>; </li>
 *     <li> Specific: M577CommandPostMLRSBnCP  = <code>1</code>; </li>
 *     <li> Entity type uid: 10254; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3a36cd5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class M577CommandPostMLRSBnCP extends EntityType
{
    /** Default constructor */
    public M577CommandPostMLRSBnCP()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 10233, Armored Utility Vehicle
        setSubCategory((byte)11); // uid 10253, M577/M577A1/M577A2 Command Post
        setSpecific((byte)1); // uid 10254, M577 Command Post (MLRS Bn CP)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M577CommandPostMLRSBnCP createInstance()
    {
            return new M577CommandPostMLRSBnCP();
    }
}
