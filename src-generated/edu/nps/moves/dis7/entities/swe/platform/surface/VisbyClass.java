package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4beaf6bd;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26883
 */
public class VisbyClass extends EntityType
{
    /** Default constructor */
    public VisbyClass()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 26874, Frigate (including Corvette)
        setSubCategory((byte)3); // uid 26883, Visby Class
    }
}
