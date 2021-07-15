package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d7637e6;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11696
 */
public class PHM2Hercules extends EntityType
{
    /** Default constructor */
    public PHM2Hercules()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 11693, Hydrofoil
        setSubCategory((byte)1); // uid 11694, Pegasus class
        setSpecific((byte)2); // uid 11696, PHM 2 Hercules
    }
}
