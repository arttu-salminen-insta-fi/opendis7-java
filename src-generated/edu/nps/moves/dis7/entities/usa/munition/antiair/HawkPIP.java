package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71dd4624
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 19433
 */
public class HawkPIP extends EntityType
{
    public HawkPIP()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)6); // uid 19431, MIM-23 Hawk C/E/F/G/H
        setSpecific((byte)2); // uid 19433, Hawk PIP
    }
}