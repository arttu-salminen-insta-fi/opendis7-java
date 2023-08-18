/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PTs42754V4200litertrailer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PTs42754V4200litertrailer.createInstance()</code> or <code>new PTs42754V4200litertrailer()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fuel trailer = <code>15</code>; </li>
 *     <li> SubCategory: _10015000gallons  = <code>2</code>; </li>
 *     <li> Specific: PTs42754V4200litertrailer  = <code>1</code>; </li>
 *     <li> Entity type uid: 13000; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@385e36d4. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Fueltrailer
 * @see SubCategory

 */
public final class PTs42754V4200litertrailer extends EntityType
{
    /** Default constructor */
    public PTs42754V4200litertrailer()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 12996, Fuel trailer
        setSubCategory((byte)2); // uid 12999, 1001 - 5000 gallons
        setSpecific((byte)1); // uid 13000, PTs-4.2-754V, 4200 liter trailer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PTs42754V4200litertrailer createInstance()
    {
            return new PTs42754V4200litertrailer();
    }
}
