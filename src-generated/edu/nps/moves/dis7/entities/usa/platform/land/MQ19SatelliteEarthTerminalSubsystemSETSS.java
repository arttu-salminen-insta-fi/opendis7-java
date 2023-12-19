/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MQ19SatelliteEarthTerminalSubsystemSETSS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MQ19SatelliteEarthTerminalSubsystemSETSS.createInstance()</code> or <code>new MQ19SatelliteEarthTerminalSubsystemSETSS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Communications Facility = <code>33</code>; </li>
 *     <li> SubCategory: MQ19C2DataLinkTerminal  = <code>5</code>; </li>
 *     <li> Specific: MQ19SatelliteEarthTerminalSubsystemSETSS  = <code>5</code>; </li>
 *     <li> Entity type uid: 30192; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@498c535d. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommunicationsFacility
 * @see SubCategory

 */
public final class MQ19SatelliteEarthTerminalSubsystemSETSS extends EntityType
{
    /** Default constructor */
    public MQ19SatelliteEarthTerminalSubsystemSETSS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)5); // uid 30187, MQ-1/9 C2 Data Link Terminal
        setSpecific((byte)5); // uid 30192, MQ-1/9 Satellite Earth Terminal Subsystem (SETSS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MQ19SatelliteEarthTerminalSubsystemSETSS createInstance()
    {
            return new MQ19SatelliteEarthTerminalSubsystemSETSS();
    }
}
