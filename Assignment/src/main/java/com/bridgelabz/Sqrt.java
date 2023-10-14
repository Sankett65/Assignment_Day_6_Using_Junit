package com.bridgelabz;

import java.text.DecimalFormat;

public class Sqrt {

    public double sqrt(double c) {
        DecimalFormat d = new DecimalFormat("0.00");
        if (c<0){
            System.out.println("Invaliad Input");
        }
        double t = c;
        double epsilon=1e-15;

        while (Math.abs(t - c/t) > epsilon*t){
            t = (c/t+t)/2;
        }

        System.out.println("Square Root of "+c+" is = "+t);
        return t;
    }
}
