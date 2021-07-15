package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6c42f2a1;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 14759
 */
public class SSBNNuclearBallisticMissile extends EntityType
{
    /** Default constructor */
    public SSBNNuclearBallisticMissile()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 14759, SSBN (Nuclear Ballistic Missile)
    }
}
