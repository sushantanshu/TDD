package com.stackroute.unittest;

public class ReversePalindrome {

    public String isPalindrome(String num){
        StringBuilder checkNum=new StringBuilder();
        checkNum.append(num);
        String reverse=checkNum.reverse().toString();
        if(num.equals(reverse)){
            return "It is a Palindrome";
        }
        else
            return "It is not a Palindrome";
    }
}
