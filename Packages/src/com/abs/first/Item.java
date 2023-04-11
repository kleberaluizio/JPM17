package com.abs.first;

public class Item {
    private String type;
    private double price;

    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
