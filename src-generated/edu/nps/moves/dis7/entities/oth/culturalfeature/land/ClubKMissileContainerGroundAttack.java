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
 * <p> Entity class <b><code>ClubKMissileContainerGroundAttack</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ClubKMissileContainerGroundAttack.createInstance()</code> or <code>new ClubKMissileContainerGroundAttack()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Cargo Container = <code>16</code>; </li>
 *     <li> SubCategory: ClubKMissileContainer  = <code>2</code>; </li>
 *     <li> Specific: ClubKMissileContainerGroundAttack  = <code>2</code>; </li>
 *     <li> Entity type uid: 30590; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@8ee03f5. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoContainer
 * @see SubCategory

 */
public final class ClubKMissileContainerGroundAttack extends EntityType
{
    /** Default constructor */
    public ClubKMissileContainerGroundAttack()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 22062, Cargo Container
        setSubCategory((byte)2); // uid 30588, Club-K Missile Container
        setSpecific((byte)2); // uid 30590, Club-K Missile Container - Ground Attack
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ClubKMissileContainerGroundAttack createInstance()
    {
            return new ClubKMissileContainerGroundAttack();
    }
}
