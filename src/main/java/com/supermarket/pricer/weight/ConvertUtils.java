package com.supermarket.pricer.weight;

/**
 * ConvertUtils is an utility class dedicated for stating any utility method
 * used within the weight conversion process.
 */

public class ConvertUtils {
    private ConvertUtils() {
    }

    public static float convertLinear(Weight weight, float ratio, WeightUnity source) {
        if (weight.getUnity() == source) {
            return weight.getValue() / ratio;
        }
        return weight.getValue() * ratio;
    }
}
