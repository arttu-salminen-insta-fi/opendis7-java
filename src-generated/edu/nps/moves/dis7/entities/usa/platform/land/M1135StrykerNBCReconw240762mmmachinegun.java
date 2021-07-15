package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@70c69586;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10147
 */
public class M1135StrykerNBCReconw240762mmmachinegun extends EntityType
{
    /** Default constructor */
    public M1135StrykerNBCReconw240762mmmachinegun()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 10115, Light Armored Vehicle (LAV) Stryker
        setSpecific((byte)32); // uid 10147, M1135 Stryker NBC Recon w/240 7.62-mm machine gun
    }
}
