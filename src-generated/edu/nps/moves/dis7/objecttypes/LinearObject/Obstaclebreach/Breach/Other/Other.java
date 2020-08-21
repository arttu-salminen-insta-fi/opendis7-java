package edu.nps.moves.dis7.objecttypes.LinearObject.Obstaclebreach.Breach.Other;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * ObjectType uid: 227
 */
public class Other extends ObjectType
{
    public Other()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(7)); // Obstacle breach
        setCategory((byte)1); // Breach
        setSubCategory((byte)0); // Other
    }
}
