package edu.nps.moves.dis7.objecttypes.PointObject.Passageway.RibbonBridge;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * ObjectType uid: 226
 */
public class RibbonBridge extends ObjectType
{
    public RibbonBridge()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(4)); // Passageway
        setCategory((byte)3); // Ribbon Bridge
    }
}
