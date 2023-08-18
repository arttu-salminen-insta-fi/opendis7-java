/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L9011Foudre</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L9011Foudre.createInstance()</code> or <code>new L9011Foudre()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dock Landing Ship = <code>9</code>; </li>
 *     <li> SubCategory: FoudreclassTypeTCD90  = <code>1</code>; </li>
 *     <li> Specific: L9011Foudre  = <code>1</code>; </li>
 *     <li> Entity type uid: 16013; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f14a7d4. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DockLandingShip
 * @see SubCategory

 */
public final class L9011Foudre extends EntityType
{
    /** Default constructor */
    public L9011Foudre()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 16011, Dock Landing Ship
        setSubCategory((byte)1); // uid 16012, Foudre class (Type TCD 90)
        setSpecific((byte)1); // uid 16013, L 9011 Foudre
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L9011Foudre createInstance()
    {
            return new L9011Foudre();
    }
}
