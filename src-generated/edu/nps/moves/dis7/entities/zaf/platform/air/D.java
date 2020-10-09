package edu.nps.moves.dis7.entities.zaf.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4beabeec
 * Country: South Africa (ZAF)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 19111
 */
public class D extends EntityType
{
    public D()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 19108, Fighter / Air Defense
        setSubCategory((byte)1); // uid 19109, Cheetah
        setSpecific((byte)2); // uid 19111, D
    }
}