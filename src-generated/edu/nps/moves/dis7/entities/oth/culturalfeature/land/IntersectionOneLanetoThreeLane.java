/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IntersectionOneLanetoThreeLane</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IntersectionOneLanetoThreeLane.createInstance()</code> or <code>new IntersectionOneLanetoThreeLane()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Road element = <code>20</code>; </li>
 *     <li> SubCategory: Intersection  = <code>3</code>; </li>
 *     <li> Specific: IntersectionOneLanetoThreeLane  = <code>13</code>; </li>
 *     <li> Entity type uid: 22114; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a7bbdbc. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Roadelement
 * @see SubCategory

 */
public final class IntersectionOneLanetoThreeLane extends EntityType
{
    /** Default constructor */
    public IntersectionOneLanetoThreeLane()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 22100, Road element
        setSubCategory((byte)3); // uid 22111, Intersection
        setSpecific((byte)13); // uid 22114, Intersection, One Lane to Three Lane
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IntersectionOneLanetoThreeLane createInstance()
    {
            return new IntersectionOneLanetoThreeLane();
    }
}
