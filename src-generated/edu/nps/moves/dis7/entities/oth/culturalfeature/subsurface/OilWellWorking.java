/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OilWellWorking</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OilWellWorking.createInstance()</code> or <code>new OilWellWorking()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Oil Well = <code>1</code>; </li>
 *     <li> SubCategory: OilWellWorking  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23416; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@68c4a860. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OilWell
 * @see SubCategory

 */
public final class OilWellWorking extends EntityType
{
    /** Default constructor */
    public OilWellWorking()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 22161, Oil Well
        setSubCategory((byte)1); // uid 23416, Oil Well, Working
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OilWellWorking createInstance()
    {
            return new OilWellWorking();
    }
}
