/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NarcoSubmarine18mBigfoot2</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NarcoSubmarine18mBigfoot2.createInstance()</code> or <code>new NarcoSubmarine18mBigfoot2()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Semi-Submersible Boats = <code>82</code>; </li>
 *     <li> SubCategory: GenericNarcoSubmarine  = <code>1</code>; </li>
 *     <li> Specific: NarcoSubmarine18mBigfoot2  = <code>1</code>; </li>
 *     <li> Entity type uid: 29697; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4c27d39d. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SemiSubmersibleBoats
 * @see SubCategory

 */
public final class NarcoSubmarine18mBigfoot2 extends EntityType
{
    /** Default constructor */
    public NarcoSubmarine18mBigfoot2()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)82); // uid 29695, Semi-Submersible Boats
        setSubCategory((byte)1); // uid 29696, Generic Narco-Submarine
        setSpecific((byte)1); // uid 29697, Narco-Submarine, 18m, Bigfoot-2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NarcoSubmarine18mBigfoot2 createInstance()
    {
            return new NarcoSubmarine18mBigfoot2();
    }
}
