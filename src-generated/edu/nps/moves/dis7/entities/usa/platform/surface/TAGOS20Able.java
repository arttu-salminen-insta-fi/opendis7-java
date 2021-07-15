package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@70997a94;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 12053
 */
public class TAGOS20Able extends EntityType
{
    /** Default constructor */
    public TAGOS20Able()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)59); // uid 12049, Surveillance Towed Array Sonar System (SURTASS)
        setSubCategory((byte)2); // uid 12051, SWATH-S (Small) class
        setSpecific((byte)2); // uid 12053, TAGOS 20 Able
    }
}
