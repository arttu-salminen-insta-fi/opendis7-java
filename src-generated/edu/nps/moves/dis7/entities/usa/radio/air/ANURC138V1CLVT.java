/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANURC138V1CLVT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANURC138V1CLVT.createInstance()</code> or <code>new ANURC138V1CLVT()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Link 16 Terminal = <code>21</code>; </li>
 *     <li> SubCategory: JointElectronicsTypeDesignationSystemJETDSNonspecificSeries  = <code>1</code>; </li>
 *     <li> Specific: ANURC138V1CLVT  = <code>21</code>; </li>
 *     <li> Entity type uid: 26807; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c36051c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Link16Terminal
 * @see SubCategory

 */
public final class ANURC138V1CLVT extends EntityType
{
    /** Default constructor */
    public ANURC138V1CLVT()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 26798, Link 16 Terminal
        setSubCategory((byte)1); // uid 26799, Joint Electronics Type Designation System (JETDS) Non-specific Series
        setSpecific((byte)21); // uid 26807, AN/URC-138(V)1(C) LVT
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANURC138V1CLVT createInstance()
    {
            return new ANURC138V1CLVT();
    }
}
