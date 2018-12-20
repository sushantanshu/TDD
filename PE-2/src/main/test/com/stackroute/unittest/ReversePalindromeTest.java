package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePalindromeTest {

    @Test
    public void isPalindrome() {
        ReversePalindrome revPalinObj=new ReversePalindrome();
        assertEquals("It is a Palindrome",revPalinObj.isPalindrome("123321"));
    }
    @Test
    public void isPalindromeNot() {
        ReversePalindrome revPalinObj=new ReversePalindrome();
        assertEquals("It is not a Palindrome",revPalinObj.isPalindrome("12356321"));
    }

}