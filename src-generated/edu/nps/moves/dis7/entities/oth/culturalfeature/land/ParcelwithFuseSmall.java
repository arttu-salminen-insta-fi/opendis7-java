package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f1158ee;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 26346
 */
public class ParcelwithFuseSmall extends EntityType
{
    /** Default constructor */
    public ParcelwithFuseSmall()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)30); // uid 26175, Exposed Ordnance
        setSpecific((byte)4); // uid 26346, Parcel with Fuse, Small
    }
}
