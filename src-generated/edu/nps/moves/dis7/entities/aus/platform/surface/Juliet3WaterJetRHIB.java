/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Juliet3WaterJetRHIB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Juliet3WaterJetRHIB.createInstance()</code> or <code>new Juliet3WaterJetRHIB()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: RigidHulledInflatableBoatRHIB  = <code>4</code>; </li>
 *     <li> Specific: Juliet3WaterJetRHIB  = <code>1</code>; </li>
 *     <li> Entity type uid: 30556; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12843fce. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft1
 * @see SubCategory

 */
public final class Juliet3WaterJetRHIB extends EntityType
{
    /** Default constructor */
    public Juliet3WaterJetRHIB()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 17585, Landing Craft
        setSubCategory((byte)4); // uid 30555, Rigid-Hulled Inflatable Boat (RHIB)
        setSpecific((byte)1); // uid 30556, Juliet 3 Water Jet RHIB
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Juliet3WaterJetRHIB createInstance()
    {
            return new Juliet3WaterJetRHIB();
    }
}
