package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5f7989fa
 * Country: Sweden (SWE)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 27297
 */
public class SSAConventionalAuxiliary extends EntityType
{
    public SSAConventionalAuxiliary()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 27297, SSA (Conventional Auxiliary)
    }
}