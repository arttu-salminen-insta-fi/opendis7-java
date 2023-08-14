/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.hkg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TiGuardian</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TiGuardian.createInstance()</code> or <code>new TiGuardian()</code>. </p>
 * <ul>
 *     <li> Country: Hong Kong (HKG) = <code>95</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: CrudeOilTankerupto159999DWT  = <code>5</code>; </li>
 *     <li> Specific: TiGuardian  = <code>1</code>; </li>
 *     <li> Entity type uid: 24537; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b7ff809. </p>
 * @see Country#HONG_KONG_HKG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class TiGuardian extends EntityType
{
    /** Default constructor */
    public TiGuardian()
    {
        setCountry(Country.HONG_KONG_HKG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24535, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24536, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24537, Ti Guardian
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TiGuardian createInstance()
    {
            return new TiGuardian();
    }
}
