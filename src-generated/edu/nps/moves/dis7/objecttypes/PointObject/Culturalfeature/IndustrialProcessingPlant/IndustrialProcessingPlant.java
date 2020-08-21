package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.IndustrialProcessingPlant;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * ObjectType uid: 226
 */
public class IndustrialProcessingPlant extends ObjectType
{
    public IndustrialProcessingPlant()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)13); // Industrial Processing Plant
    }
}
