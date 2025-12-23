package edu.nps.moves.dis7.test;


import edu.nps.moves.dis7.enumerations.IFFSystemType;
import edu.nps.moves.dis7.pdus.*;
import org.junit.jupiter.api.*;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/**
 * Test class to observe the PduMap representation of PDUs
 */
public class PduMapTest {

    @Test
    public void EntityStatePdu() throws Exception {
        EntityStatePdu pdu = new EntityStatePdu();
        PduMap map = EntityStatePdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(EntityStatePdu.getMarshalledSize(map));
        EntityStatePdu.fromMapToBuffer(map, b);
        b.rewind();
        pdu.unmarshal(b);
        System.out.println(pdu);
    }

    @Test
    public void DetonationPdu() throws Exception {
        DetonationPdu pdu = new DetonationPdu();
        PduMap map = DetonationPdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(DetonationPdu.getMarshalledSize(map));
        DetonationPdu.fromMapToBuffer(map, b);
        b.rewind();
        pdu.unmarshal(b);
        System.out.println(pdu);
    }

    @Test
    public void DetonationPduWithMunitionDescriptor() throws Exception {
        DetonationPdu pdu = new DetonationPdu();
        PduMap map = DetonationPdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(DetonationPdu.getMarshalledSize(map));
        DetonationPdu.fromMapToBuffer(map, b);
        b.rewind();
        // If we overwrite the descpritor to be MunitionDescriptor instance, unmarshalling & marshalling is done using that specific descriptor
        pdu.setDescriptor(new Descriptor());
        pdu.unmarshal(b);
        System.out.println(pdu);
    }

    @Test
    public void IFFPdu() throws Exception {
        IFFPdu pdu = new IFFPdu();
        pdu.setIFFPduLayer3TransponderFormatData(new IFFPduLayer3TransponderFormatData());
        pdu.getFundamentalParameters().setInformationLayers(1 << 3);
        pdu.getSystemID().setSystemType(IFFSystemType.MODE_5_TRANSPONDER);
        PduMap map = IFFPdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(IFFPdu.getMarshalledSize(map));
        IFFPdu.fromMapToBuffer(map, b);
        b.rewind();
        pdu.unmarshal(b);
        System.out.println(pdu);
    }

    @Test
    public void SignalPdu() throws Exception {
        SignalPdu pdu = new SignalPdu();
        PduMap map = SignalPdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(SignalPdu.getMarshalledSize(map));
        SignalPdu.fromMapToBuffer(map, b);
        b.rewind();
        pdu.unmarshal(b);
        System.out.println(pdu);
    }

    @Test
    public void SetDataPdu() throws Exception {
        SetDataPdu pdu = new SetDataPdu();
        PduMap map = SetDataPdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(SetDataPdu.getMarshalledSize(map));
        SetDataPdu.fromMapToBuffer(map, b);
        b.rewind();
        pdu.unmarshal(b);
        System.out.println(pdu);
    }


    @Test
    public void StartResumePdu() throws Exception {
        StartResumePdu pdu = new StartResumePdu();
        PduMap map = StartResumePdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(StartResumePdu.getMarshalledSize(map));
        StartResumePdu.fromMapToBuffer(map, b);
        b.rewind();
        pdu.unmarshal(b);
        System.out.println(pdu);
    }

    @Test
    public void AcknowledgePdu() throws Exception {
        AcknowledgePdu pdu = new AcknowledgePdu();
        PduMap map = AcknowledgePdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(AcknowledgePdu.getMarshalledSize(map));
        AcknowledgePdu.fromMapToBuffer(map, b);
        b.rewind();
        pdu.unmarshal(b);
        System.out.println(pdu);
    }

    @Test
    public void ElectromagneticEmissionPdu() throws Exception {
        ElectromagneticEmissionPdu pdu = new ElectromagneticEmissionPdu();
        ElectronicEmitter emitter = new ElectronicEmitter();
        EmitterBeam emitterBeam = new EmitterBeam();
        TrackJamData trackJamData = new TrackJamData();
        emitterBeam.setTrackJamData(List.of(trackJamData, trackJamData));
        emitter.setBeams(List.of(emitterBeam, emitterBeam));
        pdu.setSystems(List.of(emitter));

        PduMap map = ElectromagneticEmissionPdu.fromBufferToMap(processToBuffer(pdu));
        recursivePrint(0, map);

        ByteBuffer b = ByteBuffer.allocate(ElectromagneticEmissionPdu.getMarshalledSize(map));
        ElectromagneticEmissionPdu.fromMapToBuffer(map, b);
        b.rewind();
        ElectromagneticEmissionPdu pdu2 = new ElectromagneticEmissionPdu();
        pdu2.unmarshal(b);
        System.out.println(pdu);
    }




    // Utils

    private ByteBuffer processToBuffer(Pdu pdu) throws Exception {
        pdu.setLength(pdu.getMarshalledSize());

        ByteBuffer buff = ByteBuffer.allocate(pdu.getLength());
        pdu.marshal(buff);
        return ByteBuffer.wrap(buff.array());
    }

    static void recursivePrint(int level, PduMap map) {
        System.out.println(indent(level) + "{");
        for (Map.Entry e : map.entrySet()) {
            if (e.getValue() instanceof PduMap innerMap) {
                System.out.println(indent(level + 1) + e.getKey());
                recursivePrint(level + 1, innerMap);
            }
            else if (e.getValue() instanceof List list) {
                System.out.println(indent(level + 1) + e.getKey());
                for (Object o : list) {
                    if (o instanceof PduMap listMap)
                        recursivePrint(level + 1, listMap);
                    else
                        System.out.println(indent(level + 1) + o);
                }
            }
            else {
                System.out.println(indent(level + 1) + e.getKey() + " : " + e.getValue());
            }
        }
        System.out.println(indent(level) + "}");
    }

    public static String indent(int count) {
        return new String(new char[count]).replace("\0", "   ");
    }


}
