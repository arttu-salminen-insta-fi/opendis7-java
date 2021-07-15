package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@491cafec;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 12243
 */
public class SteelheadWPB87324 extends EntityType
{
    /** Default constructor */
    public SteelheadWPB87324()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 12104, Coast Guard Cutters
        setSubCategory((byte)6); // uid 12199, Marine Protector Class (WPB)
        setSpecific((byte)44); // uid 12243, Steelhead (WPB 87324)
    }
}
