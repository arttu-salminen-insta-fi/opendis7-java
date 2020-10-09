package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@53b7f657
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29439
 */
public class SinglePistonEngine extends EntityType
{
    public SinglePistonEngine()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 29438, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)11); // uid 29439, Single Piston Engine
    }
}