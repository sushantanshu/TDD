package com.stackroute.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeTest {

    private Grade gradeObj;
    private int[] marks={34,55,11,100};

    @Before
    public void setUp(){
        gradeObj=new Grade();
    }

    @Test
    public void checkMin(){
        assertEquals("The minimum is 11",gradeObj.findMin(4,marks));
    }

    @Test
    public void checkMax(){
        assertEquals("The maximum is 100",gradeObj.findMin(4,marks));
    }

    @Test
    public void checkAvg(){
        assertEquals("The average is 50",gradeObj.findAvg(4,marks));
    }

}
