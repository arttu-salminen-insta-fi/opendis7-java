/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kaz.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_2023Aktau</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_2023Aktau.createInstance()</code> or <code>new _2023Aktau()</code>. </p>
 * <ul>
 *     <li> Country: Kazakhstan (KAZ) = <code>252</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility = <code>18</code>; </li>
 *     <li> SubCategory: Type369909Class  = <code>1</code>; </li>
 *     <li> Specific: _2023Aktau  = <code>2</code>; </li>
 *     <li> Entity type uid: 27546; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1db0ec27. </p>
 * @see Country#KAZAKHSTAN_KAZ
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utility
 * @see SubCategory

 */
public final class _2023Aktau extends EntityType
{
    /** Default constructor */
    public _2023Aktau()
    {
        setCountry(Country.KAZAKHSTAN_KAZ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 27543, Utility
        setSubCategory((byte)1); // uid 27544, Type 369/909 Class
        setSpecific((byte)2); // uid 27546, 2023 Aktau
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _2023Aktau createInstance()
    {
            return new _2023Aktau();
    }
}
