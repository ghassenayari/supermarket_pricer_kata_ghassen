package com.supermarket.pricer.item;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    String name;
    BigDecimal price;
    int quantity;

    public Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public float calculatePrice() {
        return quantity * price.floatValue();
    }
}
