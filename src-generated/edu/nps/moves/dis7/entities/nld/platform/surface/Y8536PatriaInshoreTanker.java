package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@702ed190;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28273
 */
public class Y8536PatriaInshoreTanker extends EntityType
{
    /** Default constructor */
    public Y8536PatriaInshoreTanker()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18942, Auxiliary
        setSubCategory((byte)9); // uid 28273, Y8536 Patria (Inshore Tanker)
    }
}
