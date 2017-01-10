package com.bakay.ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 12/5/2016.
 */
public class Main {
    public static void main(String[] args) {

        Currency money = new Currency(100);

        Dollar10Exchange Ex10 = new Dollar10Exchange();
        Dollar20Exchange Ex20 = new Dollar20Exchange();
//    Dollar50Exchange Ex50 = new Dollar50Exchange();

    }


}
