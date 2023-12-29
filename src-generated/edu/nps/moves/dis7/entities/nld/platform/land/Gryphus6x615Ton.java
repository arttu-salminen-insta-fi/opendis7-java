/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Gryphus6x615Ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Gryphus6x615Ton.createInstance()</code> or <code>new Gryphus6x615Ton()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: ScaniaXTGryphus  = <code>12</code>; </li>
 *     <li> Specific: Gryphus6x615Ton  = <code>4</code>; </li>
 *     <li> Entity type uid: 36479; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d4a65c6. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class Gryphus6x615Ton extends EntityType
{
    /** Default constructor */
    public Gryphus6x615Ton()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 27930, Large Wheeled Utility Vehicle
        setSubCategory((byte)12); // uid 36475, Scania XT Gryphus
        setSpecific((byte)4); // uid 36479, Gryphus 6 x 6, 15 Ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Gryphus6x615Ton createInstance()
    {
            return new Gryphus6x615Ton();
    }
}
