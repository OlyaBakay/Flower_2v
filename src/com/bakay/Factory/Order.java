package com.bakay.Factory;

public class Order {
    public Order getOrder(Typeofbuck obj){
        if(obj == Typeofbuck.Bday){
            Order order = new Order();
//            order.addItem(new Bday_bucket());
            return order;
        }if (obj == Typeofbuck.funeral){
            Order ord = new Order();
//            ord.addItem(new funeral_bucket());
            return ord;
        }
        else {
            Order order = new Order();
//            order.addItem(new wed_bucket());
            return order;
        }

    }
}
