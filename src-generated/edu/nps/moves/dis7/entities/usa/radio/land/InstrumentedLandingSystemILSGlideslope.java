/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>InstrumentedLandingSystemILSGlideslope</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>InstrumentedLandingSystemILSGlideslope.createInstance()</code> or <code>new InstrumentedLandingSystemILSGlideslope()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Instrumented Landing System (ILS) Glideslope = <code>4</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22204; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6f9a3325. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see InstrumentedLandingSystemILSGlideslope

 */
public final class InstrumentedLandingSystemILSGlideslope extends EntityType
{
    /** Default constructor */
    public InstrumentedLandingSystemILSGlideslope()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 22204, Instrumented Landing System (ILS) Glideslope
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static InstrumentedLandingSystemILSGlideslope createInstance()
    {
            return new InstrumentedLandingSystemILSGlideslope();
    }
}
