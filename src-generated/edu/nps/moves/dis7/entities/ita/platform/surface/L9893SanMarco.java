package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e34ace1;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18638
 */
public class L9893SanMarco extends EntityType
{
    /** Default constructor */
    public L9893SanMarco()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 18635, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 18636, San Giorgio Class (LPDs)
        setSpecific((byte)2); // uid 18638, L9893 San Marco
    }
}
