package edu.nps.moves.dis7.entities.usa.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@50ff7063
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_SUBMARINE
 *
 * Entity type uid: 19791
 */
public class SUBROC extends EntityType
{
    public SUBROC()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 19775, Guided
        setSubCategory((byte)7); // uid 19791, SUBROC
    }
}