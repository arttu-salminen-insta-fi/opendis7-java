package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4b790d86
 * Country: Sweden (SWE)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 27646
 */
public class LargeTrackedUtilityVehicle extends EntityType
{
    public LargeTrackedUtilityVehicle()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 27646, Large Tracked Utility Vehicle
    }
}