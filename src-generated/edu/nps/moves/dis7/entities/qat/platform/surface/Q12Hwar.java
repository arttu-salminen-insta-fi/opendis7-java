package edu.nps.moves.dis7.entities.qat.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@408a247c;
 * Country: Qatar (QAT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17835
 */
public class Q12Hwar extends EntityType
{
    /** Default constructor */
    public Q12Hwar()
    {
        setCountry(Country.QATAR_QAT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17828, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17833, Barzan Class (large patrol craft)
        setSpecific((byte)2); // uid 17835, Q12 Hwar
    }
}
