package com.supermarket.pricer.item.datasource;

import com.supermarket.pricer.item.Item;

import java.util.Map;

public interface ItemLoader {
    void load(Map<Integer, Item> items);
}
