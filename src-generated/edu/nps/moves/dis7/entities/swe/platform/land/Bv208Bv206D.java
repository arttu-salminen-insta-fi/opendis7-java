package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24e83d19;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27648
 */
public class Bv208Bv206D extends EntityType
{
    /** Default constructor */
    public Bv208Bv206D()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 27646, Large Tracked Utility Vehicle
        setSubCategory((byte)1); // uid 27647, Bandvagn 206 (Bv 206)
        setSpecific((byte)1); // uid 27648, Bv 208 (Bv 206D)
    }
}
