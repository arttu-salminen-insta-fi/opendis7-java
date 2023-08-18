/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_403AhmedEsSakali</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_403AhmedEsSakali.createInstance()</code> or <code>new _403AhmedEsSakali()</code>. </p>
 * <ul>
 *     <li> Country: Morocco (MAR) = <code>147</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: BatralClass  = <code>2</code>; </li>
 *     <li> Specific: _403AhmedEsSakali  = <code>2</code>; </li>
 *     <li> Entity type uid: 27724; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62315f22. </p>
 * @see Country#MOROCCO_MAR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class _403AhmedEsSakali extends EntityType
{
    /** Default constructor */
    public _403AhmedEsSakali()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 27721, Landing Craft
        setSubCategory((byte)2); // uid 27722, Batral Class
        setSpecific((byte)2); // uid 27724, 403 Ahmed Es Sakali
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _403AhmedEsSakali createInstance()
    {
            return new _403AhmedEsSakali();
    }
}
