package com.supermarket.pricer.promotion.types;

import com.supermarket.pricer.item.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.supermarket.pricer.promotion.PromotionFactory.getPromotionType;
import static com.supermarket.pricer.promotion.PromotionType.THREE_FOR_ONE_DOLLAR;

class ThreeForOneDollarTest {

    @Test
    void calculate_1_ThreeItemsAreSet() {
        Item item = new Item("water bottle", new BigDecimal("5"), getPromotionType(THREE_FOR_ONE_DOLLAR).get());
        item.setQuantity(3);
        Assertions.assertEquals(1, item.calculatePrice());
    }

    @Test
    void calculate_2_SixItemsAreSet() {
        Item item = new Item("water bottle", new BigDecimal("5"), getPromotionType(THREE_FOR_ONE_DOLLAR).get());
        item.setQuantity(6);
        Assertions.assertEquals(2, item.calculatePrice());
    }

    @Test
    void calculate_7_SevenItemsAreSet() {
        Item item = new Item("water bottle", new BigDecimal("5"), getPromotionType(THREE_FOR_ONE_DOLLAR).get());
        item.setQuantity(7);
        Assertions.assertEquals(7, item.calculatePrice());
    }

}
