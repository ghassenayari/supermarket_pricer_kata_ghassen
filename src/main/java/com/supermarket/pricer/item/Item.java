package com.supermarket.pricer.item;

import com.supermarket.pricer.promotion.Promotion;
import com.supermarket.pricer.weight.Weight;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    String name;
    BigDecimal price;
    int quantity;
    Promotion promotion;
    Weight weight;

    public Item(String name, BigDecimal price, Promotion promotion) {
        this.name = name;
        this.price = price;
        this.promotion = promotion;
    }

    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public float calculatePrice() {
        if (promotion != null) {
            return promotion.calculate(this);
        }
        return quantity * price.floatValue();
    }
}
