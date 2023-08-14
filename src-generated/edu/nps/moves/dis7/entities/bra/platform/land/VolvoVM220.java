/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VolvoVM220</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VolvoVM220.createInstance()</code> or <code>new VolvoVM220()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Cargo Truck = <code>83</code>; </li>
 *     <li> SubCategory: Tanker  = <code>20</code>; </li>
 *     <li> Specific: VolvoVM220  = <code>1</code>; </li>
 *     <li> Entity type uid: 31799; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c0f93f1. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitCargoTruck
 * @see SubCategory

 */
public final class VolvoVM220 extends EntityType
{
    /** Default constructor */
    public VolvoVM220()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 31797, Single Unit Cargo Truck
        setSubCategory((byte)20); // uid 31798, Tanker
        setSpecific((byte)1); // uid 31799, Volvo VM220
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VolvoVM220 createInstance()
    {
            return new VolvoVM220();
    }
}
