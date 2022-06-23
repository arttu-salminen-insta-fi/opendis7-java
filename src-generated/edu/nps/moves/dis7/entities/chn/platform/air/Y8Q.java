// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Y8Q</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Y8Q.createInstance()</code> or <code>new Y8Q()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: ASW/Patrol/Observation = <code>5</code>; </li>
 *     <li> SubCategory: ShaanxiAircraftCompanyY8  = <code>2</code>; </li>
 *     <li> Specific: Y8Q  = <code>3</code>; </li>
 *     <li> Entity type uid: 35159; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c419631. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ASWPatrolObservation
 * @see SubCategory

 */
public final class Y8Q extends EntityType
{
    /** Default constructor */
    public Y8Q()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 24375, ASW/Patrol/Observation
        setSubCategory((byte)2); // uid 24377, Shaanxi Aircraft Company Y-8
        setSpecific((byte)3); // uid 35159, Y-8Q
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Y8Q createInstance()
    {
            return new Y8Q();
    }
}