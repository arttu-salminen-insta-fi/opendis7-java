package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1431267b;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13987
 */
public class NikolayZubovclassnavalresearch extends EntityType
{
    /** Default constructor */
    public NikolayZubovclassnavalresearch()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)28); // uid 13987, Nikolay Zubov class (naval research)
    }
}
