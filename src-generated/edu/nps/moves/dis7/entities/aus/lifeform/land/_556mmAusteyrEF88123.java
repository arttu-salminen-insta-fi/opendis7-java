package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2bfc8558
 * Country: Australia (AUS)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 31554
 */
public class _556mmAusteyrEF88123 extends EntityType
{
    public _556mmAusteyrEF88123()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 31543, Australian Special Operations Command (SOCOMD)
        setSubCategory((byte)5); // uid 31544, Assault Rifles
        setSpecific((byte)62); // uid 31554, 5.56mm Austeyr EF88
    }
}