package edu.nps.moves.dis7.objectTypes.PointObject.Obstacle.LogCrib;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class Rectangular extends ObjectType
{
    /** Default constructor */
    public Rectangular()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)2); // Log Crib
        setSubCategory((byte)1); // Rectangular
    }
}
