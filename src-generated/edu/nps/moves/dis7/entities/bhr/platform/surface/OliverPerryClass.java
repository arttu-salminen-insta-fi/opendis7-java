package edu.nps.moves.dis7.entities.bhr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6276ae34
 * Country: Bahrain (BHR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 32603
 */
public class OliverPerryClass extends EntityType
{
    public OliverPerryClass()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 32602, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 32603, Oliver Perry Class
    }
}