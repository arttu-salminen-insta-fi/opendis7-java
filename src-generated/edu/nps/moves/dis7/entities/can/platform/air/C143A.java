package edu.nps.moves.dis7.entities.can.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@17579e0f
 * Country: Canada (CAN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 26119
 */
public class C143A extends EntityType
{
    public C143A()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23881, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23884, Twin Jet
        setSpecific((byte)4); // uid 26110, Bombardier Challenger 600
        setExtra((byte)9); // uid 26119, C-143A
    }
}