package com.supermarket.pricer.promotion.types;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.promotion.Promotion;
import com.supermarket.pricer.weight.Weight;
import com.supermarket.pricer.weight.WeightUnity;

public class TwoPoundsOneDollar implements Promotion {
    @Override
    public float calculate(Item item) {
        Weight weight = item.getWeight();
        if (weight != null && weight.getUnity() == WeightUnity.POUND && weight.getValue() > 3f) {
            return ((weight.getValue() / 2) + ((weight.getValue() % 2) * item.getPrice().floatValue()));
        } else {
            return item.getQuantity() * item.getPrice().floatValue();
        }
    }
}
