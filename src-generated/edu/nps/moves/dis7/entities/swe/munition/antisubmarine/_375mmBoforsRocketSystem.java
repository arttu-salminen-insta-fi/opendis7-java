package edu.nps.moves.dis7.entities.swe.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@d969452
 * Country: Sweden (SWE)
 * Entity kind: Munition
 * Domain: ANTI_SUBMARINE
 *
 * Entity type uid: 27011
 */
public class _375mmBoforsRocketSystem extends EntityType
{
    public _375mmBoforsRocketSystem()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 27010, Guided
        setSubCategory((byte)1); // uid 27011, 375-mm Bofors Rocket System
    }
}