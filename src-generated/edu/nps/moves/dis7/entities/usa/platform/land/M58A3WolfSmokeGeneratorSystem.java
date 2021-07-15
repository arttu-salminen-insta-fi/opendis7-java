package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18a25bbd;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22857
 */
public class M58A3WolfSmokeGeneratorSystem extends EntityType
{
    /** Default constructor */
    public M58A3WolfSmokeGeneratorSystem()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 10080, FMC M113 Armored Personnel Carrier (APC)
        setSpecific((byte)35); // uid 22857, M58A3 Wolf Smoke Generator System
    }
}
