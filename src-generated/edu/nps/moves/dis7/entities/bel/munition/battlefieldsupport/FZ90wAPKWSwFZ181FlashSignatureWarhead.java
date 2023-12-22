/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FZ90wAPKWSwFZ181FlashSignatureWarhead</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FZ90wAPKWSwFZ181FlashSignatureWarhead.createInstance()</code> or <code>new FZ90wAPKWSwFZ181FlashSignatureWarhead()</code>. </p>
 * <ul>
 *     <li> Country: Belgium (BEL) = <code>21</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: FZFZ90WA70mm275inwAPKWS  = <code>3</code>; </li>
 *     <li> Specific: FZ90wAPKWSwFZ181FlashSignatureWarhead  = <code>3</code>; </li>
 *     <li> Entity type uid: 30327; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b1252c8. </p>
 * @see Country#BELGIUM_BEL
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class FZ90wAPKWSwFZ181FlashSignatureWarhead extends EntityType
{
    /** Default constructor */
    public FZ90wAPKWSwFZ181FlashSignatureWarhead()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 30309, Guided
        setSubCategory((byte)3); // uid 30324, FZ FZ90 WA (70 mm, 2.75 in) w/APKWS
        setSpecific((byte)3); // uid 30327, FZ90 w/APKWS w/ FZ181 Flash Signature Warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FZ90wAPKWSwFZ181FlashSignatureWarhead createInstance()
    {
            return new FZ90wAPKWSwFZ181FlashSignatureWarhead();
    }
}
