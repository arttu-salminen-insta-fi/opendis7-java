package edu.nps.moves.dis7.entities.bra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a216eb4;
 * Country: Brazil (BRA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 26959
 */
public class CartridgeAFV90mmHETEngequimica extends EntityType
{
    /** Default constructor */
    public CartridgeAFV90mmHETEngequimica()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21778, Ballistic
        setSubCategory((byte)2); // uid 26957, 90mm
        setSpecific((byte)2); // uid 26959, Cartridge, AFV, 90mm, HE-T, Engequimica
    }
}
