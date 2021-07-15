package edu.nps.moves.dis7.entities.rus.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@b56ec6c;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_SUBMARINE;
 *
 * Entity type uid: 29562
 */
public class MTT extends EntityType
{
    /** Default constructor */
    public MTT()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 20606, Guided
        setSubCategory((byte)20); // uid 29562, MTT
    }
}
