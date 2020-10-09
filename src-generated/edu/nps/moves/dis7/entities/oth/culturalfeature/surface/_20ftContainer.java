package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7a0f06ad
 * Country: Other
 * Entity kind: Cultural feature
 * Domain: SURFACE
 *
 * Entity type uid: 32919
 */
public class _20ftContainer extends EntityType
{
    public _20ftContainer()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 32917, Container
        setSubCategory((byte)2); // uid 32919, 20 ft Container
    }
}