package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@70a9f84e
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 16941
 */
public class HQ2Launcherstandard extends EntityType
{
    public HQ2Launcherstandard()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16937, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 16938, HQ-2/CSA-1 SAM System
        setSpecific((byte)2); // uid 16940, HQ-2 Launcher
        setExtra((byte)1); // uid 16941, HQ-2 Launcher (standard)
    }
}