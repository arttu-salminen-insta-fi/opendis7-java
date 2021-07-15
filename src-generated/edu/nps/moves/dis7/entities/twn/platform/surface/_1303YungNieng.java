package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@70887727;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19223
 */
public class _1303YungNieng extends EntityType
{
    /** Default constructor */
    public _1303YungNieng()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19219, Mine Coutermeasures Ship/Craft
        setSubCategory((byte)1); // uid 19220, Yun Feng Class
        setSpecific((byte)3); // uid 19223, 1303 Yung Nieng
    }
}
