package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2b4d4327
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 10790
 */
public class F15E extends EntityType
{
    public F15E()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 10755, Fighter/Air Defense
        setSubCategory((byte)5); // uid 10785, McDonnell-Douglas F-15 Eagle
        setSpecific((byte)5); // uid 10790, F-15E
    }
}