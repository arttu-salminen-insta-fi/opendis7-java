package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2cf3d63b
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 15934
 */
public class D643Jeandevienne extends EntityType
{
    public D643Jeandevienne()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15929, Guided Missile Destroyer (Fregates or Escorteurs Descadres)
        setSubCategory((byte)1); // uid 15930, Georges Leygues Class (Type f 70 (ASW))
        setSpecific((byte)4); // uid 15934, D 643 Jean de vienne
    }
}