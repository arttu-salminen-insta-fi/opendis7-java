package edu.nps.moves.dis7.entities.kaz.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6ffab045
 * Country: Kazakhstan (KAZ)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27543
 */
public class Utility extends EntityType
{
    public Utility()
    {
        setCountry(Country.KAZAKHSTAN_KAZ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 27543, Utility
    }
}