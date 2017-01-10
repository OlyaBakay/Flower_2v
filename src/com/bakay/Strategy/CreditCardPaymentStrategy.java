package com.bakay.Strategy;


public class CreditCardPaymentStrategy implements IPayment {
    public void pay(double price) {
        System.out.println("You payed: " + price + " by credit card payment.");
    }
}