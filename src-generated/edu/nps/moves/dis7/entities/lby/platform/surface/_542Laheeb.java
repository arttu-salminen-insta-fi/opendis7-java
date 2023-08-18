/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_542Laheeb</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_542Laheeb.createInstance()</code> or <code>new _542Laheeb()</code>. </p>
 * <ul>
 *     <li> Country: Libya (LBY) = <code>126</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft (PC) = <code>7</code>; </li>
 *     <li> SubCategory: Combattante2GClass  = <code>1</code>; </li>
 *     <li> Specific: _542Laheeb  = <code>1</code>; </li>
 *     <li> Entity type uid: 18920; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41c89d2f. </p>
 * @see Country#LIBYA_LBY
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraftPC
 * @see SubCategory

 */
public final class _542Laheeb extends EntityType
{
    /** Default constructor */
    public _542Laheeb()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18918, Light/Patrol Craft (PC)
        setSubCategory((byte)1); // uid 18919, Combattante 2 G Class
        setSpecific((byte)1); // uid 18920, 542 Laheeb
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _542Laheeb createInstance()
    {
            return new _542Laheeb();
    }
}
