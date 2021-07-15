package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d94a2dc;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22882
 */
public class UUGSMotionSensor extends EntityType
{
    /** Default constructor */
    public UUGSMotionSensor()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)23); // uid 10653, Warning System
        setSubCategory((byte)4); // uid 10657, Urban Unattended Ground Sensor (U-UGS)
        setSpecific((byte)2); // uid 22882, U-UGS Motion Sensor
    }
}
