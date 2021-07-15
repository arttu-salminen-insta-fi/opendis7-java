package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4387d2f4;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 24160
 */
public class RR144AAL extends EntityType
{
    /** Default constructor */
    public RR144AAL()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 22220, Chaff
        setSubCategory((byte)1); // uid 22221, Bundle
        setSpecific((byte)10); // uid 22233, RR-144 Chaff
        setExtra((byte)2); // uid 24160, RR-144A/AL
    }
}
