package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5bfbf16f
 * Country: Canada (CAN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 30958
 */
public class NearshoreFisheryResearchVessel extends EntityType
{
    public NearshoreFisheryResearchVessel()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 26269, Coast Guard Cutters
        setSubCategory((byte)11); // uid 30958, Nearshore Fishery Research Vessel
    }
}