package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1cf0cacc;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32005
 */
public class FoxhoundOpenTop extends EntityType
{
    /** Default constructor */
    public FoxhoundOpenTop()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 14935, Large Wheeled Utility Vehicle
        setSubCategory((byte)14); // uid 26207, Foxhound 4X4 LPPV
        setSpecific((byte)2); // uid 32005, Foxhound Open Top
    }
}
