/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MSO511Affray</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MSO511Affray.createInstance()</code> or <code>new MSO511Affray()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine countermeasure ship/craft = <code>8</code>; </li>
 *     <li> SubCategory: AcmeClass  = <code>3</code>; </li>
 *     <li> Specific: MSO511Affray  = <code>2</code>; </li>
 *     <li> Entity type uid: 11619; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@175c5c3a. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Minecountermeasureshipcraft
 * @see SubCategory

 */
public final class MSO511Affray extends EntityType
{
    /** Default constructor */
    public MSO511Affray()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 11588, Mine countermeasure ship/craft
        setSubCategory((byte)3); // uid 11617, Acme Class
        setSpecific((byte)2); // uid 11619, MSO 511 Affray
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MSO511Affray createInstance()
    {
            return new MSO511Affray();
    }
}
