package edu.nps.moves.dis7.entities.csk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@42a48628;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 19131
 */
public class AeroL39CAlbatros extends EntityType
{
    /** Default constructor */
    public AeroL39CAlbatros()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 19128, Trainer
        setSubCategory((byte)3); // uid 19131, Aero L-39C Albatros
    }
}
