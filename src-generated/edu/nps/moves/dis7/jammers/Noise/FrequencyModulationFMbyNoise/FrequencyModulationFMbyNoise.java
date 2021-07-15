package edu.nps.moves.dis7.jammers.Noise.FrequencyModulationFMbyNoise;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * Jamming technique uid: 284
 */
public class FrequencyModulationFMbyNoise extends JammingTechnique
{
    /** Default constructor */
    public FrequencyModulationFMbyNoise()
    {
        setKind((byte)1); // Noise
        setCategory((byte)35); // Frequency Modulation (FM) by Noise
    }
}
