/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA12BGiant9M82</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA12BGiant9M82.createInstance()</code> or <code>new SA12BGiant9M82()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: SA12GladiatorGiant  = <code>24</code>; </li>
 *     <li> Specific: SA12BGiant9M82  = <code>3</code>; </li>
 *     <li> Entity type uid: 20368; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30dd00b6. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class SA12BGiant9M82 extends EntityType
{
    /** Default constructor */
    public SA12BGiant9M82()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)24); // uid 20365, SA-12 Gladiator/Giant
        setSpecific((byte)3); // uid 20368, SA-12B Giant (9M82)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA12BGiant9M82 createInstance()
    {
            return new SA12BGiant9M82();
    }
}
