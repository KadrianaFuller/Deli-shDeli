package com.pluralsight.menu;

public class Drinks extends Order{

    private String type;

    // Constructor
    public Drinks(String size, double price, String flavor) {
        super(size, price, "Drink");
        this.type = flavor;
    }

    // Getter and Setter
    public String getFlavor() {
        return type;
    }
    public void setFlavor(String flavor) {
        this.type = flavor;
    }

    // Override getTotal to return the price (no additional charges for drinks)
    @Override
    public double getTotal() {
        return this.price;
    }


    @Override
    public String toString() {
        return "Drink: " + type;
    }
}
