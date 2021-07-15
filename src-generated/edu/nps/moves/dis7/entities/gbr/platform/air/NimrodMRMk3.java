package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@79c5460e;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15062
 */
public class NimrodMRMk3 extends EntityType
{
    /** Default constructor */
    public NimrodMRMk3()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 15057, ASW/patrol/observation
        setSubCategory((byte)1); // uid 15058, Nimrod
        setSpecific((byte)4); // uid 15062, Nimrod MR Mk 3
    }
}
