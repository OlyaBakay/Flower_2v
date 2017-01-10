package com.bakay.Factory;

import com.bakay.Flowers.Flower;
import com.bakay.Flowers.FlowerBucket;
import com.bakay.Flowers.Spec;
import com.bakay.Flowers.FlowerColor;

public class wed_bucket extends FlowerBucket {
//    protected FlowerBucket wed_bucket;


    public void wed_bucket() {
        FlowerBucket wed_bucket = new FlowerBucket();
        Flower a = new Flower(new Spec());
        Flower b = new Flower(new Spec());
        wed_bucket.addFlower(a);
        wed_bucket.addFlower(b);

    }
}
