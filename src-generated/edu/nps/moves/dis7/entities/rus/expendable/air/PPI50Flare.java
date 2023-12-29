/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PPI50Flare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PPI50Flare.createInstance()</code> or <code>new PPI50Flare()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Flare = <code>2</code>; </li>
 *     <li> SubCategory: _50mmFlare  = <code>2</code>; </li>
 *     <li> Specific: PPI50Flare  = <code>1</code>; </li>
 *     <li> Entity type uid: 35425; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64f6dd19. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flare
 * @see SubCategory

 */
public final class PPI50Flare extends EntityType
{
    /** Default constructor */
    public PPI50Flare()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22301, Flare
        setSubCategory((byte)2); // uid 22305, 50mm Flare
        setSpecific((byte)1); // uid 35425, PPI-50 Flare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PPI50Flare createInstance()
    {
            return new PPI50Flare();
    }
}
