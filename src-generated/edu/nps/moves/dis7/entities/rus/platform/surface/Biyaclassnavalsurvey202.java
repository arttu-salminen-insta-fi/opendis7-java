package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d01ea21;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 14083
 */
public class Biyaclassnavalsurvey202 extends EntityType
{
    /** Default constructor */
    public Biyaclassnavalsurvey202()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)34); // uid 14077, Biya class (naval survey)
        setSpecific((byte)6); // uid 14083, 202
    }
}
