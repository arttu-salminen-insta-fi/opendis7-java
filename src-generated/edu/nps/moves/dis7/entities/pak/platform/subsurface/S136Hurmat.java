package edu.nps.moves.dis7.entities.pak.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@304b9f1a
 * Country: Pakistan (PAK)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 27241
 */
public class S136Hurmat extends EntityType
{
    public S136Hurmat()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27234, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 27239, Hashmat / Agosta 70 Class
        setSpecific((byte)2); // uid 27241, S136 Hurmat
    }
}