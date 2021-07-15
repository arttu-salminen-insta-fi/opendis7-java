package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@72ea6193;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28488
 */
public class A109EPowerElite extends EntityType
{
    /** Default constructor */
    public A109EPowerElite()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 18315, Utility Helicopter
        setSubCategory((byte)5); // uid 18320, Agusta Westland AW109
        setSpecific((byte)2); // uid 28488, A109E Power Elite
    }
}
