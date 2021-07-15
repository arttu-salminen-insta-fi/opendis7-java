package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17134190;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32368
 */
public class SSN23Stage2Vehicle extends EntityType
{
    /** Default constructor */
    public SSN23Stage2Vehicle()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)40); // uid 32367, SS-N-23 Skiff
        setSpecific((byte)1); // uid 32368, SS-N-23 Stage 2 Vehicle
    }
}
