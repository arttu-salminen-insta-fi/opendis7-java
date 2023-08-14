/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A60550ballM33for50Spottingrifleetc</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A60550ballM33for50Spottingrifleetc.createInstance()</code> or <code>new A60550ballM33for50Spottingrifleetc()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _127mm  = <code>5</code>; </li>
 *     <li> Specific: A60550ballM33for50Spottingrifleetc  = <code>1</code>; </li>
 *     <li> Entity type uid: 19836; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1308ef19. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class A60550ballM33for50Spottingrifleetc extends EntityType
{
    /** Default constructor */
    public A60550ballM33for50Spottingrifleetc()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 19810, Ballistic
        setSubCategory((byte)5); // uid 19835, 12.7 mm
        setSpecific((byte)1); // uid 19836, A605 .50 ball M33 (for .50 Spotting rifle, etc.)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A60550ballM33for50Spottingrifleetc createInstance()
    {
            return new A60550ballM33for50Spottingrifleetc();
    }
}
