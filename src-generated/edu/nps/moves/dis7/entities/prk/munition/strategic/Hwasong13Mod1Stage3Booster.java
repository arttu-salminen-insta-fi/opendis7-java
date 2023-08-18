/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Hwasong13Mod1Stage3Booster</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Hwasong13Mod1Stage3Booster.createInstance()</code> or <code>new Hwasong13Mod1Stage3Booster()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic People's Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Hwasong13Mod13stageversion  = <code>50</code>; </li>
 *     <li> Specific: Hwasong13Mod1Stage3Booster  = <code>7</code>; </li>
 *     <li> Entity type uid: 32842; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4cfcac13. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Hwasong13Mod1Stage3Booster extends EntityType
{
    /** Default constructor */
    public Hwasong13Mod1Stage3Booster()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)50); // uid 32836, Hwasong 13 Mod-1 (3-stage version)
        setSpecific((byte)7); // uid 32842, Hwasong 13 Mod-1 Stage 3 Booster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Hwasong13Mod1Stage3Booster createInstance()
    {
            return new Hwasong13Mod1Stage3Booster();
    }
}
