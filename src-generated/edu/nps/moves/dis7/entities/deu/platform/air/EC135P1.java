package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@651aed93;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 32994
 */
public class EC135P1 extends EntityType
{
    /** Default constructor */
    public EC135P1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 24076, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)13); // uid 24077, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
        setSpecific((byte)1); // uid 24078, Eurocopter EC135
        setExtra((byte)2); // uid 32994, EC135 P1
    }
}
