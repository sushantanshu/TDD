package com.stackroute.unittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    private MemberVariable memberVarObjOne;
    private Member memberVarObjTwo;

    @Before
    public void setUp(){
        memberVarObjOne=new MemberVariable();
        memberVarObjTwo=new Member();
    }

    @Test
    public void memberTestOne(){
        memberVarObjTwo.setName("Ramya");
        memberVarObjTwo.setAge(22);
        memberVarObjTwo.setSalary(47000.00);
        assertEquals(memberVarObjTwo.toString(),memberVarObjOne.displayMembers().toString());
    }

}