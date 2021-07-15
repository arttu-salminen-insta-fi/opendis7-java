package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a518813;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 14838
 */
public class Phobos extends EntityType
{
    /** Default constructor */
    public Phobos()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 14828, Manned
        setSubCategory((byte)3); // uid 14835, Space vehicles
        setSpecific((byte)3); // uid 14838, Phobos
    }
}
