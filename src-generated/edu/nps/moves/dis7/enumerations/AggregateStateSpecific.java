package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 209 marshal size 8<br>
 * AggregateStateSpecific
 */
public enum AggregateStateSpecific 
{
    /** No headquarters */
    NO_HEADQUARTERS (0, "No headquarters"),
    /** Yes aggregate unit contains a headquarters */
    YES_AGGREGATE_UNIT_CONTAINS_A_HEADQUARTERS (1, "Yes aggregate unit contains a headquarters");

    private int value;
    private final String description;

    AggregateStateSpecific(int value, String description)
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

    public static AggregateStateSpecific getEnumForValue(int i)
    {
       for(AggregateStateSpecific val: AggregateStateSpecific.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AggregateStateSpecific");
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

    public static AggregateStateSpecific unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static AggregateStateSpecific unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "AggregateStateSpecific: " + name() + ": " + getValue(); 
    }
}
