/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.directedenergydeweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AreaEffectDEWeapon</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AreaEffectDEWeapon.createInstance()</code> or <code>new AreaEffectDEWeapon()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>DIRECTED_ENERGY_DE_WEAPON</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Area Effect DE Weapon = <code>2</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 20298; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@431babe6. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see AreaEffectDEWeapon

 */
public final class AreaEffectDEWeapon extends EntityType
{
    /** Default constructor */
    public AreaEffectDEWeapon()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.DIRECTED_ENERGY_DE_WEAPON));

        setCategory((byte)2); // uid 20298, Area Effect DE Weapon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AreaEffectDEWeapon createInstance()
    {
            return new AreaEffectDEWeapon();
    }
}
