package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2489e84a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 33080
 */
public class M1132SlatArmoredwMinePlow extends EntityType
{
    /** Default constructor */
    public M1132SlatArmoredwMinePlow()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 10115, Light Armored Vehicle (LAV) Stryker
        setSpecific((byte)29); // uid 10144, M1132 Stryker Engineer w/MK 240 7.62-mm machine gun
        setExtra((byte)2); // uid 33080, M1132 Slat Armored w/ Mine Plow
    }
}
