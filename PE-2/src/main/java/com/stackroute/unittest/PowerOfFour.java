package com.stackroute.unittest;

public class PowerOfFour {

    public boolean checkPowerOfFour(int n){
        if(n<4)
            return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }
}
