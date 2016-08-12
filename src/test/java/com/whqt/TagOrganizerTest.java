package com.whqt;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergy
 */
public class TagOrganizerTest {
    
    public TagOrganizerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findTop method, of class TagOrganizer.
     * @throws java.lang.Exception
     */
    @Test
    public void testFindTop() throws Exception {
        System.out.println("findTop:");
        String fileName = "D:\\Sergy\\work\\WHTQ\\WalletHubTestQuestions\\src\\test\\resources\\test.txt";
        
        String expResultB20=" bigest20 ";
        String expResultB15=" bigest15 ";
        String expResultM12=" medium12 ";
        String expResultS8=" small8 ";
        String expResultS4=" small4 ";
        
        Multiset<String> result = TagOrganizer.findTop(fileName);
        System.out.println(result.toString());
        
        Iterator<Multiset.Entry<String>> iterator = result.entrySet().iterator();
        assertTrue( "non-empty multiset.entrySet() iterator.hasNext() returned false", iterator.hasNext());
        
        String nextB20 = iterator.next().getElement();
        assertEquals("incorrect entry! expected: "+expResultB20+" but was: "+nextB20, expResultB20, nextB20);
        
        String nextB15 = iterator.next().getElement();
        assertEquals("incorrect entry! expected: "+expResultB15+" but was: "+nextB15, expResultB15, nextB15);
        
        String nextM12 = iterator.next().getElement();
        assertEquals("incorrect entry! expected: "+expResultM12+" but was: "+nextM12, expResultM12, nextM12);
        
        String nextS8 = iterator.next().getElement();
        assertEquals("incorrect entry! expected: "+expResultS8+" but was: "+nextS8, expResultS8, nextS8);
        
        String nextS4 = iterator.next().getElement();
        assertEquals("incorrect entry! expected: "+expResultS4+" but was: "+nextS4, expResultS4, nextS4);
    }    
}
