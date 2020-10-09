package edu.nps.moves.dis7.entities.irn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2807bdeb
 * Country: Iran (Islamic Republic of) (IRN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 30040
 */
public class HESAAzarakhsh extends EntityType
{
    public HESAAzarakhsh()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 30039, Attack/Strike
        setSubCategory((byte)1); // uid 30040, HESA Azarakhsh
    }
}