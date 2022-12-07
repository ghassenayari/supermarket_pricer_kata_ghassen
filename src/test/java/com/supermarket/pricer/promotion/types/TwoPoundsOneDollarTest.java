package com.supermarket.pricer.promotion.types;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.weight.Weight;
import com.supermarket.pricer.weight.WeightUnity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static com.supermarket.pricer.promotion.PromotionFactory.getPromotionType;
import static com.supermarket.pricer.promotion.PromotionType.TWO_POUNDS_ONE_DOLLAR;

class TwoPoundsOneDollarTest {

    @ParameterizedTest(name = "{index} => weight={0}, expected={2}")
    @CsvSource({
            "3, 0",
            "6, 3",
            "8, 4",
            "1, 0",
            "2, 0"
    })
    void calculate_ShouldDisplayTheCorrectPrice(int weight, int expected) {
        Item item = Item.builder().name("water bottle").price(new BigDecimal("10")).promotion(getPromotionType(TWO_POUNDS_ONE_DOLLAR).get()).build();
        item.setWeight(new Weight(weight, WeightUnity.POUND));
        Assertions.assertEquals(expected, item.calculatePrice());
    }

}
