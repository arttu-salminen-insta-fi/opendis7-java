package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d1f7216
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 29519
 */
public class DD109Ariake extends EntityType
{
    public DD109Ariake()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)8); // uid 18898, Murasame Class
        setSpecific((byte)9); // uid 29519, DD-109 Ariake
    }
}