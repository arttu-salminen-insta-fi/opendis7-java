package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26d40c77;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 30231
 */
public class AGM176B extends EntityType
{
    /** Default constructor */
    public AGM176B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 19519, Guided
        setSubCategory((byte)15); // uid 30229, AGM-176 Griffin
        setSpecific((byte)2); // uid 30231, AGM-176B
    }
}
