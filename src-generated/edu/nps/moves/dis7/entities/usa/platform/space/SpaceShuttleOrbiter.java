package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3757e8e2
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 12423
 */
public class SpaceShuttleOrbiter extends EntityType
{
    public SpaceShuttleOrbiter()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 12422, Manned
        setSubCategory((byte)1); // uid 12423, Space Shuttle Orbiter
    }
}