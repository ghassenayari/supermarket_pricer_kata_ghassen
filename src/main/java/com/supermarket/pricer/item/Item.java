package com.supermarket.pricer.item;

import com.supermarket.pricer.promotion.Promotion;
import com.supermarket.pricer.weight.Weight;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Item {

    String name;
    BigDecimal price;
    int quantity;
    Promotion promotion;
    Weight weight;

    public float calculatePrice() {
        if (promotion != null) {
            return promotion.calculate(this);
        }
        return quantity * price.floatValue();
    }
}
