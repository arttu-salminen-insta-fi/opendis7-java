/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tgo.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Amatory</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Amatory.createInstance()</code> or <code>new Amatory()</code>. </p>
 * <ul>
 *     <li> Country: Togo (TGO) = <code>211</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dry Cargo Ship (Group 2 Merchant) = <code>81</code>; </li>
 *     <li> SubCategory: DryBulkCargoShip  = <code>2</code>; </li>
 *     <li> Specific: Amatory  = <code>1</code>; </li>
 *     <li> Entity type uid: 24595; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68dd39d2. </p>
 * @see Country#TOGO_TGO
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DryCargoShipGroup2Merchant
 * @see SubCategory

 */
public final class Amatory extends EntityType
{
    /** Default constructor */
    public Amatory()
    {
        setCountry(Country.TOGO_TGO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24593, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)2); // uid 24594, Dry Bulk Cargo Ship
        setSpecific((byte)1); // uid 24595, Amatory
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Amatory createInstance()
    {
            return new Amatory();
    }
}
