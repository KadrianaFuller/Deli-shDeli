package com.pluralsight.menu;

import java.util.List;

public class Combo {

    private String name;
    private Sandwich sandwich;
    private Chips chips;
    private Drinks drink;
    private String cookie;
    private double price;

    public Combo(String name, Sandwich sandwich, Chips chips, Drinks drink, String cookie, double price) {
        this.name = name;
        this.sandwich = sandwich;
        this.chips = chips;
        this.drink = drink;
        this.cookie = cookie;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public Chips getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public Drinks getDrink() {
        return drink;
    }

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Combo getCombo(String type) {
        switch (type.toLowerCase()) {
            case "watiee wrap combo":
                return new Combo(
                        "Watiee Wrap Combo",
                        new Sandwich("8", 8.00, "Watiee Wrap", "Wrap",
                                List.of("Turkey", "Chicken"),
                                List.of("Pepper Jack", "American"),
                                List.of("Spinach"),
                                List.of("Mayo"),
                                false),
                        new Chips("Plain Lays"),
                        new Drinks("Medium", 2.50, "Lemonade"),
                        "Chocolate Chip Cookie",
                        12.50 // Total combo price
                );
            case "mack attack combo":
                return new Combo(
                        "Mack Attack Combo",
                        new Sandwich("8", 8.00, "Mack Attack", "Italian Herb and Cheese",
                                List.of("Chicken", "Turkey", "Ham"),
                                List.of("Cheddar"),
                                List.of("Lettuce", "Cucumbers", "Jalapenos"),
                                List.of("Mustard", "Ranch"),
                                false),
                        new Chips("Nacho Cheese Doritos"),
                        new Drinks("Large", 3.00, "Coke"),
                        "Oatmeal Raisin Cookie",
                        13.00 // Total combo price
                );
            default:
                return null; // Invalid combo
        }
    }
    @Override
    public String toString() {
        return name + ": " + sandwich + ", Chips: " + chips + ", Drink: " + drink + ", Cookie: " + cookie + " - $"
                + String.format("%.2f", price);
    }
}





