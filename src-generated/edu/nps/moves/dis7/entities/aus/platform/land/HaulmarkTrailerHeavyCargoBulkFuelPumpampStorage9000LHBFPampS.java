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
 * <p> Entity class <b><code>HaulmarkTrailerHeavyCargoBulkFuelPumpampStorage9000LHBFPampS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HaulmarkTrailerHeavyCargoBulkFuelPumpampStorage9000LHBFPampS.createInstance()</code> or <code>new HaulmarkTrailerHeavyCargoBulkFuelPumpampStorage9000LHBFPampS()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fuel Trailer = <code>15</code>; </li>
 *     <li> SubCategory: _10015000Gallons  = <code>2</code>; </li>
 *     <li> Specific: HaulmarkTrailerHeavyCargoBulkFuelPumpamp_Storage9000LHBFPamp_S  = <code>1</code>; </li>
 *     <li> Entity type uid: 29399; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6adca536. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FuelTrailer
 * @see SubCategory

 */
public final class HaulmarkTrailerHeavyCargoBulkFuelPumpampStorage9000LHBFPampS extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerHeavyCargoBulkFuelPumpampStorage9000LHBFPampS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 29396, Fuel Trailer
        setSubCategory((byte)2); // uid 29398, 1001 - 5000 Gallons
        setSpecific((byte)1); // uid 29399, Haulmark - Trailer, Heavy Cargo, Bulk Fuel Pump &amp; Storage, 9000L (HBFP&amp;S)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HaulmarkTrailerHeavyCargoBulkFuelPumpampStorage9000LHBFPampS createInstance()
    {
            return new HaulmarkTrailerHeavyCargoBulkFuelPumpampStorage9000LHBFPampS();
    }
}
