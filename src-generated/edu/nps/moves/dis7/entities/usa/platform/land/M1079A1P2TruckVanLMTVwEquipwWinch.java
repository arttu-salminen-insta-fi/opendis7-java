package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@273a5a8a;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32574
 */
public class M1079A1P2TruckVanLMTVwEquipwWinch extends EntityType
{
    /** Default constructor */
    public M1079A1P2TruckVanLMTVwEquipwWinch()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)12); // uid 10481, Stewart & Stevenson Family of Medium Tactical Vehicles (FMTV)
        setSpecific((byte)4); // uid 10485, M1079 Truck, Van; LMTV w/ Equip, w/ Winch
        setExtra((byte)1); // uid 32574, M1079A1P2 Truck, Van; LMTV w/ Equip, w/ Winch
    }
}
