package com.supermarket.pricer.promotion.types;

import com.supermarket.pricer.item.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static com.supermarket.pricer.promotion.PromotionFactory.getPromotionType;
import static com.supermarket.pricer.promotion.PromotionType.BUY_ONE_GET_ONE_FREE;

class BuyOneGetOneFreeTest {
    @ParameterizedTest(name = "{index} => quantity={0}, expected={2}")
    @CsvSource({
            "3, 8",
            "6, 16",
            "7, 20",
            "1, 4",
            "2, 8",
            "0, 0"
    })
    void calculate_ShouldDisplayTheCorrectPrice(int quantity, int expected) {
        Item item = Item.builder().name("pepsi bottle").price(new BigDecimal("4")).promotion(getPromotionType(BUY_ONE_GET_ONE_FREE).get()).build();
        item.setQuantity(quantity);
        Assertions.assertEquals(expected, item.calculatePrice());
    }

}
