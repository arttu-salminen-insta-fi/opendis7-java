package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@29aa4bc9
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_12_SLING_LOADS_NON_DOCTRINAL
 *
 * Entity type uid: 30855
 */
public class SlingLoadPalletofCrates7500lbs extends EntityType
{
    public SlingLoadPalletofCrates7500lbs()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)9); // uid 30853, Sling Load, Pallet of Crates
        setSubCategory((byte)2); // uid 30855, Sling Load, Pallet of Crates, 7500 lbs
    }
}