package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@37fbe4a8;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23305
 */
public class DeZevenProvincienClass extends EntityType
{
    /** Default constructor */
    public DeZevenProvincienClass()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18938, Guided Missile Frigate (FFG)
        setSubCategory((byte)4); // uid 23305, De Zeven Provincien Class
    }
}
