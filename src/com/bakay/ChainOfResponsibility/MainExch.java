package com.bakay.ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 1/10/2017.
 */
public class MainExch {

    public void Bills(int bill){
        Dollar10Exchange ten = new Dollar10Exchange();
        Dollar20Exchange twenty = new Dollar20Exchange();
        Dollar50Exchange fifthy = new Dollar50Exchange();
        fifthy.next = twenty;
        twenty.next = ten;
        fifthy.getMoney(new Currency(bill));
    }
}
