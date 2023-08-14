/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HY1ACSSC2BSilkworm</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HY1ACSSC2BSilkworm.createInstance()</code> or <code>new HY1ACSSC2BSilkworm()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: HY1  = <code>8</code>; </li>
 *     <li> Specific: HY1ACSSC2BSilkworm  = <code>2</code>; </li>
 *     <li> Entity type uid: 21421; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18c7f6b5. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class HY1ACSSC2BSilkworm extends EntityType
{
    /** Default constructor */
    public HY1ACSSC2BSilkworm()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21409, Guided
        setSubCategory((byte)8); // uid 21419, HY-1
        setSpecific((byte)2); // uid 21421, HY-1A/CSSC-2B Silkworm
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HY1ACSSC2BSilkworm createInstance()
    {
            return new HY1ACSSC2BSilkworm();
    }
}
