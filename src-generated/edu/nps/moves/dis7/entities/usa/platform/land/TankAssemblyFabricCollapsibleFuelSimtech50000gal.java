/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TankAssemblyFabricCollapsibleFuelSimtech50000gal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TankAssemblyFabricCollapsibleFuelSimtech50000gal.createInstance()</code> or <code>new TankAssemblyFabricCollapsibleFuelSimtech50000gal()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Engineer Equipment = <code>18</code>; </li>
 *     <li> SubCategory: TankAssemblyFabricCollapsibleFuelSimtech  = <code>22</code>; </li>
 *     <li> Specific: TankAssemblyFabricCollapsibleFuelSimtech50000gal  = <code>3</code>; </li>
 *     <li> Entity type uid: 34974; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@355ce6a6. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see EngineerEquipment
 * @see SubCategory

 */
public final class TankAssemblyFabricCollapsibleFuelSimtech50000gal extends EntityType
{
    /** Default constructor */
    public TankAssemblyFabricCollapsibleFuelSimtech50000gal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)22); // uid 34971, Tank Assembly Fabric Collapsible, Fuel, Simtech
        setSpecific((byte)3); // uid 34974, Tank Assembly Fabric Collapsible, Fuel, Simtech, 50000 gal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TankAssemblyFabricCollapsibleFuelSimtech50000gal createInstance()
    {
            return new TankAssemblyFabricCollapsibleFuelSimtech50000gal();
    }
}
