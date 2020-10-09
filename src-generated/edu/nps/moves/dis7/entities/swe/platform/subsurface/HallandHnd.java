package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2eae4349
 * Country: Sweden (SWE)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 27291
 */
public class HallandHnd extends EntityType
{
    public HallandHnd()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17502, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)4); // uid 27289, Gotland (A19) Class
        setSpecific((byte)2); // uid 27291, Halland (Hnd)
    }
}