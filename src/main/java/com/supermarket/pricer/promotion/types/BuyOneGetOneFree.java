package com.supermarket.pricer.promotion.types;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.promotion.Promotion;

public class BuyOneGetOneFree implements Promotion {
    @Override
    public float calculate(Item item) {
        if (item.getQuantity() >= 2) {
            return ((item.getQuantity() - (item.getQuantity() / 3)) * item.getPrice().floatValue());
        } else {
            return item.getQuantity() * item.getPrice().floatValue();
        }
    }
}
