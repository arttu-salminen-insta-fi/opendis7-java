package edu.nps.moves.dis7.entities.irn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7216fb24
 * Country: Iran (Islamic Republic of) (IRN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29894
 */
public class AbabilB extends EntityType
{
    public AbabilB()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 29882, Unmanned
        setSubCategory((byte)2); // uid 29889, Ababil
        setSpecific((byte)5); // uid 29894, Ababil-B
    }
}