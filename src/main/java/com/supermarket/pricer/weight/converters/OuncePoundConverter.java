package com.supermarket.pricer.weight.converters;

import com.supermarket.pricer.weight.Weight;
import com.supermarket.pricer.weight.WeightConverter;

import static com.supermarket.pricer.weight.ConvertUtils.convertLinear;
import static com.supermarket.pricer.weight.WeightUnity.OUNCE;

public class OuncePoundConverter implements WeightConverter {

    private static final float RATIO = 16f;

    @Override
    public final float convert(Weight weight) {
        return convertLinear(weight, RATIO, OUNCE);
    }
}
