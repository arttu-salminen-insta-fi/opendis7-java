package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@315105f
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24121
 */
public class M977RadioJammer extends EntityType
{
    public M977RadioJammer()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)19); // uid 10543, Oshkosh Heavy Expanded Mobility Tactical Truck (HEMTT) 8x8 9979-kg
        setSpecific((byte)1); // uid 10544, M977 cargo
        setExtra((byte)1); // uid 24121, M977 Radio Jammer
    }
}