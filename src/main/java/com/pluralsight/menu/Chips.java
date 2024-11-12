package com.pluralsight.menu;

public class Chips extends Order {

    private String type;

    public Chips(String flavor) {
        super("One Size", 1.50, "Chips"); // Fixed size, price, and type
        this.type = flavor;
    }

    public String getFlavor() {
        return type;
    }

    public void setFlavor(String flavor) {
        this.type = flavor;
    }

    @Override
    public double getTotal() {
        return this.price; // Fixed price for chips
    }

    @Override
    public String toString() {
        return "Chips: " + type ;
    }
}
