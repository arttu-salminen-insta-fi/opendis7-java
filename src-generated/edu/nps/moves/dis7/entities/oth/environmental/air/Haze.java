package edu.nps.moves.dis7.entities.oth.environmental.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@12aa519b
 * Country: Other
 * Entity kind: Environmental
 * Domain: AIR
 *
 * Entity type uid: 21918
 */
public class Haze extends EntityType
{
    public Haze()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 21918, Haze
    }
}