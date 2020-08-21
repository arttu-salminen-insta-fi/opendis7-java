package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.UtilityPole;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * ObjectType uid: 226
 */
public class UtilityPole extends ObjectType
{
    public UtilityPole()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)14); // Utility Pole
    }
}
