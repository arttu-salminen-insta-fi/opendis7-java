package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 406 marshal size 1<br>
 * Appearance-Object General-Predistributed
 */
public enum AppearanceObjectGeneralPredistributed 
{
    /** Object Created During the Exercise */
    OBJECT_CREATED_DURING_THE_EXERCISE (0, "Object Created During the Exercise"),
    /** Object Predistributed Prior to Exercise Start */
    OBJECT_PREDISTRIBUTED_PRIOR_TO_EXERCISE_START (1, "Object Predistributed Prior to Exercise Start");

    private int value;
    private final String description;

    AppearanceObjectGeneralPredistributed(int value, String description)
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
      return 1;
    }

    public static AppearanceObjectGeneralPredistributed getEnumForValue(int i)
    {
       for(AppearanceObjectGeneralPredistributed val: AppearanceObjectGeneralPredistributed.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AppearanceObjectGeneralPredistributed");
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

    public static AppearanceObjectGeneralPredistributed unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static AppearanceObjectGeneralPredistributed unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "AppearanceObjectGeneralPredistributed: " + name() + ": " + getValue(); 
    }
}
