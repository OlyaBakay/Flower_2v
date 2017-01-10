package com.bakay.ChainOfResponsibility;

public class Currency {
    private int amount;
//    Currency next;

    Currency(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

//    public int takeAmount(){
//        return 10;
//    }


}
