// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MSVSMilCOTSCargoTruck</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MSVSMilCOTSCargoTruck.createInstance()</code> or <code>new MSVSMilCOTSCargoTruck()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MediumSupportVehicleSystemMilCOTS  = <code>5</code>; </li>
 *     <li> Specific: MSVSMilCOTSCargoTruck  = <code>2</code>; </li>
 *     <li> Entity type uid: 34883; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a187f14. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MSVSMilCOTSCargoTruck extends EntityType
{
    /** Default constructor */
    public MSVSMilCOTSCargoTruck()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 27893, Large Wheeled Utility Vehicle
        setSubCategory((byte)5); // uid 34881, Medium Support Vehicle System MilCOTS
        setSpecific((byte)2); // uid 34883, MSVS MilCOTS Cargo Truck
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MSVSMilCOTSCargoTruck createInstance()
    {
            return new MSVSMilCOTSCargoTruck();
    }
}