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
 * <p> Entity class <b><code>MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant.createInstance()</code> or <code>new MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MANHX81PrimeMover  = <code>4</code>; </li>
 *     <li> Specific: MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant  = <code>4</code>; </li>
 *     <li> Entity type uid: 29751; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75412c2f. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant extends EntityType
{
    /** Default constructor */
    public MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)4); // uid 29747, MAN HX81 - Prime Mover
        setSpecific((byte)4); // uid 29751, MAN HX81 Prime Mover, HM Dolly Low Loader, Trailer, Semi, Medium Eqpt Transporter, Plant
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant createInstance()
    {
            return new MANHX81PrimeMoverHMDollyLowLoaderTrailerSemiMediumEqptTransporterPlant();
    }
}
