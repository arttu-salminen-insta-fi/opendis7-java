package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6caf0677;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16084
 */
public class P671Glaive extends EntityType
{
    /** Default constructor */
    public P671Glaive()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 16080, Auxiliary, Merchant Marine
        setSubCategory((byte)1); // uid 16081, Government Maritime Forces
        setSpecific((byte)1); // uid 16082, Patra Class (fast patrol craft)
        setExtra((byte)2); // uid 16084, P 671 Glaive
    }
}
