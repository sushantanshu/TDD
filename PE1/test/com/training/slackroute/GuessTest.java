package com.training.slackroute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTest {

    @Test
    void guessNum() {
        Guess guessObj=new Guess();
        assertEquals("You guessed it right!",guessObj.guessNum(76));
    }

    @Test
    void guessNumMore() {
        Guess guessObj=new Guess();
        assertEquals("The number is greater than the target",guessObj.guessNum(80));
    }

    @Test
    void guessNumLess() {
        Guess guessObj=new Guess();
        assertEquals("The number is less than the target",guessObj.guessNum(70));
    }
}