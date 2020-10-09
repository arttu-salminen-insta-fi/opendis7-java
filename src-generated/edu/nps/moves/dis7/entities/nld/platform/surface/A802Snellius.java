package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31c269fd
 * Country: Netherlands (NLD)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 28286
 */
public class A802Snellius extends EntityType
{
    public A802Snellius()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18942, Auxiliary
        setSubCategory((byte)13); // uid 28285, Snellius Class (Hydrographic Survey)
        setSpecific((byte)1); // uid 28286, A802 Snellius
    }
}