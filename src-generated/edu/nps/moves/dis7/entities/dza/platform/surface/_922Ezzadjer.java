// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_922Ezzadjer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_922Ezzadjer.createInstance()</code> or <code>new _922Ezzadjer()</code>. </p>
 * <ul>
 *     <li> Country: Algeria (DZA) = <code>3</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: AdhaferClass  = <code>4</code>; </li>
 *     <li> Specific: _922Ezzadjer  = <code>3</code>; </li>
 *     <li> Entity type uid: 34480; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@73a8dfcc. </p>
 * @see Country#ALGERIA_DZA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _922Ezzadjer extends EntityType
{
    /** Default constructor */
    public _922Ezzadjer()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27048, Guided Missile Frigate (FFG)
        setSubCategory((byte)4); // uid 34477, Adhafer Class
        setSpecific((byte)3); // uid 34480, 922 Ezzadjer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _922Ezzadjer createInstance()
    {
            return new _922Ezzadjer();
    }
}