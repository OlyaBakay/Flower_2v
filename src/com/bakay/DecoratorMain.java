//package com.bakay;
//
///**
// * Created by cs.ucu.edu.ua on 11/21/2016.
// */
//
//
//import com.bakay.Flowers.Flower;
//import com.bakay.Flowers.FlowerBucket;
//import com.bakay.Flowers.FlowerSpec;
//import com.bakay.order.*;
//
//    /**
//     * Created by cs.ucu.edu.ua on 11/14/2016.
//     */
//    public class DecoratorMain {
//        public static void main(String args[]) {
//            System.out.println("Creating new bucket...");
//            FlowerBucket fb = new FlowerBucket();
//            FlowerSpec spec = new FlowerSpec(11);
//            Flower f1 = new Flower(spec);
//            Flower f2 = new Flower(new FlowerSpec(100.0));
//            fb.addFlower(f1);
//            fb.addFlower(f2);
//            System.out.println("Adding new flowers...");
//            System.out.println("Price without decor is: ");
//
//            System.out.println(fb.getTotalPrice());
//            FlowerBucketDecorator fbDecor = new FlowerBucketDecorator(fb);
//            System.out.println("Price with decor is (+10): ");
//            System.out.println(fbDecor.getTotalPrice());
//        }
//    }