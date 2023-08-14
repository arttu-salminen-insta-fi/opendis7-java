/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Trailercargo2axle4tonSMZ710Z</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Trailercargo2axle4tonSMZ710Z.createInstance()</code> or <code>new Trailercargo2axle4tonSMZ710Z()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: _2015ton  = <code>3</code>; </li>
 *     <li> Specific: Trailercargo2axle4tonSMZ710Z  = <code>1</code>; </li>
 *     <li> Entity type uid: 12992; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@14dc3f89. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class Trailercargo2axle4tonSMZ710Z extends EntityType
{
    /** Default constructor */
    public Trailercargo2axle4tonSMZ710Z()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 12987, Cargo Trailer
        setSubCategory((byte)3); // uid 12991, 2.01 - 5 ton
        setSpecific((byte)1); // uid 12992, Trailer, cargo, 2 axle, 4 ton, SMZ-710Z
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Trailercargo2axle4tonSMZ710Z createInstance()
    {
            return new Trailercargo2axle4tonSMZ710Z();
    }
}
