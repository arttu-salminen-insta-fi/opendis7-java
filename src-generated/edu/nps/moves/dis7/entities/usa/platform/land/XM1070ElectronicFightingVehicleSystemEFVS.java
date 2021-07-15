package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6bcb12e6;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10598
 */
public class XM1070ElectronicFightingVehicleSystemEFVS extends EntityType
{
    /** Default constructor */
    public XM1070ElectronicFightingVehicleSystemEFVS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 10578, Large Tracked Utility Vehicle
        setSubCategory((byte)3); // uid 10593, M992 Field Artillery Ammunition Support Vehicle (FAASV)
        setSpecific((byte)5); // uid 10598, XM1070 Electronic Fighting Vehicle System (EFVS)
    }
}
