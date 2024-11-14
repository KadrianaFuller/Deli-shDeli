package com.pluralsight.menu;

import java.util.List;

public class Combo extends Order {

    // All properties that belong in my Combo.
    private String name;
    private Sandwich sandwich;
    private Chips chips;
    private Drinks drink;
    private Cookies cookie;

 // Constructor
    public Combo(String name, Sandwich sandwich, Chips chips, Drinks drink, Cookies cookie, double price) {
        super("One Size", price, "combo");
        this.name = name;
        this.sandwich = sandwich;
        this.chips = chips;
        this.drink = drink;
        this.cookie = cookie;
        this.price = price;
    }
 // Getters and Setters
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

    public Cookies getCookie() {
        return cookie;
    }

    public void setCookie(Cookies cookie) {
        this.cookie = cookie;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getTotal() {
        return this.price;
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
                        new Chips("Kettle Jalapeno Lays"),
                        new Drinks("Medium", 2.50, "Lemonade"),
                        new Cookies("Peanut Butter"),
                        12.50);
            case "mack attack combo":
                return new Combo(
                        "Mack Attack Combo",
                        new Sandwich("8", 8.00, "Mack Attack", "Italian Herb and Cheese",
                                List.of("Chicken", "Turkey", "Ham"),
                                List.of("Cheddar"),
                                List.of("Lettuce", "Cucumbers", "Jalapenos"),
                                List.of("Mustard", "Ranch"),
                                true),
                        new Chips("Nacho Cheese Doritos"),
                        new Drinks("Large", 3.00, "Fanta Strawberry"),
                        new Cookies("Oatmeal Raisin"),
                        24.00);
            default:
                System.out.println("Invalid combo type.");
                return null;
        }
    }

    @Override
    public String toString() {
        return String.format("Combo Name: %s\nSandwich: %s\nChips: %s\nDrink: %s\nCookie: %s\nPrice: $%.2f",
                name, sandwich, chips, drink, cookie, price);
    }
    }






