package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62315f22;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31686
 */
public class RosomakM1Mw30mmTurret extends EntityType
{
    /** Default constructor */
    public RosomakM1Mw30mmTurret()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 31683, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 31684, KTO Rosomak IFV
        setSpecific((byte)2); // uid 31686, Rosomak M1M w/30mm Turret
    }
}
