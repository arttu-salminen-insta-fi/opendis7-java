package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a2ddf26
 * Country: Slovakia (SVK)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 30123
 */
public class RM7085 extends EntityType
{
    public RM7085()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 30121, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 30122, RM-70
        setSpecific((byte)1); // uid 30123, RM-70/85
    }
}