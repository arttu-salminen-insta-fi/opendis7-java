package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@770cae59;
 * Country: Australia (AUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 31508
 */
public class _9mmBeretta92S extends EntityType
{
    /** Default constructor */
    public _9mmBeretta92S()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 31462, Australian Army
        setSubCategory((byte)80); // uid 31506, Hand Guns
        setSpecific((byte)31); // uid 31508, 9mm Beretta 92S
    }
}
