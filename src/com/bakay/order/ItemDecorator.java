package com.bakay.order;

import com.bakay.Flowers.Item;

abstract class ItemDecorator implements Item {
        public Item itm;
        public ItemDecorator(Item itm) {
            this.itm = itm;
        }

        public abstract String getDescription();
    }

