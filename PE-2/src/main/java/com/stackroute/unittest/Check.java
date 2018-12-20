package com.stackroute.unittest;

import java.util.Scanner;

public class Check {

    public static void main(String[] args){
        int sum=0;
        System.out.println("Enter series of numbers");
        Scanner scanLine=new Scanner(System.in);
        String numbers=scanLine.nextLine();
        String[] numArray=numbers.split(" ");

        for(int i=0;i<numArray.length;i++){
            try {
                sum += Integer.parseInt(numArray[i]);
            }
            catch (Exception e){
                System.out.println(numArray[i]+" is not an Integer");
            }
        }
        System.out.println("The sum is "+sum);
    }
}
