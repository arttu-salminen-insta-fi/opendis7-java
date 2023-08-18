/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LCUMKIIseriesL9525L9529</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LCUMKIIseriesL9525L9529.createInstance()</code> or <code>new LCUMKIIseriesL9525L9529()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: LCUMKIIseriesL9525L9529  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28241; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@58faa93b. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class LCUMKIIseriesL9525L9529 extends EntityType
{
    /** Default constructor */
    public LCUMKIIseriesL9525L9529()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 28240, Landing Craft
        setSubCategory((byte)1); // uid 28241, LCU MK-II series L9525-L9529
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LCUMKIIseriesL9525L9529 createInstance()
    {
            return new LCUMKIIseriesL9525L9529();
    }
}
