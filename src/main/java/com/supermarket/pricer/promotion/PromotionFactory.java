package com.supermarket.pricer.promotion;

import com.supermarket.pricer.output.OutputColor;
import com.supermarket.pricer.output.OutputHandler;
import com.supermarket.pricer.promotion.types.BuyOneGetOneFree;
import com.supermarket.pricer.promotion.types.ThreeForOneDollar;
import com.supermarket.pricer.promotion.types.TwoPoundsOneDollar;

import java.util.EnumMap;
import java.util.Optional;

import static com.supermarket.pricer.output.Constants.ERROR_WHEN_CREATING_INSTANCE_OF_PROMOTION;
import static com.supermarket.pricer.promotion.PromotionType.*;

public class PromotionFactory {

    static EnumMap<PromotionType, Class> promotionMap = new EnumMap<>(PromotionType.class);

    private PromotionFactory() {
    }

    static {
        promotionMap.put(THREE_FOR_ONE_DOLLAR, ThreeForOneDollar.class);
        promotionMap.put(TWO_POUNDS_ONE_DOLLAR, TwoPoundsOneDollar.class);
        promotionMap.put(BUY_ONE_GET_ONE_FREE, BuyOneGetOneFree.class);
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
