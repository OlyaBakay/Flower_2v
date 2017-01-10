package com.bakay.order;
import com.bakay.Flowers.Item;


public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item itm) {
        super(itm);
    }

    @Override
    public double getTotalPrice() {
        return 40 + itm.getTotalPrice();
    }

    public String getDescription(){
        System.out.println("It is a ribbon bouquet");
        return itm.getDescription();
    }
}