/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>T72M2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>T72M2.createInstance()</code> or <code>new T72M2()</code>. </p>
 * <ul>
 *     <li> Country: Slovakia (SVK) = <code>268</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: T72MBT  = <code>1</code>; </li>
 *     <li> Specific: T72M2  = <code>2</code>; </li>
 *     <li> Entity type uid: 30109; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d12e953. </p>
 * @see Country#SLOVAKIA_SVK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class T72M2 extends EntityType
{
    /** Default constructor */
    public T72M2()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 30106, Tank
        setSubCategory((byte)1); // uid 30107, T-72 MBT
        setSpecific((byte)2); // uid 30109, T-72M2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static T72M2 createInstance()
    {
            return new T72M2();
    }
}
