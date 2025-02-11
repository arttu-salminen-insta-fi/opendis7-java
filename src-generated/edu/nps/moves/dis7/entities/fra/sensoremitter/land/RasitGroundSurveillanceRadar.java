/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RasitGroundSurveillanceRadar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RasitGroundSurveillanceRadar.createInstance()</code> or <code>new RasitGroundSurveillanceRadar()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: BattlefieldSurveillance  = <code>24</code>; </li>
 *     <li> Specific: RasitGroundSurveillanceRadar  = <code>1</code>; </li>
 *     <li> Entity type uid: 23701; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28a3fc34. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class RasitGroundSurveillanceRadar extends EntityType
{
    /** Default constructor */
    public RasitGroundSurveillanceRadar()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22477, RF Active
        setSubCategory((byte)24); // uid 23700, Battlefield Surveillance
        setSpecific((byte)1); // uid 23701, Rasit Ground Surveillance Radar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RasitGroundSurveillanceRadar createInstance()
    {
            return new RasitGroundSurveillanceRadar();
    }
}
