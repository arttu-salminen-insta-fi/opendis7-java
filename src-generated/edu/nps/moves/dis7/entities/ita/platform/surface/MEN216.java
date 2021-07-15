package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@163d04ff;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18399
 */
public class MEN216 extends EntityType
{
    /** Default constructor */
    public MEN216()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18374, Auxiliary
        setSubCategory((byte)7); // uid 18397, Men 215 Class (LCVP)
        setSpecific((byte)2); // uid 18399, MEN 216
    }
}
