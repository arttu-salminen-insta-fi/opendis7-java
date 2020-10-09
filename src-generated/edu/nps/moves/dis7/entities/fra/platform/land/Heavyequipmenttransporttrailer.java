package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@68c72235
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 15704
 */
public class Heavyequipmenttransporttrailer extends EntityType
{
    public Heavyequipmenttransporttrailer()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 15704, Heavy equipment transport trailer
    }
}