package edu.nps.moves.dis7.entities.esp.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@19f7222e;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22789
 */
public class Leopard2MBT extends EntityType
{
    /** Default constructor */
    public Leopard2MBT()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22788, Tank
        setSubCategory((byte)1); // uid 22789, Leopard 2 MBT
    }
}
