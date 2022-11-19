package com.supermarket.pricer.weight;

import lombok.Data;

@Data
public class Weight {
    float value;
    WeightUnity unity;

    public Weight(float value, WeightUnity unity) {
        this.value = value;
        this.unity = unity;
    }
}
