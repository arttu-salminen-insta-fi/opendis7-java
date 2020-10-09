package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27abe2cd
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 29399
 */
public class HaulmarkTrailerHeavyCargoBulkFuelPumpStorage9000LHBFPS extends EntityType
{
    public HaulmarkTrailerHeavyCargoBulkFuelPumpStorage9000LHBFPS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 29396, Fuel Trailer
        setSubCategory((byte)2); // uid 29398, 1001 - 5000 Gallons
        setSpecific((byte)1); // uid 29399, Haulmark - Trailer, Heavy Cargo, Bulk Fuel Pump & Storage, 9000L (HBFP&S)
    }
}