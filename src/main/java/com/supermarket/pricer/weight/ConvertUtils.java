package com.supermarket.pricer.weight;

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
