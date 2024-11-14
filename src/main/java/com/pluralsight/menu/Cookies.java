package com.pluralsight.menu;

public class Cookies extends Order {

    private String flavor;



    public Cookies(String type) {
        super("one size",1.50,"cookies");
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
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
