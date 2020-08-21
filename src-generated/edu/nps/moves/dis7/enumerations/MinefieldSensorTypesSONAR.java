package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 199 marshal size 12<br>
 * MinefieldSensorTypesSONAR
 */
public enum MinefieldSensorTypesSONAR 
{
    /** Generic */
    GENERIC (0, "Generic");

    private int value;
    private final String description;

    MinefieldSensorTypesSONAR(int value, String description)
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
      return 12;
    }

    public static MinefieldSensorTypesSONAR getEnumForValue(int i)
    {
       for(MinefieldSensorTypesSONAR val: MinefieldSensorTypesSONAR.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration MinefieldSensorTypesSONAR");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.putShort((short)getValue());
    }

    public static MinefieldSensorTypesSONAR unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    public static MinefieldSensorTypesSONAR unmarshalEnum (ByteBuffer buff) throws Exception
    {
        return getEnumForValue(buff.getShort());
    }   

    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
    @Override
    public String toString()
    {
        return "MinefieldSensorTypesSONAR: " + name() + ": " + getValue(); 
    }
}
