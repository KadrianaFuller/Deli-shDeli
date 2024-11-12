package com.pluralsight.menu;

public abstract class Order {

    protected String size;
    protected double price;
    protected String type;


    // Constructor

    public Order(String size, double price, String type) {
        this.size = size;
        this.price = price;
        this.type = type;
    }

    // Getters and Setters


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract double getTotal();

    @Override
    public String toString() {
        return "Order{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}

