package edu.nps.moves.dis7.entities.usa.munition.antiguidedweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21c75084;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_GUIDED_WEAPON;
 *
 * Entity type uid: 26600
 */
public class RIM116BRAM extends EntityType
{
    /** Default constructor */
    public RIM116BRAM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_GUIDED_WEAPON));

        setCategory((byte)1); // uid 19663, Guided
        setSubCategory((byte)3); // uid 19668, RIM-116 RAM
        setSpecific((byte)2); // uid 26600, RIM-116B RAM
    }
}
