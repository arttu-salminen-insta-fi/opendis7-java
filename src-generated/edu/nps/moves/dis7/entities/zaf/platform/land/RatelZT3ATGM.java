/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.zaf.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RatelZT3ATGM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RatelZT3ATGM.createInstance()</code> or <code>new RatelZT3ATGM()</code>. </p>
 * <ul>
 *     <li> Country: South Africa (ZAF) = <code>197</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: Ratel  = <code>2</code>; </li>
 *     <li> Specific: RatelZT3ATGM  = <code>4</code>; </li>
 *     <li> Entity type uid: 22819; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@216e9ca3. </p>
 * @see Country#SOUTH_AFRICA_ZAF
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class RatelZT3ATGM extends EntityType
{
    /** Default constructor */
    public RatelZT3ATGM()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 19094, Armored Fighting Vehicle
        setSubCategory((byte)2); // uid 19097, Ratel
        setSpecific((byte)4); // uid 22819, Ratel ZT-3 ATGM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RatelZT3ATGM createInstance()
    {
            return new RatelZT3ATGM();
    }
}
