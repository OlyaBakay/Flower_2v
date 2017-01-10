package com.bakay.Factory;

import com.bakay.Flowers.Flower;
import com.bakay.Flowers.FlowerBucket;
import com.bakay.Flowers.Spec;
import com.bakay.Flowers.FlowerColor;


public class Bday_bucket extends FlowerBucket {
//    protected FlowerBucket b_bucket;


    public void Bday_bucker() {
        FlowerBucket b_bucket = new FlowerBucket();
        Flower a = new Flower(new Spec());
        Flower b = new Flower(new Spec());
        b_bucket.addFlower(a);
        b_bucket.addFlower(b);
//        int i;
//        while (i<5){
//            b_bucket.addFlower();
        }
    }
