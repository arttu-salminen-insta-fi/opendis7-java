package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@2be94b0f
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 26358
 */
public class ASWPatrolObservation extends EntityType
{
    public ASWPatrolObservation()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 26358, ASW/Patrol/Observation
    }
}