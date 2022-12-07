package com.supermarket.pricer.item.datasource;

import com.supermarket.pricer.item.Item;

import java.util.Map;

/**
 * ItemLoader is an interface providing a method to load items.
 * sources should differ depending on the implementation.
 */

public interface ItemLoader {
    void load(Map<Integer, Item> items);
}
