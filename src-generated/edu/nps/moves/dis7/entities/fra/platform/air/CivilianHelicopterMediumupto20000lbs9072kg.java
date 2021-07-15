package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@1ed6388a;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 26604
 */
public class CivilianHelicopterMediumupto20000lbs9072kg extends EntityType
{
    /** Default constructor */
    public CivilianHelicopterMediumupto20000lbs9072kg()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 26604, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
    }
}
