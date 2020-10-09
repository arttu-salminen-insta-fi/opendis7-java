package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@12e5da86
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 32347
 */
public class WarriorOPVChobhamEPBAArmour extends EntityType
{
    public WarriorOPVChobhamEPBAArmour()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 14887, Armored Fighting Vehicle
        setSubCategory((byte)8); // uid 14897, FV 510 Warrior
        setSpecific((byte)4); // uid 28143, Warrior Observation Post Vehicle (OPV, FV 514)
        setExtra((byte)2); // uid 32347, Warrior OPV Chobham EPBA Armour
    }
}