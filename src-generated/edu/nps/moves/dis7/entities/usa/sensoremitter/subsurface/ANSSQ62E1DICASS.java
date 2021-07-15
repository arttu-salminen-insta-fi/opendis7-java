package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@77f03916;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 22390
 */
public class ANSSQ62E1DICASS extends EntityType
{
    /** Default constructor */
    public ANSSQ62E1DICASS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22382, Acoustic, active
        setSubCategory((byte)77); // uid 22384, Sonobuoy
        setSpecific((byte)1); // uid 22385, AN/SSQ-62 DICASS (Directional Command Active Sonobuoy System)
        setExtra((byte)5); // uid 22390, AN/SSQ-62E1 DICASS
    }
}
