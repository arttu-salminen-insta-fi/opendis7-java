package edu.nps.moves.dis7.entities.fra.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4652c74d
 * Country: France (FRA)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 29550
 */
public class CTATPT extends EntityType
{
    public CTATPT()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21065, Ballistic
        setSubCategory((byte)15); // uid 29547, 40mm
        setSpecific((byte)1); // uid 29548, Cased Telescopic Ammunition (CTA)
        setExtra((byte)2); // uid 29550, CTA TP-T
    }
}