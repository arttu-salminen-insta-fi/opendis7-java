package edu.nps.moves.dis7.jammers.Noise.RepeaterNoise.NarrowbandRepeaterNoise;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class NarrowbandRepeaterNoise extends JammingTechnique
{
    /** Default constructor */
    public NarrowbandRepeaterNoise()
    {
        setKind((byte)1); // Noise
        setCategory((byte)70); // Repeater Noise
        setSubCategory((byte)5); // Narrowband Repeater Noise
    }
}
