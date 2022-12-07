package com.supermarket.pricer.weight;

import lombok.Value;

/**
 * Weight is responsible for holding a the value of weight and its unity.
 */

@Value
public class Weight {
    float value;
    WeightUnity unity;
}
