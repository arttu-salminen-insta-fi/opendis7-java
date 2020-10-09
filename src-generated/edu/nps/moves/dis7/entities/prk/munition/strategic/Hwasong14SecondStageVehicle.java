package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b28a7bf
 * Country: Korea (Democratic Peoples Republic of) (PRK)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 32851
 */
public class Hwasong14SecondStageVehicle extends EntityType
{
    public Hwasong14SecondStageVehicle()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)132); // uid 32850, Hwasong 14
        setSpecific((byte)1); // uid 32851, Hwasong 14 Second Stage Vehicle
    }
}