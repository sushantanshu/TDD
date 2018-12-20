package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintStringTest {

    @Test
    void checkNumber() {
        PrintString printStringObj=new PrintString();
        assertEquals("Jerry",printStringObj.checkNumber(22));
    }
    @Test
    void checkNumberTwo() {
        PrintString printStringObj=new PrintString();
        assertEquals("Tom",printStringObj.checkNumber(25));
    }
    @Test
    void checkNumberThree() {
        PrintString printStringObj=new PrintString();
        assertEquals(null,printStringObj.checkNumber(11));
    }


}