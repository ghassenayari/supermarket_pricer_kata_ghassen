package com.supermarket.pricer.item;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Basket {

    private List<Item> itemList;

    public Basket() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float calculatePrice() {
        return (float) itemList.stream().map(Item::calculatePrice).mapToDouble(Double::valueOf).sum();
    }
}
