package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5edc3e29
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 28481
 */
public class Interim40ftSeaHunter extends EntityType
{
    public Interim40ftSeaHunter()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26437, Private Motorboat
        setSubCategory((byte)3); // uid 28479, Large Motorboat (up to 65ft/19.8m)
        setSpecific((byte)1); // uid 28480, U.S. Customs and Border Patrol (CBP) Interceptor Class
        setExtra((byte)1); // uid 28481, Interim 40ft Sea Hunter
    }
}