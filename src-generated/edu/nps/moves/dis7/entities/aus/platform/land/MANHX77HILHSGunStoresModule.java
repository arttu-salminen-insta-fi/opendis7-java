package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@470e2030;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 29741
 */
public class MANHX77HILHSGunStoresModule extends EntityType
{
    /** Default constructor */
    public MANHX77HILHSGunStoresModule()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 29730, MAN HX77 - 8x8
        setSpecific((byte)1); // uid 29731, MAN HX77 Heavy Integrated Load Handling System (HILHS)
        setExtra((byte)10); // uid 29741, MAN HX77 HILHS Gun Stores Module
    }
}
