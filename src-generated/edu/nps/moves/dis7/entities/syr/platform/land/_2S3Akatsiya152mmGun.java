/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.syr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_2S3Akatsiya152mmGun</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_2S3Akatsiya152mmGun.createInstance()</code> or <code>new _2S3Akatsiya152mmGun()</code>. </p>
 * <ul>
 *     <li> Country: Syrian Arab Republic (SYR) = <code>207</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: _2S3Akatsiya152mmGun  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31704; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e236278. </p>
 * @see Country#SYRIAN_ARAB_REPUBLIC_SYR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class _2S3Akatsiya152mmGun extends EntityType
{
    /** Default constructor */
    public _2S3Akatsiya152mmGun()
    {
        setCountry(Country.SYRIAN_ARAB_REPUBLIC_SYR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 31702, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 31704, 2S3 Akatsiya 152-mm Gun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _2S3Akatsiya152mmGun createInstance()
    {
            return new _2S3Akatsiya152mmGun();
    }
}
