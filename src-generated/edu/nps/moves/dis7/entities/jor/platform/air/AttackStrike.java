package edu.nps.moves.dis7.entities.jor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4e76dac
 * Country: Jordan (JOR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 18258
 */
public class AttackStrike extends EntityType
{
    public AttackStrike()
    {
        setCountry(Country.JORDAN_JOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 18258, Attack/Strike
    }
}