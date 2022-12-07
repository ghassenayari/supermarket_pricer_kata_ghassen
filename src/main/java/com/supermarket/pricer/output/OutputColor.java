package com.supermarket.pricer.output;

public enum OutputColor {

    DEFAULT("\u001B[37m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m");
    private final String color;

    OutputColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
