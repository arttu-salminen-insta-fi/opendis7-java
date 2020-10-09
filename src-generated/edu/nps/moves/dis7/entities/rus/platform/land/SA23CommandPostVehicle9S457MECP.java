package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2bfbffb2
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 29857
 */
public class SA23CommandPostVehicle9S457MECP extends EntityType
{
    public SA23CommandPostVehicle9S457MECP()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 13034, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)26); // uid 29855, SA-23 Gladiator/Giant SAM System (S-300VM/Antey-2500)
        setSpecific((byte)1); // uid 29856, SA-23 Target Detection and Designation Unit
        setExtra((byte)1); // uid 29857, SA-23 Command Post Vehicle (9S457ME CP)
    }
}