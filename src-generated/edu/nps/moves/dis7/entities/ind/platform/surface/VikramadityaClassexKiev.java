package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6ad3381f
 * Country: India (IND)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 26551
 */
public class VikramadityaClassexKiev extends EntityType
{
    public VikramadityaClassexKiev()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 26550, Carrier
        setSubCategory((byte)1); // uid 26551, Vikramaditya Class (ex-Kiev)
    }
}