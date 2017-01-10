package com.bakay.ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 12/5/2016.
 */
public class Dollar10Exchange extends Exchange {
    public void getMoney(Currency curr){
        int money = curr.getAmount();
        System.out.println("Made " + money/10 + "dol.");
    }
    }
