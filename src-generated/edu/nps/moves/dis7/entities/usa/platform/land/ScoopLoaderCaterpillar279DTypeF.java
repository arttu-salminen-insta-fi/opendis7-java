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
 * <p> Entity class <b><code>ScoopLoaderCaterpillar279DTypeF</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ScoopLoaderCaterpillar279DTypeF.createInstance()</code> or <code>new ScoopLoaderCaterpillar279DTypeF()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Engineer Equipment = <code>18</code>; </li>
 *     <li> SubCategory: ScoopLoaderTypeDED4x4  = <code>6</code>; </li>
 *     <li> Specific: ScoopLoaderCaterpillar279DTypeF  = <code>5</code>; </li>
 *     <li> Entity type uid: 33509; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f79f192. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see EngineerEquipment
 * @see SubCategory

 */
public final class ScoopLoaderCaterpillar279DTypeF extends EntityType
{
    /** Default constructor */
    public ScoopLoaderCaterpillar279DTypeF()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)6); // uid 22978, Scoop Loader, Type DED, 4x4
        setSpecific((byte)5); // uid 33509, Scoop Loader, Caterpillar 279D Type F
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ScoopLoaderCaterpillar279DTypeF createInstance()
    {
            return new ScoopLoaderCaterpillar279DTypeF();
    }
}
