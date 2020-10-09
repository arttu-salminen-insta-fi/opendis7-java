package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@192b472d
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 19977
 */
public class M242HEIT extends EntityType
{
    public M242HEIT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)1); // uid 19972, 20 mm
        setSpecific((byte)5); // uid 19977, M242 HE-I-T
    }
}