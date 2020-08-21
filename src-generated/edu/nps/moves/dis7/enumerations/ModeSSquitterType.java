package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 354 marshal size 3<br>
 * ModeSSquitterType
 */
public enum ModeSSquitterType 
{
    /** Not Capable */
    NOT_CAPABLE (0, "Not Capable"),
    /** Acquisition */
    ACQUISITION (1, "Acquisition"),
    /** Extended */
    EXTENDED (2, "Extended"),
    /** Short */
    SHORT (3, "Short");

    private int value;
    private final String description;

    ModeSSquitterType(int value, String description)
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
      return 3;
    }

    public static ModeSSquitterType getEnumForValue(int i)
    {
       for(ModeSSquitterType val: ModeSSquitterType.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration ModeSSquitterType");
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

    public static ModeSSquitterType unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static ModeSSquitterType unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "ModeSSquitterType: " + name() + ": " + getValue(); 
    }
}
