package com.supermarket.pricer.output;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Message constants are contained within this class.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
    public static final String WELCOME = "Welcome to our Supermarket Pricer.";
    public static final String SELECTION_MESSAGE = "Please select the item ID that you want to add to your basket.";
    public static final String NONEXISTENT_PRODUCT_ID = "You have entered a non-existent ID, please select a valid product ID to continue.";
    public static final String INVALID_PRODUCT_ID = "Invalid input, please select a valid product ID to continue.";
    public static final String INVALID_NUMBER = "You have entered an invalid number, please select a valid number to continue.";
    public static final String FINISHED_ADDING_ITEMS_TO_YOUR_BASKET = "Have you finished adding items to your basket? (Y/N)";
    public static final String TOTAL_BASKET_PRICE = "Your total basket price is ";
    public static final String INVALID_INPUT = "Invalid input";
    public static final String QUANTITY_MSG = "How many items of do you want to add of: ";
    public static final String ERROR_WHEN_CREATING_INSTANCE_OF_PROMOTION = "Error when creating instance of Promotion";
    public static final String ERROR_WHEN_CREATING_INSTANCE_OF_CONVERTER = "Error when creating instance of Converter";
    public static final String ERROR_WHEN_LOADING_CSV = "Error when loading csv file";

}
