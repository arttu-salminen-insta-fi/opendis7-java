package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6812fa3a
 * Country: Turkey (TUR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 19064
 */
public class FrigateincludingCorvette extends EntityType
{
    public FrigateincludingCorvette()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 19064, Frigate (including Corvette)
    }
}