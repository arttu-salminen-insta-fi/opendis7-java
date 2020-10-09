package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25c53f74
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 13752
 */
public class Zheleznyakov extends EntityType
{
    public Zheleznyakov()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 13709, Mine Countermeasure Ship / Craft
        setSubCategory((byte)19); // uid 13751, Gorya class (minehunter, ocean)
        setSpecific((byte)1); // uid 13752, Zheleznyakov
    }
}