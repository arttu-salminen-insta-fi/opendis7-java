package edu.nps.moves.dis7.objectTypes.PointObject.Passageway.RibbonBridge;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 *
 * ObjectType uid: 226
 */
public class _4Lane extends ObjectType
{
    public _4Lane()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(4)); // Passageway
        setCategory((byte)3); // Ribbon Bridge
        setSubCategory((byte)2); // 4-Lane
    }
}