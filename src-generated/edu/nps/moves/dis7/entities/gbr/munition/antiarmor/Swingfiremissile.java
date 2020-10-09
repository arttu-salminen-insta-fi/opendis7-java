package edu.nps.moves.dis7.entities.gbr.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6121a7dd
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 20976
 */
public class Swingfiremissile extends EntityType
{
    public Swingfiremissile()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 20974, Guided
        setSubCategory((byte)2); // uid 20976, Swingfire missile
    }
}