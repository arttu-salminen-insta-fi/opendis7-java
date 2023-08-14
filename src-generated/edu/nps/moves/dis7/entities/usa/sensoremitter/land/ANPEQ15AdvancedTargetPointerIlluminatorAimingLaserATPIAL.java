/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL.createInstance()</code> or <code>new ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Electro-Optical = <code>5</code>; </li>
 *     <li> SubCategory: GuidanceIllumination  = <code>7</code>; </li>
 *     <li> Specific: ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL  = <code>1</code>; </li>
 *     <li> Entity type uid: 32301; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@301d84f6. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectroOptical
 * @see SubCategory

 */
public final class ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL extends EntityType
{
    /** Default constructor */
    public ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 23721, Electro-Optical
        setSubCategory((byte)7); // uid 32300, Guidance/Illumination
        setSpecific((byte)1); // uid 32301, AN/PEQ-15 Advanced Target Pointer Illuminator Aiming Laser (ATPIAL)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL createInstance()
    {
            return new ANPEQ15AdvancedTargetPointerIlluminatorAimingLaserATPIAL();
    }
}
