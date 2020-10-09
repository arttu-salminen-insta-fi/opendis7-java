package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6f4a47c7
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24565
 */
public class DryCargoShipGroup2Merchant extends EntityType
{
    public DryCargoShipGroup2Merchant()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24565, Dry Cargo Ship (Group 2 Merchant)
    }
}