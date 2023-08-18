/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rou.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_188Zborul</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_188Zborul.createInstance()</code> or <code>new _188Zborul()</code>. </p>
 * <ul>
 *     <li> Country: Romania (ROU) = <code>180</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: ZborulTarantulIClass  = <code>1</code>; </li>
 *     <li> Specific: _188Zborul  = <code>1</code>; </li>
 *     <li> Entity type uid: 27814; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2532b351. </p>
 * @see Country#ROMANIA_ROU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class _188Zborul extends EntityType
{
    /** Default constructor */
    public _188Zborul()
    {
        setCountry(Country.ROMANIA_ROU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27812, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 27813, Zborul (Tarantul I) Class
        setSpecific((byte)1); // uid 27814, 188 Zborul
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _188Zborul createInstance()
    {
            return new _188Zborul();
    }
}
