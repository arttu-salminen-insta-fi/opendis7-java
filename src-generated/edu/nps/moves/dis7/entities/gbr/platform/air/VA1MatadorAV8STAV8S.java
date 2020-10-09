package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6614bd4b
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 15004
 */
public class VA1MatadorAV8STAV8S extends EntityType
{
    public VA1MatadorAV8STAV8S()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 14994, Attack/Strike
        setSubCategory((byte)2); // uid 14999, Harrier
        setSpecific((byte)5); // uid 15004, VA.1 Matador (AV-8S & TAV-8S)
    }
}