package com.bridgelabz;

public class Temperature {
    public double ctof(double c ) {
        double f = (c*9/5)+32;
        System.out.println("Temperature in Fahrenheit: "+f +" degree");
        return f;
    }

    public double ftoc(double f) {
        double c = (f-32)*5/9;
        System.out.println("Temperature in Calsius: "+c+" degree");
        return c;
    }
}
