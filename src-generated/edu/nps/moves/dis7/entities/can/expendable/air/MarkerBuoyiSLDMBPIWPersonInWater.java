/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MarkerBuoyiSLDMBPIWPersonInWater</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MarkerBuoyiSLDMBPIWPersonInWater.createInstance()</code> or <code>new MarkerBuoyiSLDMBPIWPersonInWater()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: SAR Buoy = <code>14</code>; </li>
 *     <li> SubCategory: GPS  = <code>1</code>; </li>
 *     <li> Specific: MarkerBuoyiSLDMBPIWPersonInWater  = <code>1</code>; </li>
 *     <li> Entity type uid: 32656; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@57bac3f0. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SARBuoy
 * @see SubCategory

 */
public final class MarkerBuoyiSLDMBPIWPersonInWater extends EntityType
{
    /** Default constructor */
    public MarkerBuoyiSLDMBPIWPersonInWater()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)14); // uid 32654, SAR Buoy
        setSubCategory((byte)1); // uid 32655, GPS
        setSpecific((byte)1); // uid 32656, Marker Buoy iSLDMB PIW (Person In Water)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MarkerBuoyiSLDMBPIWPersonInWater createInstance()
    {
            return new MarkerBuoyiSLDMBPIWPersonInWater();
    }
}
