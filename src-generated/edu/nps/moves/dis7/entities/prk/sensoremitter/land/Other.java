package edu.nps.moves.dis7.entities.prk.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@40c28b0d
 * Country: Korea (Democratic Peoples Republic of) (PRK)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22529
 */
public class Other extends EntityType
{
    public Other()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 22529, Other
    }
}