package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@77ecdc2b;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 24978
 */
public class M267TrainingWarheadSubmunitionM75PracticeMPSM extends EntityType
{
    /** Default constructor */
    public M267TrainingWarheadSubmunitionM75PracticeMPSM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)21); // uid 20150, Hydra 70 Rocket System (70 mm, 2.75 in)
        setSpecific((byte)10); // uid 24977, Hydra 70 w/ M267 Training Warhead (for M261)
        setExtra((byte)1); // uid 24978, M267 Training Warhead Submunition (M75 Practice MPSM)
    }
}
