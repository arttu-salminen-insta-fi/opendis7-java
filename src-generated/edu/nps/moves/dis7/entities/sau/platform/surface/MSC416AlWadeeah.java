/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MSC416AlWadeeah</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MSC416AlWadeeah.createInstance()</code> or <code>new MSC416AlWadeeah()</code>. </p>
 * <ul>
 *     <li> Country: Saudi Arabia (SAU) = <code>189</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure/Ship Craft = <code>8</code>; </li>
 *     <li> SubCategory: MSC322Classminesweeperhuntercoastal  = <code>2</code>; </li>
 *     <li> Specific: MSC416AlWadeeah  = <code>3</code>; </li>
 *     <li> Entity type uid: 17887; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17dd671f. </p>
 * @see Country#SAUDI_ARABIA_SAU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class MSC416AlWadeeah extends EntityType
{
    /** Default constructor */
    public MSC416AlWadeeah()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17879, Mine Countermeasure/Ship Craft
        setSubCategory((byte)2); // uid 17884, MSC 322 Class (minesweeper/hunter-coastal)
        setSpecific((byte)3); // uid 17887, MSC 416 Al Wadeeah
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MSC416AlWadeeah createInstance()
    {
            return new MSC416AlWadeeah();
    }
}
