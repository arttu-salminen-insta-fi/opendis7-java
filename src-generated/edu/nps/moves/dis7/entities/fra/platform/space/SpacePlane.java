package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@57db2b13
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 16209
 */
public class SpacePlane extends EntityType
{
    public SpacePlane()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 16208, Manned
        setSubCategory((byte)6); // uid 16209, Space Plane
    }
}