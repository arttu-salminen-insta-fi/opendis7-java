package edu.nps.moves.dis7.entities.usa.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@7f93f4c;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 19729
 */
public class Ballistic extends EntityType
{
    /** Default constructor */
    public Ballistic()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)2); // uid 19729, Ballistic
    }
}
