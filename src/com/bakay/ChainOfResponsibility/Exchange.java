package com.bakay.ChainOfResponsibility;

/**
 * Created by cs.ucu.edu.ua on 12/5/2016.
 */
public abstract class Exchange {
//    Exchange next;
    Exchange next;
    public void SetNext(Exchange obj){
        this.next = next;
    }

    public abstract void getMoney(Currency curr);


}
