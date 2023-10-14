package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class SqrtTesting {


    Sqrt obj = new Sqrt();
    DecimalFormat d = new DecimalFormat("0.00");

    @Test
    public void toComputeSquareRoot(){
        double actual=obj.sqrt(23);
        String excep=d.format(4.80);
        Assertions.assertEquals(excep,d.format(actual));
    }

    @Test
    public void toComputeSquareRoot1(){
        double actual=obj.sqrt(10);
        String excep=d.format(3.16);
        Assertions.assertEquals(excep,d.format(actual));
    }
}
