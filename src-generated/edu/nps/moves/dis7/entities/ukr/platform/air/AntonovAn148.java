package edu.nps.moves.dis7.entities.ukr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e9469b8
 * Country: Ukraine (UKR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29251
 */
public class AntonovAn148 extends EntityType
{
    public AntonovAn148()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 29244, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 29250, Twin Jet
        setSpecific((byte)1); // uid 29251, Antonov An-148
    }
}