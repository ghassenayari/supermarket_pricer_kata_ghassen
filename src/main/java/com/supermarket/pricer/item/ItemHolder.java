package com.supermarket.pricer.item;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import static com.supermarket.pricer.promotion.PromotionFactory.getPromotionType;
import static com.supermarket.pricer.promotion.PromotionType.THREE_FOR_ONE_DOLLAR;

public class ItemHolder {
    private static Map<Integer, Item> items = new LinkedHashMap<>();

    static {
        items.put(1, new Item("bean can", new BigDecimal("2"), getPromotionType(THREE_FOR_ONE_DOLLAR).get()));
        items.put(2, new Item("water bottle", new BigDecimal("3")));
        items.put(3, new Item("pasta pack", new BigDecimal("5")));
    }

    private ItemHolder() {
    }

    public static Optional<Item> getItemById(int id) {
        Item inputType = items.get(id);
        return Optional.ofNullable(inputType);
    }

    public static String getItemList() {
        StringBuilder itemList = new StringBuilder();
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            itemList.append("Id: " + entry.getKey() + ", product name: " + entry.getValue().getName()
                    + ", price: " + entry.getValue().getPrice());
            if (entry.getValue().getPromotion() != null) {
                itemList.append(", promotion: " + entry.getValue().getPromotion().getClass().getSimpleName());
            }
            itemList.append("\n");
        }
        return itemList.toString();
    }
}
