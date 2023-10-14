package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalenderTesting {


    Calender obj = new Calender();

    @Test
    public void toCheckTheDayOfWeek1(){
        Assertions.assertEquals("Monday",obj.dayOfWeek(12,23,2002));
    }
    @Test
    public void toCheckTheDayOfWeek2(){
        Assertions.assertEquals("Tuesday",obj.dayOfWeek(10,7,1980));
    }
}
