package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2dfaea86;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 16231
 */
public class Titan extends EntityType
{
    /** Default constructor */
    public Titan()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16211, Unmanned
        setSubCategory((byte)13); // uid 16229, Science satellite
        setSpecific((byte)2); // uid 16231, Titan
    }
}
