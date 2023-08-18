/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GhadirClass</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GhadirClass.createInstance()</code> or <code>new GhadirClass()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSM (Midget Submarine, under 150 tons) = <code>12</code>; </li>
 *     <li> SubCategory: GhadirClass  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30891; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@73c60324. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSMMidgetSubmarineunder150tons
 * @see SubCategory

 */
public final class GhadirClass extends EntityType
{
    /** Default constructor */
    public GhadirClass()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)12); // uid 30889, SSM (Midget Submarine, under 150 tons)
        setSubCategory((byte)2); // uid 30891, Ghadir Class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GhadirClass createInstance()
    {
            return new GhadirClass();
    }
}
