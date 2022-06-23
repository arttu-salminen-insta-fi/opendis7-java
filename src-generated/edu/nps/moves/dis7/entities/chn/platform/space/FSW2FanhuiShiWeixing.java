// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FSW2FanhuiShiWeixing</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FSW2FanhuiShiWeixing.createInstance()</code> or <code>new FSW2FanhuiShiWeixing()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: OpticalImagingSurveillanceSatellite  = <code>8</code>; </li>
 *     <li> Specific: FSW2FanhuiShiWeixing  = <code>3</code>; </li>
 *     <li> Entity type uid: 34761; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@306e95ec. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class FSW2FanhuiShiWeixing extends EntityType
{
    /** Default constructor */
    public FSW2FanhuiShiWeixing()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 34631, Unmanned
        setSubCategory((byte)8); // uid 34744, Optical Imaging Surveillance Satellite
        setSpecific((byte)3); // uid 34761, FSW-2 (Fanhui Shi Weixing)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FSW2FanhuiShiWeixing createInstance()
    {
            return new FSW2FanhuiShiWeixing();
    }
}