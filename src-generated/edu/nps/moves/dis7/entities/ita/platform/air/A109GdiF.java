/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A109GdiF</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A109GdiF.createInstance()</code> or <code>new A109GdiF()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: AgustaWestlandAW109  = <code>5</code>; </li>
 *     <li> Specific: A109K  = <code>5</code>; </li>
 *     <li> Entity type uid: 28494; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2fab4aff. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class A109GdiF extends EntityType
{
    /** Default constructor */
    public A109GdiF()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 18315, Utility Helicopter
        setSubCategory((byte)5); // uid 18320, Agusta Westland AW109
        setSpecific((byte)5); // uid 28491, A109K
        setExtra((byte)3); // uid 28494, A109GdiF
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A109GdiF createInstance()
    {
            return new A109GdiF();
    }
}
