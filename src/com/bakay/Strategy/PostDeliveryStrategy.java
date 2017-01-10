package com.bakay.Strategy;

import java.util.LinkedList;

public class PostDeliveryStrategy implements IDelivery {
    public void deliver(LinkedList items){
        System.out.println("Order done by PostDeliveryStrategy");

    }
}