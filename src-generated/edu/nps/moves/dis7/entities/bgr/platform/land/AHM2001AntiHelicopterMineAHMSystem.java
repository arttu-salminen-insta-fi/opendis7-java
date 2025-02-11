/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AHM2001AntiHelicopterMineAHMSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AHM2001AntiHelicopterMineAHMSystem.createInstance()</code> or <code>new AHM2001AntiHelicopterMineAHMSystem()</code>. </p>
 * <ul>
 *     <li> Country: Bulgaria (BGR) = <code>33</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: AntiHelicopterMineAHMSystem  = <code>1</code>; </li>
 *     <li> Specific: AHM2001AntiHelicopterMineAHMSystem  = <code>1</code>; </li>
 *     <li> Entity type uid: 28722; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@307f6b8c. </p>
 * @see Country#BULGARIA_BGR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class AHM2001AntiHelicopterMineAHMSystem extends EntityType
{
    /** Default constructor */
    public AHM2001AntiHelicopterMineAHMSystem()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 28720, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 28721, Anti-Helicopter Mine (AHM) System
        setSpecific((byte)1); // uid 28722, AHM-200-1 Anti-Helicopter Mine (AHM) System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AHM2001AntiHelicopterMineAHMSystem createInstance()
    {
            return new AHM2001AntiHelicopterMineAHMSystem();
    }
}
