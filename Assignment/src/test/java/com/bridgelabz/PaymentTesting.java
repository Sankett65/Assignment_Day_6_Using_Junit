package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class PaymentTesting {

    Payment obj = new Payment();
    DecimalFormat df= new DecimalFormat("0.00");


    @Test
    public void toCheckThePayment(){
        String excep=df.format(59.11);
        Assertions.assertEquals(excep,obj.monthlyPayment(12000,2,6));
    }

    @Test
    public void toCheckThePayment1(){
        String excep=df.format(24.06);
        Assertions.assertEquals(excep,obj.monthlyPayment(10000,2,3));
    }

}
