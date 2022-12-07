package com.supermarket.pricer.item.datasource.loaders;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.item.datasource.ItemLoader;
import com.supermarket.pricer.weight.ConverterFactory;
import com.supermarket.pricer.weight.Weight;
import com.supermarket.pricer.weight.WeightConverter;

import java.math.BigDecimal;
import java.util.Map;

import static com.supermarket.pricer.promotion.PromotionFactory.getPromotionType;
import static com.supermarket.pricer.promotion.PromotionType.THREE_FOR_ONE_DOLLAR;
import static com.supermarket.pricer.weight.WeightUnity.*;


public class StaticLoader implements ItemLoader {
    static WeightConverter gramOunceConverter = ConverterFactory.getConverter(GRAM, OUNCE).get();
    static WeightConverter poundOunceConverter = ConverterFactory.getConverter(POUND, OUNCE).get();

    @Override
    public void load(Map items) {
        items.put(1, Item.builder().name("bean can").price(new BigDecimal("2")).promotion(getPromotionType(THREE_FOR_ONE_DOLLAR).orElse(null)).build());
        items.put(2, Item.builder().name("water bottle").price(new BigDecimal("3")).build());
        items.put(3, Item.builder().name("pasta pack").price(new BigDecimal("5")).build());
        items.put(4, Item.builder().name("tunisian couscous").price(new BigDecimal("6")).weight(new Weight(gramOunceConverter.convert(new Weight(500f, GRAM)), OUNCE)).build());
        items.put(5, Item.builder().name("butter").price(new BigDecimal("60")).weight(new Weight(poundOunceConverter.convert(new Weight(50f, POUND)), OUNCE)).build());
    }
}
