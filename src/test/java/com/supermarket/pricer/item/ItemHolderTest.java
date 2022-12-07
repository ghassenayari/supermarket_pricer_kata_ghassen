package com.supermarket.pricer.item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class ItemHolderTest {

    @Test
    void getItemById_0_EmptyOptional() {
        Optional<Item> result = ItemHolder.getItemById(0);
        Assertions.assertEquals(Optional.empty(), result);
    }

    @Test
    void getItemById_99999_EmptyOptional() {
        Optional<Item> result = ItemHolder.getItemById(0);
        Assertions.assertEquals(Optional.empty(), result);
    }

    @Test
    void getItemById_Negative_EmptyOptional() {
        Optional<Item> result = ItemHolder.getItemById(-1);
        Assertions.assertEquals(Optional.empty(), result);
    }

    @Test
    void getItemById_1_Exist() {
        Optional<Item> result = ItemHolder.getItemById(1);
        Assertions.assertEquals("bean can", result.get().getName());
    }
}
