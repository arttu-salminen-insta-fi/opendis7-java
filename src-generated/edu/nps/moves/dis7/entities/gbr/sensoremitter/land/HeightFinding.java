package edu.nps.moves.dis7.entities.gbr.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1f5d7fd5;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22468
 */
public class HeightFinding extends EntityType
{
    /** Default constructor */
    public HeightFinding()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22462, RF Active
        setSubCategory((byte)3); // uid 22468, Height Finding
    }
}
