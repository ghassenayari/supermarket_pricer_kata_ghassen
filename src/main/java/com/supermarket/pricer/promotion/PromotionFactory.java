package com.supermarket.pricer.promotion;

import com.supermarket.pricer.output.OutputColor;
import com.supermarket.pricer.output.OutputHandler;
import com.supermarket.pricer.promotion.types.ThreeForOneDollar;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.supermarket.pricer.output.Constants.ERROR_WHEN_CREATING_INSTANCE_OF_PROMOTION;
import static com.supermarket.pricer.promotion.PromotionType.THREE_FOR_ONE_DOLLAR;

public class PromotionFactory {

    static Map<PromotionType, Class> promotionMap = new HashMap<>();

    static {
        promotionMap.put(THREE_FOR_ONE_DOLLAR, ThreeForOneDollar.class);
    }

    public static Optional<Promotion> getPromotionType(PromotionType type) {
        Promotion promotion = null;
        try {
            promotion = (Promotion) promotionMap.get(type).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            OutputHandler.print(ERROR_WHEN_CREATING_INSTANCE_OF_PROMOTION, OutputColor.RED);
        }
        return Optional.ofNullable(promotion);
    }
}
