package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7e91ed74;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 10758
 */
public class F14A extends EntityType
{
    /** Default constructor */
    public F14A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 10755, Fighter/Air Defense
        setSubCategory((byte)2); // uid 10757, Grumman F-14 Tomcat
        setSpecific((byte)1); // uid 10758, F-14A
    }
}
