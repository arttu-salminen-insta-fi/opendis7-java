package edu.nps.moves.dis7.entities.ita.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@77324a58;
 * Country: Italy (ITA);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21681
 */
public class _30mmtwin extends EntityType
{
    /** Default constructor */
    public _30mmtwin()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)2); // uid 21676, Ballistic
        setSubCategory((byte)5); // uid 21681, 30 mm twin
    }
}
