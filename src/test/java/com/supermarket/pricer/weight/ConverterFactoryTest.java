package com.supermarket.pricer.weight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.supermarket.pricer.weight.WeightUnity.*;

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

    @Test
    void convert_Positive_FromGramToPound() {
        WeightConverter converter = ConverterFactory.getConverter(GRAM, POUND).get();
        float result = converter.convert(new Weight(100f, GRAM));
        Assertions.assertEquals(0.22045855f, result);
    }

    @Test
    void convert_Positive_FromPoundToGram() {
        WeightConverter converter = ConverterFactory.getConverter(GRAM, POUND).get();
        float result = converter.convert(new Weight(00.22045855f, POUND));
        Assertions.assertEquals(100f, result);
    }

    @Test
    void convert_Positive_FromOunceToPound() {
        WeightConverter converter = ConverterFactory.getConverter(OUNCE, POUND).get();
        float result = converter.convert(new Weight(6.25f, OUNCE));
        Assertions.assertEquals(0.390625, result);
    }

    @Test
    void convert_Positive_FromPoundToOunce() {
        WeightConverter converter = ConverterFactory.getConverter(OUNCE, POUND).get();
        float result = converter.convert(new Weight(2400f, POUND));
        Assertions.assertEquals(38400f, result);
    }
}
