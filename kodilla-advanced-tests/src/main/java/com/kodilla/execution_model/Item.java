package com.kodilla.execution_model;

public class Item {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
