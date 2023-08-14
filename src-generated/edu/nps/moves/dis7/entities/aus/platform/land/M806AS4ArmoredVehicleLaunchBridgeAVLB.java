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
 * <p> Entity class <b><code>M806AS4ArmoredVehicleLaunchBridgeAVLB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M806AS4ArmoredVehicleLaunchBridgeAVLB.createInstance()</code> or <code>new M806AS4ArmoredVehicleLaunchBridgeAVLB()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: M113AS4ArmoredFittersFIT  = <code>4</code>; </li>
 *     <li> Specific: M806AS4ArmoredVehicleLaunchBridgeAVLB  = <code>2</code>; </li>
 *     <li> Entity type uid: 33220; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12f40c25. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class M806AS4ArmoredVehicleLaunchBridgeAVLB extends EntityType
{
    /** Default constructor */
    public M806AS4ArmoredVehicleLaunchBridgeAVLB()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armored Utility Vehicle
        setSubCategory((byte)4); // uid 28620, M113-AS4 Armored Fitters (FIT)
        setSpecific((byte)2); // uid 33220, M806-AS4 Armored Vehicle Launch Bridge (AVLB)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M806AS4ArmoredVehicleLaunchBridgeAVLB createInstance()
    {
            return new M806AS4ArmoredVehicleLaunchBridgeAVLB();
    }
}
