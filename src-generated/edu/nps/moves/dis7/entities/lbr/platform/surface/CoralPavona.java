package edu.nps.moves.dis7.entities.lbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6063d80a;
 * Country: Liberia (LBR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24540
 */
public class CoralPavona extends EntityType
{
    /** Default constructor */
    public CoralPavona()
    {
        setCountry(Country.LIBERIA_LBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24523, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24524, Liquid Petroleum Gas (LPG)Tanker
        setSpecific((byte)7); // uid 24540, Coral Pavona
    }
}
