package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5cc3e49b;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 19563
 */
public class M601APIT extends EntityType
{
    /** Default constructor */
    public M601APIT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 19553, Ballistic
        setSubCategory((byte)2); // uid 19560, 20 mm
        setSpecific((byte)3); // uid 19563, M601 API-T
    }
}
