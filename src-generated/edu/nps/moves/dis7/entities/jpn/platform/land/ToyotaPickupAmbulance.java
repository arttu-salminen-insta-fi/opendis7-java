/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ToyotaPickupAmbulance</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ToyotaPickupAmbulance.createInstance()</code> or <code>new ToyotaPickupAmbulance()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Utility/Emergency Truck = <code>84</code>; </li>
 *     <li> SubCategory: AmbulancePickupTruck  = <code>4</code>; </li>
 *     <li> Specific: ToyotaPickupAmbulance  = <code>1</code>; </li>
 *     <li> Entity type uid: 31831; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@51684e4a. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitUtilityEmergencyTruck
 * @see SubCategory

 */
public final class ToyotaPickupAmbulance extends EntityType
{
    /** Default constructor */
    public ToyotaPickupAmbulance()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 31829, Single Unit Utility/Emergency Truck
        setSubCategory((byte)4); // uid 31830, Ambulance Pickup Truck
        setSpecific((byte)1); // uid 31831, Toyota Pickup Ambulance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ToyotaPickupAmbulance createInstance()
    {
            return new ToyotaPickupAmbulance();
    }
}
