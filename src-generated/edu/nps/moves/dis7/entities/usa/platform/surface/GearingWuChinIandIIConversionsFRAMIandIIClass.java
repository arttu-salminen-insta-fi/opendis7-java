package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@53747c4a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11451
 */
public class GearingWuChinIandIIConversionsFRAMIandIIClass extends EntityType
{
    /** Default constructor */
    public GearingWuChinIandIIConversionsFRAMIandIIClass()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)7); // uid 11451, Gearing (Wu Chin I and II Conversions) (FRAM I and II) Class
    }
}
