/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BlockLoadw25mStrop</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BlockLoadw25mStrop.createInstance()</code> or <code>new BlockLoadw25mStrop()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Concrete Block = <code>12</code>; </li>
 *     <li> SubCategory: BlockLoadw25mStrop  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32663; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@c87787d. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadConcreteBlock
 * @see SubCategory

 */
public final class BlockLoadw25mStrop extends EntityType
{
    /** Default constructor */
    public BlockLoadw25mStrop()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)12); // uid 32661, Sling Load, Concrete Block
        setSubCategory((byte)2); // uid 32663, Block Load w/ 2.5m Strop
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BlockLoadw25mStrop createInstance()
    {
            return new BlockLoadw25mStrop();
    }
}
