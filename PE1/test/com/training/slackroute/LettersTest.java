package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LettersTest {

    @Test
    void findLetterTypeSmall() {
        Letters letterObj=new Letters();
        assertEquals("a is a small letter",letterObj.findLetterType('a'));
    }
    @Test
    void findLetterTypeCapital() {
        Letters letterObj=new Letters();
        assertEquals("A is a capital letter",letterObj.findLetterType('A'));
    }
    @Test
    void findLetterTypeNumber() {
        Letters letterObj=new Letters();
        assertEquals("0 is a number",letterObj.findLetterType('0'));
    }
    @Test
    void findLetterTypeSplChar() {
        Letters letterObj=new Letters();
        assertEquals("% is a special character",letterObj.findLetterType('%'));
    }
}