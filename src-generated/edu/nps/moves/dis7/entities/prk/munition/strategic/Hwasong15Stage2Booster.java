package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1be52861;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32862
 */
public class Hwasong15Stage2Booster extends EntityType
{
    /** Default constructor */
    public Hwasong15Stage2Booster()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)169); // uid 32858, Hwasong 15
        setSpecific((byte)5); // uid 32862, Hwasong 15 Stage 2 Booster
    }
}
