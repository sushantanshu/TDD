package com.stackroute.unittest;

import java.util.Arrays;

public class Grade {

    public String findMin(int number, int[] marks){
        Arrays.sort(marks);
        return "The minimum is "+marks[0];
    }

    public String findMax(int number, int[] marks){
        Arrays.sort(marks);
        return "The maximum is "+marks[number-1];
    }

    public String findAvg(int number, int[] marks){
        int sum=0;
        for(int i=0; i<number;i++){
            sum+=marks[i];
        }
        return "The average is "+sum/number;
    }
}
