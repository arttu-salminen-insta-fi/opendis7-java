package edu.nps.moves.dis7.entities.rus.sensoremitter.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@2976ef56;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: SURFACE;
 *
 * Entity type uid: 22452
 */
public class Other extends EntityType
{
    /** Default constructor */
    public Other()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)0); // uid 22452, Other
    }
}
