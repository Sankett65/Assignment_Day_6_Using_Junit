package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;

public class TemperatureTesting {


    Temperature obj = new Temperature();
    DecimalFormat df= new DecimalFormat("0.00");

    @Test
    public void toCheckTemperatureInFahrenheit(){
        Assertions.assertEquals(73.4,obj.ctof(23));
    }

    @Test
    public void toCheckTemperatureInCelsius(){
        double res=obj.ftoc(73.4);
        String expec=df.format(23);
        Assertions.assertEquals(expec,df.format(res));
    }

}
