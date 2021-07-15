package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58f437b0;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32357
 */
public class MAMBABvS10VikingBased extends EntityType
{
    /** Default constructor */
    public MAMBABvS10VikingBased()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)29); // uid 32350, Command, Control, Communications, and Intelligence (C3I) System
        setSubCategory((byte)2); // uid 32355, Weapon Locating Radar
        setSpecific((byte)2); // uid 32357, MAMBA (BvS10 Viking Based)
    }
}
