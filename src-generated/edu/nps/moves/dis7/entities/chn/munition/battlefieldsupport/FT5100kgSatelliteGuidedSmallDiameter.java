/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FT5100kgSatelliteGuidedSmallDiameter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FT5100kgSatelliteGuidedSmallDiameter.createInstance()</code> or <code>new FT5100kgSatelliteGuidedSmallDiameter()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: FTPrecisionGuidedBombPGB  = <code>21</code>; </li>
 *     <li> Specific: FT5100kgSatelliteGuidedSmallDiameter  = <code>5</code>; </li>
 *     <li> Entity type uid: 35776; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23396fc0. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class FT5100kgSatelliteGuidedSmallDiameter extends EntityType
{
    /** Default constructor */
    public FT5100kgSatelliteGuidedSmallDiameter()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 21448, Guided
        setSubCategory((byte)21); // uid 35771, FT Precision Guided Bomb (PGB)
        setSpecific((byte)5); // uid 35776, FT-5 100kg, Satellite Guided, Small Diameter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FT5100kgSatelliteGuidedSmallDiameter createInstance()
    {
            return new FT5100kgSatelliteGuidedSmallDiameter();
    }
}
