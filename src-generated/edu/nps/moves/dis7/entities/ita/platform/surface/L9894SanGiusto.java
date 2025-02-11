/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L9894SanGiusto</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L9894SanGiusto.createInstance()</code> or <code>new L9894SanGiusto()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: SanGiorgioClassLPDs  = <code>1</code>; </li>
 *     <li> Specific: L9894SanGiusto  = <code>3</code>; </li>
 *     <li> Entity type uid: 18639; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28f8e165. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class L9894SanGiusto extends EntityType
{
    /** Default constructor */
    public L9894SanGiusto()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 18635, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 18636, San Giorgio Class (LPDs)
        setSpecific((byte)3); // uid 18639, L9894 San Giusto
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L9894SanGiusto createInstance()
    {
            return new L9894SanGiusto();
    }
}
