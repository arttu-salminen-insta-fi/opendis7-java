package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2415fc55;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 16373
 */
public class EurocopterBO105 extends EntityType
{
    /** Default constructor */
    public EurocopterBO105()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 16366, Utility Helicopter
        setSubCategory((byte)6); // uid 16373, Eurocopter BO 105
    }
}
