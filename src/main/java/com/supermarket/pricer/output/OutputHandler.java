package com.supermarket.pricer.output;

public class OutputHandler {

    public static void print(String text, OutputColor color) {
        System.out.println(color.getColor() + text + OutputColor.DEFAULT.getColor());
    }

    public static void print(String text) {
        System.out.println(text);
    }
}
