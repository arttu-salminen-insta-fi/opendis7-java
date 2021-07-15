package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23592946;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 14545
 */
public class AvramiyZavenyaginexKapitanKrylov extends EntityType
{
    /** Default constructor */
    public AvramiyZavenyaginexKapitanKrylov()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 14477, Auxiliary, Merchant Marine
        setSubCategory((byte)10); // uid 14540, Kapitan Yevdokimov class (ice breakers)
        setSpecific((byte)5); // uid 14545, Avramiy Zavenyagin (ex-Kapitan Krylov)
    }
}
