package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6efd0a6e;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_7_MAJOR_ITEMS;
 *
 * Entity type uid: 30638
 */
public class M61A1 extends EntityType
{
    /** Default constructor */
    public M61A1()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)9); // uid 30622, M - Weapons
        setSubCategory((byte)5); // uid 30636, 20 mm caliber
        setSpecific((byte)2); // uid 30638, M61A1
    }
}
