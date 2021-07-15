package edu.nps.moves.dis7.entities.usa.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@30517a57;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_SUBMARINE;
 *
 * Entity type uid: 19794
 */
public class Mk44torpedo extends EntityType
{
    /** Default constructor */
    public Mk44torpedo()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 19775, Guided
        setSubCategory((byte)9); // uid 19794, Mk 44 torpedo
    }
}
