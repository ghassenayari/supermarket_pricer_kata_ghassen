package com.supermarket.pricer.weight;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * ConvertUtils is an utility class dedicated for stating any utility method
 * used within the weight conversion process.
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConvertUtils {

    public static float convertLinear(Weight weight, float ratio, WeightUnity source) {
        if (weight.getUnity() == source) {
            return weight.getValue() / ratio;
        }
        return weight.getValue() * ratio;
    }
}
