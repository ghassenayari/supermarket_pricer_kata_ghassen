package com.supermarket.pricer.item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ItemTest {

    @Test
    void calculatePrice_0_QuantityIsNotSet() {
        Item item = new Item("bean can", new BigDecimal("33"));
        Assertions.assertEquals(0, item.calculatePrice());
    }

    @Test
    void calculatePrice_Positive_QuantityIsSet() {
        Item item = new Item("bean can", new BigDecimal("22.3"));
        item.setQuantity(2);
        Assertions.assertEquals(44.6f, item.calculatePrice());
    }
}
