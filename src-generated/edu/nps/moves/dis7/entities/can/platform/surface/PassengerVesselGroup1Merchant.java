package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6121c9d6
 * Country: Canada (CAN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 31620
 */
public class PassengerVesselGroup1Merchant extends EntityType
{
    public PassengerVesselGroup1Merchant()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)80); // uid 31620, Passenger Vessel (Group 1 Merchant)
    }
}