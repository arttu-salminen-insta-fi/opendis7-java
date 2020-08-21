package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.MOUTBuilding.MOUTBuilding_School;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * ObjectType uid: 226
 */
public class MOUTBuilding_School extends ObjectType
{
    public MOUTBuilding_School()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)7); // MOUT Building
        setSubCategory((byte)13); // MOUT Building, School
    }
}
