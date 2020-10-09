package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5891b7c5
 * Country: Russia (RUS)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22444
 */
public class MeteorologicalRadar extends EntityType
{
    public MeteorologicalRadar()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
        setSubCategory((byte)14); // uid 22444, Meteorological Radar
    }
}