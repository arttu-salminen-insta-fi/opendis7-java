package edu.nps.moves.dis7.entities.mys.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e6516e;
 * Country: Malaysia (MYS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28560
 */
public class Hawk108 extends EntityType
{
    /** Default constructor */
    public Hawk108()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28558, Trainer
        setSubCategory((byte)1); // uid 28559, BAE Systems Hawk
        setSpecific((byte)1); // uid 28560, Hawk 108
    }
}
