package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@147ed70f
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 29626
 */
public class _804Huoqiu extends EntityType
{
    public _804Huoqiu()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17178, Mine Countermeasure Ship/Craft
        setSubCategory((byte)7); // uid 29625, Wozang Class (Type 082-II) (Coastal Minehunter)
        setSpecific((byte)1); // uid 29626, 804 Huoqiu
    }
}