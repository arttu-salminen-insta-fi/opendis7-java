/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.esp.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SikorskyS70B</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SikorskyS70B.createInstance()</code> or <code>new SikorskyS70B()</code>. </p>
 * <ul>
 *     <li> Country: Spain (ESP) = <code>198</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/Patrol Helicopter = <code>22</code>; </li>
 *     <li> SubCategory: SikorskyS70B  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29904; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@58437801. </p>
 * @see Country#SPAIN_ESP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarePatrolHelicopter
 * @see SubCategory

 */
public final class SikorskyS70B extends EntityType
{
    /** Default constructor */
    public SikorskyS70B()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 29903, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 29904, Sikorsky S-70B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SikorskyS70B createInstance()
    {
            return new SikorskyS70B();
    }
}
