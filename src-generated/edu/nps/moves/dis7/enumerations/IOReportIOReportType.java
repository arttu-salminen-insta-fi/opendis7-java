package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 289 marshal size 8<br>
 * IOReportIOReportType
 */
public enum IOReportIOReportType 
{
    /** No Statement */
    NO_STATEMENT (0, "No Statement"),
    /** Initial Report */
    INITIAL_REPORT (1, "Initial Report"),
    /** Update Report */
    UPDATE_REPORT (2, "Update Report"),
    /** Final Report */
    FINAL_REPORT (3, "Final Report");

    private int value;
    private final String description;

    IOReportIOReportType(int value, String description)
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

    public static IOReportIOReportType getEnumForValue(int i)
    {
       for(IOReportIOReportType val: IOReportIOReportType.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration IOReportIOReportType");
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

    public static IOReportIOReportType unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static IOReportIOReportType unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "IOReportIOReportType: " + name() + ": " + getValue(); 
    }
}
