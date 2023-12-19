/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A577SokulluMehmetPasa</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A577SokulluMehmetPasa.createInstance()</code> or <code>new A577SokulluMehmetPasa()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: MoselClassType402FastMinesweeperTender  = <code>2</code>; </li>
 *     <li> Specific: A577SokulluMehmetPasa  = <code>1</code>; </li>
 *     <li> Entity type uid: 27482; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@109f8c7e. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A577SokulluMehmetPasa extends EntityType
{
    /** Default constructor */
    public A577SokulluMehmetPasa()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27478, Auxiliary
        setSubCategory((byte)2); // uid 27481, Mosel Class (Type 402 Fast Minesweeper Tender)
        setSpecific((byte)1); // uid 27482, A-577 Sokullu Mehmet Pasa
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A577SokulluMehmetPasa createInstance()
    {
            return new A577SokulluMehmetPasa();
    }
}
