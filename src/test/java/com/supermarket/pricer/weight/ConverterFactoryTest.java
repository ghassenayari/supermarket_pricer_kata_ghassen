package com.supermarket.pricer.weight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.supermarket.pricer.weight.WeightUnity.GRAM;
import static com.supermarket.pricer.weight.WeightUnity.OUNCE;

class ConverterFactoryTest {

    @Test
    void convert_Positive_FromGramToOunce() {
        WeightConverter converter = ConverterFactory.getConverter(GRAM, OUNCE).get();
        float result = converter.convert(new Weight(5f, GRAM));
        Assertions.assertEquals(0.17636684f, result);
    }

    @Test
    void convert_Positive_FromOunceToGram() {
        WeightConverter converter = ConverterFactory.getConverter(GRAM, OUNCE).get();
        float result = converter.convert(new Weight(0.17636684f, OUNCE));
        Assertions.assertEquals(5f, result);
    }
}
