package com.supermarket.pricer.item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BasketTest {

    private Basket basket;

    @BeforeEach
    void setUp() {
        basket = new Basket();
        basket.addItem(Item.builder().name("bean can").price(new BigDecimal("2")).build());
        basket.addItem(Item.builder().name("water bottle").price(new BigDecimal("3")).build());
        basket.addItem(Item.builder().name("pasta pack").price(new BigDecimal("5")).build());
    }

    @Test
    void calculatePrice_0_QuantityIsNotSetForAllItems() {
        Assertions.assertEquals(0, basket.calculatePrice());
    }

    @Test
    void calculatePrice_Positive_QuantityIsSet() {
        Item.builder().name("pepsi can").price(new BigDecimal("6")).build();
        Item item1 = Item.builder().name("pepsi can").price(new BigDecimal("6")).build();
        item1.setQuantity(5);
        Item item2 = Item.builder().name("cola can").price(new BigDecimal("7")).build();
        item2.setQuantity(2);
        basket.addItem(item1);
        basket.addItem(item2);
        Assertions.assertEquals(44.0, basket.calculatePrice());
    }
}
