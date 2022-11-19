package com.supermarket.pricer.item;

import com.supermarket.pricer.promotion.Promotion;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    String name;
    BigDecimal price;
    int quantity;
    Promotion promotion;

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
