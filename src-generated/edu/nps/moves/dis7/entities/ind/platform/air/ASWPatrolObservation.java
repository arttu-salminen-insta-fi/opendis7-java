package edu.nps.moves.dis7.entities.ind.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5143c662
 * Country: India (IND)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 31437
 */
public class ASWPatrolObservation extends EntityType
{
    public ASWPatrolObservation()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 31437, ASW/Patrol/Observation
    }
}