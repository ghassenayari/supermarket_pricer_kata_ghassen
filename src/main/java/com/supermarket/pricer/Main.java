package com.supermarket.pricer;

import com.supermarket.pricer.item.Basket;
import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.item.ItemHolder;

import java.util.Scanner;

import static com.supermarket.pricer.input.InputUtils.*;
import static com.supermarket.pricer.output.Constants.*;
import static com.supermarket.pricer.output.OutputColor.GREEN;
import static com.supermarket.pricer.output.OutputHandler.print;

/**
 * Main entry class.
 */

public class Main {

    static Basket basket = new Basket();

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        print(WELCOME, GREEN);
        readProductRecursively(userInput);
    }

    private static void readProductRecursively(Scanner userInput) {
        print(SELECTION_MESSAGE);
        print(ItemHolder.getItemList());
        Item item = readProductId(userInput);
        print(QUANTITY_MSG + item.getName());
        int productQuantity = readProductQuantity(userInput);
        item.setQuantity(productQuantity);
        basket.addItem(item);
        boolean basketIsReady = checkIfBasketIsReady(userInput);
        if (basketIsReady) {
            print(TOTAL_BASKET_PRICE + basket.calculatePrice());
        } else {
            readProductRecursively(userInput);
        }
    }
}

