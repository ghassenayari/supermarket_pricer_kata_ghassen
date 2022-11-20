package com.supermarket.pricer.item.datasource.loaders;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.item.datasource.ItemLoader;

import java.math.BigDecimal;
import java.util.Map;

import static com.supermarket.pricer.promotion.PromotionFactory.getPromotionType;
import static com.supermarket.pricer.promotion.PromotionType.THREE_FOR_ONE_DOLLAR;

public class StaticLoader implements ItemLoader {
    @Override
    public void load(Map items) {
        items.put(1, new Item("bean can", new BigDecimal("2"), getPromotionType(THREE_FOR_ONE_DOLLAR).get()));
        items.put(2, new Item("water bottle", new BigDecimal("3")));
        items.put(3, new Item("pasta pack", new BigDecimal("5")));
    }
}
