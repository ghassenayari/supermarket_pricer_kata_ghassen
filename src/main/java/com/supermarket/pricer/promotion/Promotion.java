package com.supermarket.pricer.promotion;

import com.supermarket.pricer.item.Item;

public interface Promotion {
    float calculate(Item item);
}
