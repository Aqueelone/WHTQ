package com.whqt;


/**
 *
 * @author Sergy Nazarevich
 */
public class Palindrome {
    /**
     * this method return true if string is palindrom
     * @param testString string which we about to test
     * @return boolean -true if it'is palindrome 
     */
    public static boolean isPalindrome(String testString) {
        int len = testString.length();
        if(len < 2) return false;
        
        int counter = 0;
        while(counter < len /2) {
            if(testString.charAt(counter) != testString.charAt(len - counter - 1)) return false;
            counter++;
        }
        return true;
    }  
}
