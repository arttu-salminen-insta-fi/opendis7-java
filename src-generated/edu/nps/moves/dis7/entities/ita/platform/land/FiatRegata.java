package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ba302e0;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24858
 */
public class FiatRegata extends EntityType
{
    /** Default constructor */
    public FiatRegata()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24856, Car
        setSubCategory((byte)42); // uid 24857, 4-Door Sedan, Economy/Compact (Small)
        setSpecific((byte)1); // uid 24858, Fiat Regata
    }
}
