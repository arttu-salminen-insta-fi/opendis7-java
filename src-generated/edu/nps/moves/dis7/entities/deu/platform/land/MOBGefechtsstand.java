/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MOBGefechtsstand</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MOBGefechtsstand.createInstance()</code> or <code>new MOBGefechtsstand()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Command Facility = <code>34</code>; </li>
 *     <li> SubCategory: MOBGefechtsstand  = <code>1</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 28053; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@8ad6665. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommandFacility
 * @see SubCategory

 */
public final class MOBGefechtsstand extends EntityType
{
    /** Default constructor */
    public MOBGefechtsstand()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)34); // uid 28052, Command Facility
        setSubCategory((byte)1); // uid 28053, MOB Gefechtsstand
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MOBGefechtsstand createInstance()
    {
            return new MOBGefechtsstand();
    }
}
