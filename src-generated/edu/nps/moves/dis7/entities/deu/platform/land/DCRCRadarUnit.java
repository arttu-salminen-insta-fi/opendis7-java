package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5852c06f;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28057
 */
public class DCRCRadarUnit extends EntityType
{
    /** Default constructor */
    public DCRCRadarUnit()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)36); // uid 28054, Control Facility
        setSubCategory((byte)2); // uid 28055, DCRC
        setSpecific((byte)2); // uid 28057, DCRC Radar-Unit
    }
}
