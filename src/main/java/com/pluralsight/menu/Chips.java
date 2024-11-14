package com.pluralsight.menu;

public class Chips extends Order {

    private String flavor;

    public Chips(String type) {
        super("One Size", 1.50, "Chips"); // Fixed size, price, and type
        this.type = type;
    }

    public String getFlavor() {
        return type;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double getTotal() {
        return this.price; // Fixed price for chips
    }

    @Override
    public String toString() {
        return size + " " + type;
    }
}
