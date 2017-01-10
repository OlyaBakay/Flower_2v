package com.bakay.order;
import com.bakay.Flowers.Item;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item itm) {
        super(itm);
    }

    public double getTotalPrice() {
        return 13 + itm.getTotalPrice();
    }

    public String getDescription(){
        System.out.println("It is a paper bouquet:");
        return itm.getDescription();
    }
}
