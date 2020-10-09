package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@91f565d
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 30191
 */
public class MQ19SurfaceTerminalSubsystemSTSS extends EntityType
{
    public MQ19SurfaceTerminalSubsystemSTSS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)5); // uid 30187, MQ-1/9 C2 Data Link Terminal
        setSpecific((byte)4); // uid 30191, MQ-1/9 Surface Terminal Subsystem (STSS)
    }
}