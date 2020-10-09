package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@67b355c8
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 30189
 */
public class MQ19PortableGroundDataTerminalPGDT extends EntityType
{
    public MQ19PortableGroundDataTerminalPGDT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)5); // uid 30187, MQ-1/9 C2 Data Link Terminal
        setSpecific((byte)2); // uid 30189, MQ-1/9 Portable Ground Data Terminal (PGDT)
    }
}