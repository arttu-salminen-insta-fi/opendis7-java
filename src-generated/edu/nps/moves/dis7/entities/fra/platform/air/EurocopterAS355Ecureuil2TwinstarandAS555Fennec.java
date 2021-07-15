package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2b91004a;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 15877
 */
public class EurocopterAS355Ecureuil2TwinstarandAS555Fennec extends EntityType
{
    /** Default constructor */
    public EurocopterAS355Ecureuil2TwinstarandAS555Fennec()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)14); // uid 15877, Eurocopter AS 355 Ecureuil 2 Twinstar and AS 555 Fennec
    }
}
