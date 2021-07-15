package edu.nps.moves.dis7.entities.che.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a0963be;
 * Country: Switzerland (CHE);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 21731
 */
public class HEI extends EntityType
{
    /** Default constructor */
    public HEI()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21725, Ballistic
        setSubCategory((byte)1); // uid 21726, 35 mm
        setSpecific((byte)5); // uid 21731, HEI
    }
}
