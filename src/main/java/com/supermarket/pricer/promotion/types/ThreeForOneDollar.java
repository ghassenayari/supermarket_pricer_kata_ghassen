package com.supermarket.pricer.promotion.types;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.promotion.Promotion;

/**
 * This class depicts the calculation logic for the
 * Three For One Dollar promotion.
 */

public class ThreeForOneDollar implements Promotion {
    @Override
    public float calculate(Item item) {
        if (item.getQuantity() >= 3) {
            return ((item.getQuantity() / 3) + ((item.getQuantity() % 3) * item.getPrice().floatValue()));
        } else {
            return item.getQuantity() * item.getPrice().floatValue();
        }
    }
}
