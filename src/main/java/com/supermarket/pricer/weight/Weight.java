package com.supermarket.pricer.weight;

import lombok.Data;

/**
 * Weight is responsible for holding a the value of weight and its unity.
 */

@Data
public class Weight {
    float value;
    WeightUnity unity;

    public Weight(float value, WeightUnity unity) {
        this.value = value;
        this.unity = unity;
    }
}
