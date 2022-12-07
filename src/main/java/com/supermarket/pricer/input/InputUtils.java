package com.supermarket.pricer.input;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.item.ItemHolder;

import java.util.Optional;
import java.util.Scanner;

import static com.supermarket.pricer.output.Constants.*;
import static com.supermarket.pricer.output.OutputColor.RED;
import static com.supermarket.pricer.output.OutputHandler.print;

public class InputUtils {

    private static final String YES = "Y";
    private static final String NO = "N";

    private InputUtils() {
    }

    public static boolean checkIfBasketIsReady(Scanner userInput) {
        print(FINISHED_ADDING_ITEMS_TO_YOUR_BASKET);
        String input = userInput.nextLine().toUpperCase();
        if (input.trim().equals(YES)) {
            return true;
        } else if (input.trim().equals(NO)) {
            return false;
        } else {
            print(INVALID_INPUT, RED);
            return checkIfBasketIsReady(userInput);
        }
    }

    public static Item readProductId(Scanner userInput) {
        try {
            int id = Integer.parseInt(userInput.nextLine());
            Optional<Item> item = ItemHolder.getItemById(id);
            if (!item.isPresent()) {
                print(NONEXISTENT_PRODUCT_ID, RED);
                return readProductId(userInput);
            }
            return item.get();
        } catch (NumberFormatException e) {
            print(INVALID_PRODUCT_ID, RED);
            return readProductId(userInput);
        }
    }

    public static int readProductQuantity(Scanner userInput) {
        try {
            return Integer.valueOf(userInput.nextLine());
        } catch (NumberFormatException e) {
            print(INVALID_NUMBER, RED);
            return readProductQuantity(userInput);
        }
    }
}
