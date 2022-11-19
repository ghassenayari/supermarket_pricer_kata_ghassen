package com.supermarket.pricer.item;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Basket {

    private List<Item> ItemList;

    public Basket() {
        ItemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        ItemList.add(item);
    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (Item item : ItemList) {
            totalPrice += item.calculatePrice();
        }
        return totalPrice;
    }
}
