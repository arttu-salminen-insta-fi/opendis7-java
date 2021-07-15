package edu.nps.moves.dis7.entities.idn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@70f59913;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28539
 */
public class AttackStrike extends EntityType
{
    /** Default constructor */
    public AttackStrike()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 28539, Attack/Strike
    }
}
