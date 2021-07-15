package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6f112f70;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 28850
 */
public class EarlyWarningSurveillance extends EntityType
{
    /** Default constructor */
    public EarlyWarningSurveillance()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 28849, RF Passive (intercept and DF)
        setSubCategory((byte)2); // uid 28850, Early Warning/Surveillance
    }
}
