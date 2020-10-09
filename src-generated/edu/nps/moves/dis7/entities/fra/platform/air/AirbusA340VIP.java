package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16610890
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 28015
 */
public class AirbusA340VIP extends EntityType
{
    public AirbusA340VIP()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 15791, Cargo/Tanker
        setSubCategory((byte)10); // uid 28014, Airbus A340
        setSpecific((byte)1); // uid 28015, Airbus A340 VIP
    }
}