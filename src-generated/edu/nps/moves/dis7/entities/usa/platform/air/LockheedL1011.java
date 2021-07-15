package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24043ec5;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23819
 */
public class LockheedL1011 extends EntityType
{
    /** Default constructor */
    public LockheedL1011()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)88); // uid 23813, Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg)
        setSubCategory((byte)33); // uid 23818, Tri Jet
        setSpecific((byte)1); // uid 23819, Lockheed L-1011
    }
}
