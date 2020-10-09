package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@13fed1ec
 * Country: Saudi Arabia (SAU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17850
 */
public class MadinaTypeF2000SClass extends EntityType
{
    public MadinaTypeF2000SClass()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17849, Guided Missile Frigate
        setSubCategory((byte)1); // uid 17850, Madina (Type F 2000S) Class
    }
}