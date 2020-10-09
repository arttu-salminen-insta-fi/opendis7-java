package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@57c03d88
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 16388
 */
public class ExUSModifiedCharlesFAdamsclasstype103BDDGs extends EntityType
{
    public ExUSModifiedCharlesFAdamsclasstype103BDDGs()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 16387, Guided Missile Destroyer
        setSubCategory((byte)1); // uid 16388, Ex-US Modified Charles F. Adams class (type 103B) (DDGs)
    }
}