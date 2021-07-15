package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@479111ba;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32573
 */
public class M1078A1P2TruckCargoLMTVwEquip extends EntityType
{
    /** Default constructor */
    public M1078A1P2TruckCargoLMTVwEquip()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)12); // uid 10481, Stewart & Stevenson Family of Medium Tactical Vehicles (FMTV)
        setSpecific((byte)1); // uid 10482, M1078 Truck, Cargo; LMTV w/ Equip
        setExtra((byte)1); // uid 32573, M1078A1P2 Truck, Cargo; LMTV w/ Equip
    }
}
