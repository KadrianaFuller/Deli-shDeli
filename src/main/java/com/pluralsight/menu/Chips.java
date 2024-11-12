package com.pluralsight.menu;

public class Chips extends Order {

    private String flavor; // Flavor of the chips

    public Chips(String flavor) {
        super("One Size", 1.50, "Chips"); // Fixed size, price, and type
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
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
        return "Chips: " + flavor + ", Price: $" + price;
    }
}
