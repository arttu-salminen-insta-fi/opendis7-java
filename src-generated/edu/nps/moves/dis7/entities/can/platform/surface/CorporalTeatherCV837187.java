/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CorporalTeatherCV837187</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CorporalTeatherCV837187.createInstance()</code> or <code>new CorporalTeatherCV837187()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: MidshorePatrolVessel  = <code>8</code>; </li>
 *     <li> Specific: CorporalTeatherCV837187  = <code>9</code>; </li>
 *     <li> Entity type uid: 30946; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f3a4b84. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class CorporalTeatherCV837187 extends EntityType
{
    /** Default constructor */
    public CorporalTeatherCV837187()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 26269, Coast Guard Cutters
        setSubCategory((byte)8); // uid 30938, Midshore Patrol Vessel
        setSpecific((byte)9); // uid 30946, Corporal Teather C.V. (837187)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CorporalTeatherCV837187 createInstance()
    {
            return new CorporalTeatherCV837187();
    }
}
