/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JointTerminalAttackController</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JointTerminalAttackController.createInstance()</code> or <code>new JointTerminalAttackController()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: ARSOF = <code>32</code>; </li>
 *     <li> SubCategory: EquipmentNonspecific  = <code>150</code>; </li>
 *     <li> Specific: JointTerminalAttackController  = <code>1</code>; </li>
 *     <li> Entity type uid: 35432; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59c862af. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ARSOF
 * @see SubCategory

 */
public final class JointTerminalAttackController extends EntityType
{
    /** Default constructor */
    public JointTerminalAttackController()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)32); // uid 35430, ARSOF
        setSubCategory((byte)150); // uid 35431, Equipment, Non-specific
        setSpecific((byte)1); // uid 35432, Joint Terminal Attack Controller
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JointTerminalAttackController createInstance()
    {
            return new JointTerminalAttackController();
    }
}
