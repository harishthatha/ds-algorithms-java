package com.dsalgorithms.tricks;

import java.text.NumberFormat;

public class Trick1 {

    public void trick1(){
        int num = 10;
        int mulWithTwo = 10 << 2;
        System.out.println(mulWithTwo);
        System.out.println();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String amount = currency.format(1000000);
        System.out.println(amount);

        while(true){
            if(num == 10) break;
            System.out.println("after brek");
        }


    }

}
