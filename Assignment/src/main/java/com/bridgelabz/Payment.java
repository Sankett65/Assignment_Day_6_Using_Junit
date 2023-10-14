package com.bridgelabz;

import java.text.DecimalFormat;

public class Payment {
    public String  monthlyPayment(double P, int Y, double R) {
        DecimalFormat d = new DecimalFormat("0.00");
        double n = 12*Y;
        System.out.println(n);
        double r = (R/100)/12;
        System.out.println(r);
        double payment= (P*r)/1-(Math.pow(1+r,n*(-1)));
        System.out.println("Payment is : "+payment);

        return d.format(payment);
    }
}
