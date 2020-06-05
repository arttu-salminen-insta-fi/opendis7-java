package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 303 marshal size 1<br>
 * DIS-PDU Status-Coupled Extension Indicator (CEI)
 */
public enum DISPDUStatusCoupledExtensionIndicatorCEI 
{
    /** Not Coupled */
    NOT_COUPLED (0, "Not Coupled"),
    /** Coupled */
    COUPLED (1, "Coupled");

    private int value;
    private final String description;

    DISPDUStatusCoupledExtensionIndicatorCEI(int value, String description)
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

    public static DISPDUStatusCoupledExtensionIndicatorCEI getEnumForValue(int i)
    {
       for(DISPDUStatusCoupledExtensionIndicatorCEI val: DISPDUStatusCoupledExtensionIndicatorCEI.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration DISPDUStatusCoupledExtensionIndicatorCEI");
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

    public static DISPDUStatusCoupledExtensionIndicatorCEI unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    public static DISPDUStatusCoupledExtensionIndicatorCEI unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "DISPDUStatusCoupledExtensionIndicatorCEI: " + name() + ": " + getValue(); 
    }
}
