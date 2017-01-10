package com.bakay.order;

abstract class Item {
    String description;
    double price;

    abstract double getPrice();

    abstract String getDescription();
}
