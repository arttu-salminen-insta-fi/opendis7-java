/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.est.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M314Sakala</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M314Sakala.createInstance()</code> or <code>new M314Sakala()</code>. </p>
 * <ul>
 *     <li> Country: Estonia (EST) = <code>250</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: SandownClass  = <code>1</code>; </li>
 *     <li> Specific: M314Sakala  = <code>2</code>; </li>
 *     <li> Entity type uid: 27774; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32115b28. </p>
 * @see Country#ESTONIA_EST
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M314Sakala extends EntityType
{
    /** Default constructor */
    public M314Sakala()
    {
        setCountry(Country.ESTONIA_EST);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27555, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 27772, Sandown Class
        setSpecific((byte)2); // uid 27774, M314 Sakala
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M314Sakala createInstance()
    {
            return new M314Sakala();
    }
}
