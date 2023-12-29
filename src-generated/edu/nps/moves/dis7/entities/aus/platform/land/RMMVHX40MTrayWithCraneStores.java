/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RMMVHX40MTrayWithCraneStores</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RMMVHX40MTrayWithCraneStores.createInstance()</code> or <code>new RMMVHX40MTrayWithCraneStores()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: RMMVHX40M4x4  = <code>1</code>; </li>
 *     <li> Specific: RMMVHX40MTrayWithCrane  = <code>2</code>; </li>
 *     <li> Entity type uid: 29724; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1ff8b8f. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class RMMVHX40MTrayWithCraneStores extends EntityType
{
    /** Default constructor */
    public RMMVHX40MTrayWithCraneStores()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 29716, RMMV HX40M - 4x4
        setSpecific((byte)2); // uid 29722, RMMV HX40M Tray, With Crane
        setExtra((byte)2); // uid 29724, RMMV HX40M Tray, With Crane, Stores
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RMMVHX40MTrayWithCraneStores createInstance()
    {
            return new RMMVHX40MTrayWithCraneStores();
    }
}
