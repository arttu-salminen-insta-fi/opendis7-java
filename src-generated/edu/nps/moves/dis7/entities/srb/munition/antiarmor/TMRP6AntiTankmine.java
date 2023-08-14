/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.srb.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TMRP6AntiTankmine</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TMRP6AntiTankmine.createInstance()</code> or <code>new TMRP6AntiTankmine()</code>. </p>
 * <ul>
 *     <li> Country: Serbia (SRB) = <code>276</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Fixed = <code>3</code>; </li>
 *     <li> SubCategory: TMRP6AntiTankmine  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30182; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3eec8583. </p>
 * @see Country#SERBIA_SRB
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Fixed
 * @see SubCategory

 */
public final class TMRP6AntiTankmine extends EntityType
{
    /** Default constructor */
    public TMRP6AntiTankmine()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)3); // uid 30181, Fixed
        setSubCategory((byte)1); // uid 30182, TMRP-6 Anti-Tank mine
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TMRP6AntiTankmine createInstance()
    {
            return new TMRP6AntiTankmine();
    }
}
