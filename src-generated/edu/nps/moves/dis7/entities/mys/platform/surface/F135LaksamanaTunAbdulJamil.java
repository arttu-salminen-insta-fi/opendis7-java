/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mys.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F135LaksamanaTunAbdulJamil</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F135LaksamanaTunAbdulJamil.createInstance()</code> or <code>new F135LaksamanaTunAbdulJamil()</code>. </p>
 * <ul>
 *     <li> Country: Malaysia (MYS) = <code>132</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: LaksamanaClass  = <code>1</code>; </li>
 *     <li> Specific: F135LaksamanaTunAbdulJamil  = <code>2</code>; </li>
 *     <li> Entity type uid: 27460; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@210f0cc1. </p>
 * @see Country#MALAYSIA_MYS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class F135LaksamanaTunAbdulJamil extends EntityType
{
    /** Default constructor */
    public F135LaksamanaTunAbdulJamil()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27457, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 27458, Laksamana Class
        setSpecific((byte)2); // uid 27460, F135 Laksamana Tun Abdul Jamil
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F135LaksamanaTunAbdulJamil createInstance()
    {
            return new F135LaksamanaTunAbdulJamil();
    }
}
