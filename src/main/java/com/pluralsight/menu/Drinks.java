package com.pluralsight.menu;

public class Drinks extends Order{



    // Constructor
    public Drinks(String size, double price, String type) {
        super(size, price, "Drink");
        this.type = type;
    }

    // Override getTotal to return the price (no additional charges for drinks)
    @Override
    public double getTotal() {
        return this.price;
    }


    @Override
    public String toString() {
        return size + " " + type; // Example: "Medium Lemonade"
    }
}
