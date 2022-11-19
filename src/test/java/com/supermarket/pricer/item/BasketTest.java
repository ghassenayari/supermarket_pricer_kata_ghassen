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
        basket.addItem(new Item("bean can", new BigDecimal("2")));
        basket.addItem(new Item("water bottle", new BigDecimal("3")));
        basket.addItem(new Item("pasta pack", new BigDecimal("5")));
    }

    @Test
    void calculatePrice_0_QuantityIsNotSetForAllItems() {
        Assertions.assertEquals(0, basket.calculatePrice());
    }

    @Test
    void calculatePrice_Positive_QuantityIsSet() {
        Item item1 = new Item("pepsi can", new BigDecimal("6"));
        item1.setQuantity(5);
        Item item2 = new Item("cola can", new BigDecimal("7"));
        item2.setQuantity(2);
        basket.addItem(item1);
        basket.addItem(item2);
        Assertions.assertEquals(44.0, basket.calculatePrice());
    }
}
