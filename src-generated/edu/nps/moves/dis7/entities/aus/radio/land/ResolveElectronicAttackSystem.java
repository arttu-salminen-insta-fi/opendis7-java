/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ResolveElectronicAttackSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ResolveElectronicAttackSystem.createInstance()</code> or <code>new ResolveElectronicAttackSystem()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Electronic Attack Systems = <code>50</code>; </li>
 *     <li> SubCategory: ManufacturerDesignation  = <code>2</code>; </li>
 *     <li> Specific: ResolveElectronicAttackSystem  = <code>1</code>; </li>
 *     <li> Entity type uid: 31618; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d3eecda. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectronicAttackSystems
 * @see SubCategory

 */
public final class ResolveElectronicAttackSystem extends EntityType
{
    /** Default constructor */
    public ResolveElectronicAttackSystem()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)50); // uid 31616, Electronic Attack Systems
        setSubCategory((byte)2); // uid 31617, Manufacturer Designation
        setSpecific((byte)1); // uid 31618, Resolve Electronic Attack System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ResolveElectronicAttackSystem createInstance()
    {
            return new ResolveElectronicAttackSystem();
    }
}
