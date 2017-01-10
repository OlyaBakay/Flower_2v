package com.bakay.Strategy;

public class PayPalPaymentStrategy implements IPayment {
    public void pay(double price) {
        System.out.println("You payed: " + price + " by PayPal payment.");
    }
}
