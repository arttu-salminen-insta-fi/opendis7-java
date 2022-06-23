// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Casabianca</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Casabianca.createInstance()</code> or <code>new Casabianca()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires D'attaque (SNA)) = <code>3</code>; </li>
 *     <li> SubCategory: SuffrenClassBarracudaClass  = <code>2</code>; </li>
 *     <li> Specific: Casabianca  = <code>6</code>; </li>
 *     <li> Entity type uid: 34582; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a1a14a4. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA
 * @see SubCategory

 */
public final class Casabianca extends EntityType
{
    /** Default constructor */
    public Casabianca()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 16186, SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires D'attaque (SNA))
        setSubCategory((byte)2); // uid 33223, Suffren Class (Barracuda Class)
        setSpecific((byte)6); // uid 34582, Casabianca
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Casabianca createInstance()
    {
            return new Casabianca();
    }
}