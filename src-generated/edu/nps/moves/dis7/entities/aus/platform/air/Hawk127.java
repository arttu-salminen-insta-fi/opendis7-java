package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75412c2f
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 28522
 */
public class Hawk127 extends EntityType
{
    public Hawk127()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28520, Trainer
        setSubCategory((byte)1); // uid 28521, BAE Systems Hawk
        setSpecific((byte)1); // uid 28522, Hawk 127
    }
}