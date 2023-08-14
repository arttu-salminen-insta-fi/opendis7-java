/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Shahab3Mod3BSeparatedWarhead</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Shahab3Mod3BSeparatedWarhead.createInstance()</code> or <code>new Shahab3Mod3BSeparatedWarhead()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>TACTICAL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Shahab3Mod3B  = <code>55</code>; </li>
 *     <li> Specific: Shahab3Mod3BSeparatedWarhead  = <code>2</code>; </li>
 *     <li> Entity type uid: 32482; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ef1c3f7. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Shahab3Mod3BSeparatedWarhead extends EntityType
{
    /** Default constructor */
    public Shahab3Mod3BSeparatedWarhead()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32473, Guided
        setSubCategory((byte)55); // uid 32481, Shahab 3 Mod-3B
        setSpecific((byte)2); // uid 32482, Shahab 3 Mod-3B Separated Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Shahab3Mod3BSeparatedWarhead createInstance()
    {
            return new Shahab3Mod3BSeparatedWarhead();
    }
}
