package com.supermarket.pricer.promotion;

import com.supermarket.pricer.item.Item;

/**
 * Promotion is an interface providing a method to calculate item promotions.
 */

public interface Promotion {
    float calculate(Item item);
}
