package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71870da7
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 13229
 */
public class MiG21SFishbedH extends EntityType
{
    public MiG21SFishbedH()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 13174, Fighter/Air Defense
        setSubCategory((byte)6); // uid 13224, MiG-21 Fishbed/Mongol
        setSpecific((byte)5); // uid 13229, MiG-21S Fishbed H
    }
}