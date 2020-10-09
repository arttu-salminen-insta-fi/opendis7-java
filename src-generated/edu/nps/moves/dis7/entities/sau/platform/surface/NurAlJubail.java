package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f117b3d
 * Country: Saudi Arabia (SAU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24435
 */
public class NurAlJubail extends EntityType
{
    public NurAlJubail()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24433, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24434, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24435, Nur Al Jubail
    }
}