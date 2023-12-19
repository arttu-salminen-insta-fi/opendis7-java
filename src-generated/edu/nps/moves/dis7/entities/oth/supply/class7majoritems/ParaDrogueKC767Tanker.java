/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ParaDrogueKC767Tanker</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ParaDrogueKC767Tanker.createInstance()</code> or <code>new ParaDrogueKC767Tanker()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_7_MAJOR_ITEMS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Para-Drogue = <code>24</code>; </li>
 *     <li> SubCategory: ParaDrogueKC767Tanker  = <code>2</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 30771; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@fbe8fd3. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see ParaDrogue
 * @see SubCategory

 */
public final class ParaDrogueKC767Tanker extends EntityType
{
    /** Default constructor */
    public ParaDrogueKC767Tanker()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)24); // uid 30769, Para-Drogue
        setSubCategory((byte)2); // uid 30771, Para-Drogue KC-767 Tanker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ParaDrogueKC767Tanker createInstance()
    {
            return new ParaDrogueKC767Tanker();
    }
}
