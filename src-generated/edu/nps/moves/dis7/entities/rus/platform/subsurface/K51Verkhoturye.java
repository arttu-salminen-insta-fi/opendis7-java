package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11b455e5;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26542
 */
public class K51Verkhoturye extends EntityType
{
    /** Default constructor */
    public K51Verkhoturye()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 14759, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)2); // uid 14761, Delta IV class
        setSpecific((byte)1); // uid 26542, K51 Verkhoturye
    }
}
