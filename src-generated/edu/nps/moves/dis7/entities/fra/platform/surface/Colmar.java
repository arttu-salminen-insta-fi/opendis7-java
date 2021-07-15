package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54c5a2ff;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15984
 */
public class Colmar extends EntityType
{
    /** Default constructor */
    public Colmar()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 15978, Mine Countermeasure Ship / Craft
        setSubCategory((byte)1); // uid 15979, Narvik class (minehunter/sweeper)
        setSpecific((byte)5); // uid 15984, Colmar
    }
}
