package com.pluralsight.menu;

public class Drinks extends Order{

    private String flavor;

    // Constructor
    public Drinks(String size, double price, String flavor) {
        super(size, price, "Drink");
        this.flavor = flavor;
    }

    // Getter and Setter
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Override getTotal to return the price (no additional charges for drinks)
    @Override
    public double getTotal() {
        return this.price;
    }


    @Override
    public String toString() {
        return "Drink: " + size + ", Flavor: " + flavor + ", Price: $" + price;
    }
}
