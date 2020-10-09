package edu.nps.moves.dis7.entities.ser.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@468dda3e
 * Country: Serbia and Montenegro
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 19086
 */
public class SSConventionalAttackTorpedoPatrol extends EntityType
{
    public SSConventionalAttackTorpedoPatrol()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 19086, SS (Conventional Attack-Torpedo, Patrol)
    }
}