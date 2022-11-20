package com.supermarket.pricer.item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ItemTest {

    @Test
    void calculatePrice_0_QuantityIsNotSet() {
        Item item = Item.builder().name("bean can").price(new BigDecimal("33")).build();
        Assertions.assertEquals(0, item.calculatePrice());
    }

    @Test
    void calculatePrice_Positive_QuantityIsSet() {
        Item item = Item.builder().name("bean can").price(new BigDecimal("22.3")).build();
        item.setQuantity(2);
        Assertions.assertEquals(44.6f, item.calculatePrice());
    }
}
