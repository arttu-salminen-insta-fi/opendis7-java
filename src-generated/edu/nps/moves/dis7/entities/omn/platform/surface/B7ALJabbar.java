/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>B7ALJabbar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>B7ALJabbar.createInstance()</code> or <code>new B7ALJabbar()</code>. </p>
 * <ul>
 *     <li> Country: Oman (OMN) = <code>164</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: ALWaafiBrookeMarineClassfastattackcraftgun  = <code>2</code>; </li>
 *     <li> Specific: B7ALJabbar  = <code>4</code>; </li>
 *     <li> Entity type uid: 17949; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27068a50. </p>
 * @see Country#OMAN_OMN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class B7ALJabbar extends EntityType
{
    /** Default constructor */
    public B7ALJabbar()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17942, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17945, AL Waafi (Brooke Marine) Class (fast attack craft-gun)
        setSpecific((byte)4); // uid 17949, B7 AL Jabbar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static B7ALJabbar createInstance()
    {
            return new B7ALJabbar();
    }
}
