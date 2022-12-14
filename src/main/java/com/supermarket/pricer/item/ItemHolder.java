package com.supermarket.pricer.item;

import com.supermarket.pricer.item.datasource.ItemLoader;
import com.supermarket.pricer.item.datasource.LoaderFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import static com.supermarket.pricer.item.datasource.LoaderType.CSV;
import static com.supermarket.pricer.item.datasource.LoaderType.STATIC;

/**
 * ItemHolder is a responsible for loading items
 * from different item sources.
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemHolder {
    private static Map<Integer, Item> items = new LinkedHashMap<>();
    private static ItemLoader itemLoaderCsv = LoaderFactory.getLoader(CSV);
    private static ItemLoader itemLoaderStatic = LoaderFactory.getLoader(STATIC);

    static {
        itemLoaderStatic.load(items);
        itemLoaderCsv.load(items);
    }

    public static Optional<Item> getItemById(int id) {
        Item inputType = items.get(id);
        return Optional.ofNullable(inputType);
    }

    public static String getItemList() {
        StringBuilder itemList = new StringBuilder();
        items.entrySet().stream().forEach(e -> appendItemInfo(itemList, e));
        return itemList.toString();
    }

    private static void appendItemInfo(StringBuilder itemList, Map.Entry<Integer, Item> entry) {
        itemList.append("Id: " + entry.getKey() + ", product name: " + entry.getValue().getName()
                + ", price: " + entry.getValue().getPrice());
        if (entry.getValue().getPromotion() != null) {
            itemList.append(", promotion: " + entry.getValue().getPromotion().getClass().getSimpleName());
        }
        itemList.append("\n");
    }
}
