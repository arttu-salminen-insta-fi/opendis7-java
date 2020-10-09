package edu.nps.moves.dis7.entities.chn.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@39023dbf
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 30568
 */
public class HHQ16 extends EntityType
{
    public HHQ16()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21308, Guided
        setSubCategory((byte)26); // uid 30567, HQ-16 SAM
        setSpecific((byte)1); // uid 30568, HHQ-16
    }
}