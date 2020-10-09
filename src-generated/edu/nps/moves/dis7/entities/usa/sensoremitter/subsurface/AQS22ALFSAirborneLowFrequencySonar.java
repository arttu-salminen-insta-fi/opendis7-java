package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62054faf
 * Country: United States of America (USA)
 * Entity kind: Sensor/Emitter
 * Domain: SUBSURFACE
 *
 * Entity type uid: 29660
 */
public class AQS22ALFSAirborneLowFrequencySonar extends EntityType
{
    public AQS22ALFSAirborneLowFrequencySonar()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22382, Acoustic, active
        setSubCategory((byte)80); // uid 29659, Dipping Sonar
        setSpecific((byte)1); // uid 29660, AQS22 ALFS (Airborne Low Frequency Sonar)
    }
}