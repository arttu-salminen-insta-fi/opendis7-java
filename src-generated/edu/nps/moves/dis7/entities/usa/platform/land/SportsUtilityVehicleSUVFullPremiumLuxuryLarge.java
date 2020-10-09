package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5c887052
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24924
 */
public class SportsUtilityVehicleSUVFullPremiumLuxuryLarge extends EntityType
{
    public SportsUtilityVehicleSUVFullPremiumLuxuryLarge()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24919, Car
        setSubCategory((byte)114); // uid 24924, Sports Utility Vehicle (SUV), Full/Premium/Luxury (Large)
    }
}