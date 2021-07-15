package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41bfa9e9;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11564
 */
public class FFG932ChinYangexRobertEPerryFF1073Taiwan extends EntityType
{
    /** Default constructor */
    public FFG932ChinYangexRobertEPerryFF1073Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 11498, Guided Missile Frigate
        setSubCategory((byte)2); // uid 11563, Knox Class
        setSpecific((byte)1); // uid 11564, FFG 932 Chin Yang (ex. Robert E. Perry FF 1073) (Taiwan)
    }
}
