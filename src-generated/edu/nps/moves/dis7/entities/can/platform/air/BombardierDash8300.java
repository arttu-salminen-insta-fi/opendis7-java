/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BombardierDash8300</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BombardierDash8300.createInstance()</code> or <code>new BombardierDash8300()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg) = <code>87</code>; </li>
 *     <li> SubCategory: TwinEngineTurboprop  = <code>22</code>; </li>
 *     <li> Specific: BombardierAerospaceDHC8Dash8Series300400  = <code>1</code>; </li>
 *     <li> Entity type uid: 24338; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5f282abb. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftLargeupto255000lbs115666kg
 * @see SubCategory

 */
public final class BombardierDash8300 extends EntityType
{
    /** Default constructor */
    public BombardierDash8300()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23881, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)22); // uid 23882, Twin Engine Turboprop
        setSpecific((byte)1); // uid 23883, Bombardier Aerospace DHC-8 Dash 8 Series 300, 400
        setExtra((byte)1); // uid 24338, Bombardier Dash 8-300
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BombardierDash8300 createInstance()
    {
            return new BombardierDash8300();
    }
}
