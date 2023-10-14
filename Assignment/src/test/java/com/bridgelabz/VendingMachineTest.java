package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VendingMachineTest {

    VendingMachine obj = new VendingMachine();

    @Test
    public void toCheckTheNotesForRupess173(){
        int excepted[]={1 ,2 ,0 ,10 ,50, 100 ,0 ,0 };
        Assertions.assertArrayEquals(excepted,obj.vendingMachine(173));
    }



    @Test
    public void toCheckTheNotesForRupess535(){
        int excepted[]={0 ,0, 5 ,10, 0 ,0 ,500 ,0};
        Assertions.assertArrayEquals(excepted,obj.vendingMachine(535));
    }
}
