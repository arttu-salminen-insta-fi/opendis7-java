/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA8PSting</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA8PSting.createInstance()</code> or <code>new SA8PSting()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SA8GeckoSAMSystem  = <code>7</code>; </li>
 *     <li> Specific: SA8TLAR  = <code>2</code>; </li>
 *     <li> Entity type uid: 26095; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5e8c34a0. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class SA8PSting extends EntityType
{
    /** Default constructor */
    public SA8PSting()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)7); // uid 13075, SA-8 Gecko SAM System
        setSpecific((byte)2); // uid 13077, SA-8 TLAR
        setExtra((byte)3); // uid 26095, SA-8P Sting
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA8PSting createInstance()
    {
            return new SA8PSting();
    }
}
