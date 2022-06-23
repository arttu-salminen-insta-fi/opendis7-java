// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KShMKushetkaB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KShMKushetkaB.createInstance()</code> or <code>new KShMKushetkaB()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: KShMKushetkaB  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 33235; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@52a33c3f. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class KShMKushetkaB extends EntityType
{
    /** Default constructor */
    public KShMKushetkaB()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 33225, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 33235, KShM Kushetka-B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KShMKushetkaB createInstance()
    {
            return new KShMKushetkaB();
    }
}