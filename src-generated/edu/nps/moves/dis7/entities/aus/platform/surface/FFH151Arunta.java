package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42f30e0a;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17515
 */
public class FFH151Arunta extends EntityType
{
    /** Default constructor */
    public FFH151Arunta()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17511, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 17513, ANZAC Class (Meko 200)
        setSpecific((byte)2); // uid 17515, FFH 151 Arunta
    }
}
