package edu.nps.moves.dis7.entities.are.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3b920bdc;
 * Country: United Arab Emirates (ARE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28583
 */
public class Hawk63A extends EntityType
{
    /** Default constructor */
    public Hawk63A()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28579, Trainer
        setSubCategory((byte)1); // uid 28580, BAE Systems Hawk
        setSpecific((byte)2); // uid 28582, Hawk 63
        setExtra((byte)1); // uid 28583, Hawk 63A
    }
}
