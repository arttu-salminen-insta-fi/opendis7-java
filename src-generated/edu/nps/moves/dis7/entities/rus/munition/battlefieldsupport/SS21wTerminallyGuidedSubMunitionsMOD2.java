package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f4d01b6;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 25051
 */
public class SS21wTerminallyGuidedSubMunitionsMOD2 extends EntityType
{
    /** Default constructor */
    public SS21wTerminallyGuidedSubMunitionsMOD2()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 20760, Guided
        setSubCategory((byte)17); // uid 20781, SS-21 Scarab
        setSpecific((byte)5); // uid 25051, SS-21, w/ Terminally Guided Sub-Munitions, MOD 2
    }
}
