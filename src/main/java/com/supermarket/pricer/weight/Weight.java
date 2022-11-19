package com.supermarket.pricer.weight;

import lombok.Data;

@Data
public class Weight {
    float weight;
    WeightUnity unity;

    public Weight(float weight, WeightUnity unity) {
        this.weight = weight;
        this.unity = unity;
    }
}
