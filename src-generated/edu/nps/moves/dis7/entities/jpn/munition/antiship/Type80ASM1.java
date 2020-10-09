package edu.nps.moves.dis7.entities.jpn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4245bf68
 * Country: Japan (JPN)
 * Entity kind: Munition
 * Domain: ANTI_SHIP
 *
 * Entity type uid: 29038
 */
public class Type80ASM1 extends EntityType
{
    public Type80ASM1()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21690, Guided
        setSubCategory((byte)3); // uid 29037, ASM-1/1C (Type 80/91)
        setSpecific((byte)1); // uid 29038, Type 80 (ASM-1)
    }
}