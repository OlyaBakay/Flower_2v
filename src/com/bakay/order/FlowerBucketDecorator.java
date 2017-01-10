package com.bakay.order;
import com.bakay.Flowers.FlowerBucket;


public class FlowerBucketDecorator extends FlowerBucket{
    FlowerBucket fb ;
    public FlowerBucketDecorator(FlowerBucket fb) {
        this.fb = fb;
    }
    @Override
    public double getTotalPrice(){
        return fb.getTotalPrice() + 10;
    }


}

