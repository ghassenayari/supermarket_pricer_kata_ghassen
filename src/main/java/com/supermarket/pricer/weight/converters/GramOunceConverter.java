package com.supermarket.pricer.weight.converters;

import com.supermarket.pricer.weight.Weight;
import com.supermarket.pricer.weight.WeightConverter;

import static com.supermarket.pricer.weight.ConvertUtils.convertLinear;
import static com.supermarket.pricer.weight.WeightUnity.GRAM;

/**
 * This class depicts the conversion logic from Gram to Ounce
 * or reciprocally.
 */

public class GramOunceConverter implements WeightConverter {

    private static final float RATIO = 28.35f;

    @Override
    public final float convert(Weight weight) {
        return convertLinear(weight, RATIO, GRAM);
    }
}
