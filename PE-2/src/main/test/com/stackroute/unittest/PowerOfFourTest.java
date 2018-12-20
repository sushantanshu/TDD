package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest {

    @Test
    public void checkPowerOfFourOne() {
        PowerOfFour powerObj=new PowerOfFour();
        assertEquals(false,powerObj.checkPowerOfFour(0));
    }
    @Test
    public void checkPowerOfFourTwo() {
        PowerOfFour powerObj=new PowerOfFour();
        assertEquals(false,powerObj.checkPowerOfFour(3));
    }
    @Test
    public void checkPowerOfFourThree() {
        PowerOfFour powerObj=new PowerOfFour();
        assertEquals(true,powerObj.checkPowerOfFour(4));
    }
    @Test
    public void checkPowerOfFourFour() {
        PowerOfFour powerObj=new PowerOfFour();
        assertEquals(true,powerObj.checkPowerOfFour(64));
    }
    @Test
    public void checkPowerOfFourFive() {
        PowerOfFour powerObj=new PowerOfFour();
        assertEquals(false,powerObj.checkPowerOfFour(14));
    }
}