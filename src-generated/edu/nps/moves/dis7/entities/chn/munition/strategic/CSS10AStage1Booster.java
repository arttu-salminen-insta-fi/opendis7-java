package edu.nps.moves.dis7.entities.chn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27a9f025;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32804
 */
public class CSS10AStage1Booster extends EntityType
{
    /** Default constructor */
    public CSS10AStage1Booster()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21556, Guided
        setSubCategory((byte)33); // uid 32800, CSS-10A (DF-31A)
        setSpecific((byte)5); // uid 32804, CSS-10A Stage 1 Booster
    }
}
