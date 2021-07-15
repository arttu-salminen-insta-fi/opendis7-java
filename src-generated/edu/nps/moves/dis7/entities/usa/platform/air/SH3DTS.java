package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32f1fafe;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 11139
 */
public class SH3DTS extends EntityType
{
    /** Default constructor */
    public SH3DTS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 11133, Anti-Submarine Warfare/patrol helicopter
        setSubCategory((byte)2); // uid 11136, Agusta Sikorsky AS-61/ASH-3H Sea King
        setSpecific((byte)3); // uid 11139, SH-3D/TS
    }
}
