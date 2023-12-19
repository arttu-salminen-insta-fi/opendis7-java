/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TaxiVolkswagenPassat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TaxiVolkswagenPassat.createInstance()</code> or <code>new TaxiVolkswagenPassat()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility/Emergency Car = <code>93</code>; </li>
 *     <li> SubCategory: Taxi  = <code>5</code>; </li>
 *     <li> Specific: TaxiVolkswagenPassat  = <code>1</code>; </li>
 *     <li> Entity type uid: 24855; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6138e79a. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityEmergencyCar
 * @see SubCategory

 */
public final class TaxiVolkswagenPassat extends EntityType
{
    /** Default constructor */
    public TaxiVolkswagenPassat()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)93); // uid 24851, Utility/Emergency Car
        setSubCategory((byte)5); // uid 24854, Taxi
        setSpecific((byte)1); // uid 24855, Taxi, Volkswagen Passat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TaxiVolkswagenPassat createInstance()
    {
            return new TaxiVolkswagenPassat();
    }
}
