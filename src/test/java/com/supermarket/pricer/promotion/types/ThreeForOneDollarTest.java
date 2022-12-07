package com.supermarket.pricer.promotion.types;

import com.supermarket.pricer.item.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static com.supermarket.pricer.promotion.PromotionFactory.getPromotionType;
import static com.supermarket.pricer.promotion.PromotionType.THREE_FOR_ONE_DOLLAR;

class ThreeForOneDollarTest {

    @ParameterizedTest(name = "{index} => quantity={0}, expected={2}")
    @CsvSource({
            "3, 1",
            "6, 2",
            "7, 7",
    })
    void calculate_ShouldDisplayTheCorrectPrice(int quantity, int expected) {
        Item item = Item.builder().name("water bottle").price(new BigDecimal("5")).promotion(getPromotionType(THREE_FOR_ONE_DOLLAR).get()).build();
        item.setQuantity(quantity);
        Assertions.assertEquals(expected, item.calculatePrice());
    }

}
