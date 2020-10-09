package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d4fb0d8
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 25069
 */
public class FRAGHE9M53F extends EntityType
{
    public FRAGHE9M53F()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)15); // uid 20829, 122-mm rocket
        setSpecific((byte)12); // uid 25069, FRAG-HE, 9M53F
    }
}