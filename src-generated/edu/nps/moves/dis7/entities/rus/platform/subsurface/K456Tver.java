package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3531f3ca;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27195
 */
public class K456Tver extends EntityType
{
    /** Default constructor */
    public K456Tver()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)2); // uid 14771, SSGN (Nuclear Guided Missile)
        setSubCategory((byte)1); // uid 14772, Oscar II Class
        setSpecific((byte)5); // uid 27195, K-456 Tver
    }
}
