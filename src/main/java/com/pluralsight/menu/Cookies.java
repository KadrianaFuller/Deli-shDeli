package com.pluralsight.menu;

public class Cookies extends Order {

    public Cookies(String type) {
        super("one size",1.50,"cookies");
        this.type = type;
    }

    @Override
    public double getTotal() {
        return this.price;
    }

    @Override
    public String toString() {
        return type + " Cookie";
    }
}
