/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whqt;

import java.util.HashMap;
import java.util.List;
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
        Map<Integer, Integer> C = new HashMap<>( );
        
        C.put(A[0], A[8]);
        C.put(A[1], A[7]);
        C.put(A[2], A[6]);
        C.put(A[3], A[5]);
        C.put(A[5], A[3]);
        C.put(A[6], A[2]);
        C.put(A[7], A[1]);
        C.put(A[8], A[0]);
        
        Map<Integer, Integer> result = KComplementary.findComplimentary(K, A);
        assertEquals("wrong result! expected: "+C.toString()+" but was: "+result.toString(), C, result);
    }
    
}
