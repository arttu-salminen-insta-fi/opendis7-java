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
 * <p> Entity class <b><code>VTNEVWConstellation3132010ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VTNEVWConstellation3132010ton.createInstance()</code> or <code>new VTNEVWConstellation3132010ton()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle - (greater than 1.25 tons) = <code>7</code>; </li>
 *     <li> SubCategory: VTNEVWConstellation3132010ton  = <code>3</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 32045; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@a67c67e. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehiclegreaterthan125tons
 * @see SubCategory

 */
public final class VTNEVWConstellation3132010ton extends EntityType
{
    /** Default constructor */
    public VTNEVWConstellation3132010ton()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 24388, Large Wheeled Utility Vehicle - (greater than 1.25 tons)
        setSubCategory((byte)3); // uid 32045, VTNE - VW Constellation (31.320), 10 ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VTNEVWConstellation3132010ton createInstance()
    {
            return new VTNEVWConstellation3132010ton();
    }
}
