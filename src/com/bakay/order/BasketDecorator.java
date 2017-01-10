package com.bakay.order;

import  com.bakay.Flowers.Item;
/**
 * Created by cs.ucu.edu.ua on 11/21/2016.
 */

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double getTotalPrice() {
        return itm.getTotalPrice() + 4;
    }

    @Override
    public String getDescription() {
        System.out.println("This is BasketDecorator");
        return itm.getDescription();
    }
}
