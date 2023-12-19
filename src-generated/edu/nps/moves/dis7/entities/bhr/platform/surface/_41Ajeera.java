/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bhr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_41Ajeera</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_41Ajeera.createInstance()</code> or <code>new _41Ajeera()</code>. </p>
 * <ul>
 *     <li> Country: Bahrain (BHR) = <code>16</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SupportShip  = <code>1</code>; </li>
 *     <li> Specific: _41Ajeera  = <code>1</code>; </li>
 *     <li> Entity type uid: 18683; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a41eaa2. </p>
 * @see Country#BAHRAIN_BHR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class _41Ajeera extends EntityType
{
    /** Default constructor */
    public _41Ajeera()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18681, Auxiliary
        setSubCategory((byte)1); // uid 18682, Support Ship
        setSpecific((byte)1); // uid 18683, 41 Ajeera
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _41Ajeera createInstance()
    {
            return new _41Ajeera();
    }
}
