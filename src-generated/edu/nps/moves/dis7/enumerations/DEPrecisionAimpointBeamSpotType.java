package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 311 marshal size 8<br>
 * DEPrecisionAimpointBeamSpotType
 */
public enum DEPrecisionAimpointBeamSpotType 
{
    /** Other */
    OTHER (0, "Other"),
    /** Gaussian */
    GAUSSIAN (1, "Gaussian"),
    /** Top Hat */
    TOP_HAT (2, "Top Hat");

    private int value;
    private final String description;

    DEPrecisionAimpointBeamSpotType(int value, String description)
    {
        this.value = value;
        this.description = description;
    }

    public int getValue()
    {
        return value;
    }

    public String getDescription()
    {
        return description;
    }
    
    public static int getEnumBitWidth()
    {
      return 8;
    }

    public static DEPrecisionAimpointBeamSpotType getEnumForValue(int i)
    {
       for(DEPrecisionAimpointBeamSpotType val: DEPrecisionAimpointBeamSpotType.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration DEPrecisionAimpointBeamSpotType");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.put((byte)getValue());
    }

    public static DEPrecisionAimpointBeamSpotType unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static DEPrecisionAimpointBeamSpotType unmarshalEnum(ByteBuffer buff) throws Exception
    {
        /*
        try {
            value = (int)buff.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue(buff.get());
    }

    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
    @Override
    public String toString()
    {
        return "DEPrecisionAimpointBeamSpotType: " + name() + ": " + getValue(); 
    }
}
