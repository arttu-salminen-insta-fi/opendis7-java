package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@790d8fdd
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 26441
 */
public class BostonWhalerMontauk170 extends EntityType
{
    public BostonWhalerMontauk170()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26437, Private Motorboat
        setSubCategory((byte)1); // uid 26438, Small Motorboat (up to 26ft/7.9m)
        setSpecific((byte)2); // uid 26439, Boston Whaler Montauk
        setExtra((byte)2); // uid 26441, Boston Whaler Montauk 170
    }
}