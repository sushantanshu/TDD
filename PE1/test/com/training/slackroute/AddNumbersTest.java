package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest {

    @Test
    void sum() {
        AddNumbers addObj=new AddNumbers();
        assertArrayEquals(new int[]{0,0},addObj.sum(new Object[]{1,2,"d"}));
        assertArrayEquals(new int[]{1,9},addObj.sum(new Object[]{1,2,6}));
    }
}