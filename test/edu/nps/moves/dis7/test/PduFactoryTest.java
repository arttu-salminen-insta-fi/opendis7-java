/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */
package edu.nps.moves.dis7.test;

import edu.nps.moves.dis7.enumerations.Country;
import edu.nps.moves.dis7.utilities.DisTime;
import edu.nps.moves.dis7.utilities.PduFactory;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Unit tests for satisfactory factory creation of each PDU class.
 * 
 * @author Mike Bailey, jmbailey@edu.nps.edu
 * @version $Id$
 */
@DisplayName("Pdu Factory Test")
public class PduFactoryTest
{
    /** default constructor */
    public PduFactoryTest()
    {
        // initialization code here
    }
    /** actions to perform before all tests */
    @BeforeAll
    public static void beforeAllTests()
    {
      System.out.println("PduFactoryTest");
    }

    /** actions to perform after all tests */
    @AfterAll
    public static void afterAllTests()
    {
    }

    /** initialization */
    @BeforeEach
    public void setUp()
    {
    }

    /** close open objects */
    @AfterEach
    public void tearDown()
    {
    }

    /** Test creation of all PDU types */
    @Test
    public void testCreateAllPdus()
    {
        Throwable ex = null;
        try {
            //Arrays.stream(PduFactory.class.getDeclaredMethods()).forEach(m->System.out.println(m.getName()));
            PduFactory fact = new PduFactory(Country.PHILIPPINES_PHL, (byte) 11, (byte) 22, (short) 33, DisTime.TimestampStyle.IEEE_ABSOLUTE);

            fact.makeAcknowledgePdu();
            fact.makeAcknowledgeReliablePdu();
            fact.makeActionRequestPdu();
            fact.makeActionRequestReliablePdu();
            fact.makeActionResponsePdu();
            fact.makeActionResponseReliablePdu();
            fact.makeAggregateStatePdu();
            fact.makeAppearancePdu();
            fact.makeArealObjectStatePdu();
            fact.makeArticulatedPartsPdu();
            fact.makeAttributePdu();
            fact.makeCollisionElasticPdu();
            fact.makeCollisionPdu();
            fact.makeCommentPdu();
            fact.makeCommentReliablePdu();
            fact.makeCreateEntityPdu();
            fact.makeCreateEntityReliablePdu();
            fact.makeDataPdu();
            fact.makeDataQueryPdu();
            fact.makeDataQueryReliablePdu();
            fact.makeDataReliablePdu();
            fact.makeDesignatorPdu();
            fact.makeDetonationPdu();
            fact.makeDirectedEnergyFirePdu();
            fact.makeElectronicEmissionsPdu();
            fact.makeEntityDamageStatusPdu();
            fact.makeEntityStatePdu();
            fact.makeEntityStateUpdatePdu();
            fact.makeEnvironmentalProcessPdu();
            fact.makeEventReportPdu();
            fact.makeEventReportReliablePdu();
            fact.makeFirePdu();
            fact.makeGriddedDataPdu();
            fact.makeIffPdu();
            fact.makeInformationOperationsReportPdu();
            fact.makeInformationOperationsActionPdu();
            fact.makeIntercomControlPdu();
            fact.makeIntercomSignalPdu();
            fact.makeIsGroupOfPdu();
            fact.makeIsPartOfPdu();
            fact.makeLEDetonationPdu();
            fact.makeLEFirePdu();
            fact.makeLinearObjectStatePdu();
            fact.makeMinefieldDataPdu();
            fact.makeMinefieldQueryPdu();
            fact.makeMinefieldResponseNackPdu();
            fact.makeMinefieldStatePdu();
            fact.makePointObjectStatePdu();
            fact.makeReceiverPdu();
            fact.makeRecordQueryReliablePdu();
            fact.makeRecordReliablePdu();
            fact.makeRemoveEntityPdu();
            fact.makeRemoveEntityReliablePdu();
            fact.makeRepairCompletePdu();
            fact.makeRepairResponsePdu();
            fact.makeResupplyCancelPdu();
            fact.makeResupplyOfferPdu();
            fact.makeResupplyReceivedPdu();
            fact.makeSeesPdu();
            fact.makeServiceRequestPdu();
            fact.makeSetDataPdu();
            fact.makeSetDataReliablePdu();
            fact.makeSetRecordReliablePdu();
            fact.makeSignalPdu();
            fact.makeStartResumePdu();
            fact.makeStartResumeReliablePdu();
            fact.makeStopFreezePdu();
            fact.makeStopFreezeReliablePdu();
            fact.makeTransferOwnershipPdu();
            fact.makeTransmitterPdu();
            fact.makeTspiPdu();
            fact.makeUnderwaterAcousticPdu(); 
        }
        catch (Throwable t) {
            ex = t;
            System.err.println(t.getLocalizedMessage());
            t.printStackTrace(System.err);
        }

        assertNull(ex, "Exception should be null if successful creation of all objects");
    }
    
    /**
     * Main method provides support for testing.
     * @see <a href="https://docs.oracle.com/javase/tutorial/getStarted/application/index.html">Java Tutorials: A Closer Look at the "Hello World!" Application</a>
     * @param args [address, port, descriptor] command-line arguments are an array of optional String parameters that are passed from execution environment during invocation
     */
    public static void main(String[] args)
  {
    new PduFactoryTest().testCreateAllPdus();
  }

}
