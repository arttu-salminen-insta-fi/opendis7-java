package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4fa1c212;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 26126
 */
public class Do328120 extends EntityType
{
    /** Default constructor */
    public Do328120()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 26121, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
        setSubCategory((byte)22); // uid 26122, Twin Engine Turboprop
        setSpecific((byte)1); // uid 26123, Dornier Do 328
        setExtra((byte)3); // uid 26126, Do 328-120
    }
}
