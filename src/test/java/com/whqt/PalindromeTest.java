package com.whqt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergy Nazarevich
 */
public class PalindromeTest {
    
    public PalindromeTest() {
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
     * Test of isPalindrome method, of class Palindrome.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome:");
        String testStringExpPass1 = "121";
        String testStringExpPass2 = "1221";
        String testStringExpPass3 = "12321";
        
        String testStringExpFail1 = "1";
        String testStringExpFail2 = "12";
        String testStringExpFail3 = "123";
        
        System.out.println("...doing test of true palindrome...");
        boolean resultP1 = Palindrome.isPalindrome(testStringExpPass1);
        assertTrue("exepted pass, but fail with string: "+testStringExpPass1, resultP1);
        boolean resultP2 = Palindrome.isPalindrome(testStringExpPass2);
        assertTrue("exepted pass, but fail with string: "+testStringExpPass2, resultP2);
        boolean resultP3 = Palindrome.isPalindrome(testStringExpPass3);
        assertTrue("exepted pass, but fail with string: "+testStringExpPass3, resultP3);
        
        System.out.println("...doing test of false palindrome...");
        boolean resultF1 = Palindrome.isPalindrome(testStringExpFail1);
        assertFalse("exepted fail, but pass with string: "+testStringExpFail1, resultF1);
        boolean resultF2 = Palindrome.isPalindrome(testStringExpFail2);
        assertFalse("exepted fail, but pass with string: "+testStringExpFail2, resultF2);
        boolean resultF3 = Palindrome.isPalindrome(testStringExpFail3);
        assertFalse("exepted fail, but pass with string: "+testStringExpFail3, resultF3);
    }
    
}
