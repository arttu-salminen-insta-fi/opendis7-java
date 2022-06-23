// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BVS10RepairampRecoveryRRV</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BVS10RepairampRecoveryRRV.createInstance()</code> or <code>new BVS10RepairampRecoveryRRV()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Tracked Utility Vehicle = <code>9</code>; </li>
 *     <li> SubCategory: AllTerrainVehicleProtectedATVPVikingBvS10  = <code>4</code>; </li>
 *     <li> Specific: BVS10Repairamp_RecoveryRRV  = <code>3</code>; </li>
 *     <li> Entity type uid: 27661; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e11ecfa. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeTrackedUtilityVehicle
 * @see SubCategory

 */
public final class BVS10RepairampRecoveryRRV extends EntityType
{
    /** Default constructor */
    public BVS10RepairampRecoveryRRV()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 27646, Large Tracked Utility Vehicle
        setSubCategory((byte)4); // uid 27658, All Terrain Vehicle (Protected) / ATV(P) / Viking / BvS 10
        setSpecific((byte)3); // uid 27661, BV-S10 Repair &amp; Recovery (RRV)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BVS10RepairampRecoveryRRV createInstance()
    {
            return new BVS10RepairampRecoveryRRV();
    }
}