/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whqt;

import java.util.HashMap;
import java.util.Map;
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
public class KComplementaryTest {
    
    public KComplementaryTest() {
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
     * Test of countComplimentary method, of class KComplementary.
     */
    @Test
    public void testFindComplimentary() {
        System.out.println("FindComplimentary");
        Integer K = 10;
        Integer[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Map<Integer, Integer> expected = new HashMap<>( );
        
        expected.put(0, 8);
        expected.put(1, 7);
        expected.put(2, 6);
        expected.put(3, 5);
        expected.put(5, 3);
        expected.put(6, 2);
        expected.put(7, 1);
        expected.put(8, 0);
        
        Map<Integer, Integer> result = KComplementary.findComplimentary(K, A);
        System.out.println("result array: "+result.toString());
        assertEquals("wrong size! expected: "+expected.size()+" but was: "+result.size(), 
                                                        expected.size(), result.size());
        expected.entrySet().stream().forEach((value) -> {
            Integer actualValue = result.get(value.getKey());
            assertNotNull("actual value is apsent!", actualValue);
            assertEquals("wrong value! expected: "+value.getValue()+"but was: "+actualValue,
                    value.getValue(), actualValue);
        });
    }
    
}
