package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@de81be1;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28807
 */
public class ChevyS10wRBS70 extends EntityType
{
    /** Default constructor */
    public ChevyS10wRBS70()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24926, Single Unit Cargo Truck
        setSubCategory((byte)1); // uid 24927, Pickup Truck, Mini
        setSpecific((byte)1); // uid 24928, Chevy S-10
        setExtra((byte)10); // uid 28807, Chevy S-10 w/ RBS 70
    }
}
