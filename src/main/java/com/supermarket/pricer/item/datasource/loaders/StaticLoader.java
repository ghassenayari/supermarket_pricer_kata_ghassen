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
        items.put(1, Item.builder().name("bean can").price(new BigDecimal("2")).promotion(getPromotionType(THREE_FOR_ONE_DOLLAR).get()).build());
        items.put(2, Item.builder().name("water bottle").price(new BigDecimal("3")).build());
        items.put(3, Item.builder().name("pasta pack").price(new BigDecimal("5")).build());
    }
}
