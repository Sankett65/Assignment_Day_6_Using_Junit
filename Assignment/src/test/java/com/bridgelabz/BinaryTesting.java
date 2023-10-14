package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTesting {

    Binary obj =new Binary();


    @Test
    public void toChekBinaryRepresentation(){
        Assertions.assertEquals(70,obj.tobinary(100));
    }

    @Test
    public void toChekBinaryRepresentation1(){
        Assertions.assertEquals(22,obj.tobinary(50));
    }
}
