package com.bakay.ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 12/5/2016.
 */
public class Dollar20Exchange extends Exchange {
    public void getMoney(Currency curr){
        int money = curr.getAmount();
        next.getMoney(new Currency(money % 20));
        System.out.println("Made " + money/20 + "dol.");
    }

}
