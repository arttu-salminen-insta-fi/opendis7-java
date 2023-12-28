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
 * <p> Entity class <b><code>RMMVHX40MPersonnelCargoRestraintandSegregationPCRS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RMMVHX40MPersonnelCargoRestraintandSegregationPCRS.createInstance()</code> or <code>new RMMVHX40MPersonnelCargoRestraintandSegregationPCRS()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: RMMVHX40M4x4  = <code>1</code>; </li>
 *     <li> Specific: RMMVHX40MTray  = <code>1</code>; </li>
 *     <li> Entity type uid: 29718; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@47d384ee. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class RMMVHX40MPersonnelCargoRestraintandSegregationPCRS extends EntityType
{
    /** Default constructor */
    public RMMVHX40MPersonnelCargoRestraintandSegregationPCRS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 29716, RMMV HX40M - 4x4
        setSpecific((byte)1); // uid 29717, RMMV HX40M Tray
        setExtra((byte)1); // uid 29718, RMMV HX40M Personnel Cargo Restraint and Segregation (PCRS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RMMVHX40MPersonnelCargoRestraintandSegregationPCRS createInstance()
    {
            return new RMMVHX40MPersonnelCargoRestraintandSegregationPCRS();
    }
}
