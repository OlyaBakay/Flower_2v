package com.bakay.Factory;
import com.bakay.Flowers.Flower;
import com.bakay.Flowers.FlowerBucket;
import com.bakay.Flowers.Spec;
import com.bakay.Flowers.FlowerColor;

public class funeral_bucket extends FlowerBucket {
    protected FlowerBucket f_bucket;

    public void funeral_bucker() {
        FlowerBucket  f_bucket = new FlowerBucket();

        Flower a = new Flower(new Spec());
        Flower b = new Flower(new Spec());
        f_bucket.addFlower(a);
        f_bucket.addFlower(b);

    }
}
