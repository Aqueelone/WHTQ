package com.whqt;


/**
 *
 * @author Sergy Nazarevich
 */
public class Palindrome {
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
