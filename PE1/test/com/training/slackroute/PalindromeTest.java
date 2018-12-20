package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void checkPalindrome() {
        Palindrome palindrome=new Palindrome();
        assertEquals("true false",palindrome.checkPalindrome("123321"));
    }
    @Test
    void checkPalindromeOne() {
        Palindrome palindrome=new Palindrome();
        assertEquals("true true",palindrome.checkPalindrome("1236886321"));
    }
    @Test
    void checkPalindromeTwo() {
        Palindrome palindrome=new Palindrome();
        assertEquals("false",palindrome.checkPalindrome("12367321"));
    }
    @Test
    void checkPalindromeThree() {
        Palindrome palindrome=new Palindrome();
        assertEquals("false",palindrome.checkPalindrome("6482864"));
    }
}