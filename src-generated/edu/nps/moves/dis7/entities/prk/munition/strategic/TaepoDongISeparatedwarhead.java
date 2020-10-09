package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2616b618
 * Country: Korea (Democratic Peoples Republic of) (PRK)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 21605
 */
public class TaepoDongISeparatedwarhead extends EntityType
{
    public TaepoDongISeparatedwarhead()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)1); // uid 21603, Taepo Dong I
        setSpecific((byte)3); // uid 21605, Taepo Dong I Separated warhead
    }
}