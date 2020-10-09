package edu.nps.moves.dis7.entities.jpn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5cc126dc
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 26998
 */
public class FuyushioSS588TSS3607 extends EntityType
{
    public FuyushioSS588TSS3607()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18910, SS (Conventional Attack-Torpedo Patrol)
        setSubCategory((byte)1); // uid 18911, Harushio Class (SS)
        setSpecific((byte)6); // uid 26998, Fuyushio SS-588/TSS-3607
    }
}