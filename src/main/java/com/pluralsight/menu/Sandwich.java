package com.pluralsight.menu;

import java.util.List;

public class Sandwich extends Order {

    //Properties
    private String breadType;
    private List<String> meatToppings;
    private List<String> cheeseToppings;
    private List<String> regularToppings;
    private List<String> sauces;
    private boolean isToasted;

    // Constructor
    public Sandwich(String size, double price, String type, String breadType, List<String> meatToppings, List<String> cheeseToppings, List<String> regularToppings, List<String> sauces, boolean isToasted) {
        super(size, price, "Sandwich");
        this.breadType = breadType;
        this.meatToppings = meatToppings;
        this.cheeseToppings = cheeseToppings;
        this.regularToppings = regularToppings;
        this.sauces = sauces;
        this.isToasted = isToasted;
    }

    //Getters and Setters
    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<String> getMeatToppings() {
        return meatToppings;
    }

    public void setMeatToppings(List<String> meatToppings) {
        this.meatToppings = meatToppings;
    }

    public List<String> getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(List<String> cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public List<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }



    @Override
    public double getTotal() {
        double total = this.price;

        total += meatToppings.size()* getToppingPrice("meat");

        total += cheeseToppings.size()* getToppingPrice("cheese");

        return total;
    }

    private double getToppingPrice(String type) {
        if (type.equalsIgnoreCase("meat")) {
            return switch (size) {
                case "4" -> 0.50;
                case "8" -> 1.00;
                case "12" -> 1.50;
                default -> 0.00;
            };
        } else if (type.equalsIgnoreCase("cheese")) {
            return switch (size) {
                case "4" -> 0.30;
                case "8" -> 0.60;
                case "12" -> 0.90;
                default -> 0.00;
            };
        }
        return 0.00;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(size).append("-inch ").append(breadType).append(" Bread Sandwich [");

        if (!meatToppings.isEmpty()) {
            sb.append("Meat: ").append(String.join(", ", meatToppings)).append("; ");
        }
        if (!cheeseToppings.isEmpty()) {
            sb.append("Cheese: ").append(String.join(", ", cheeseToppings)).append("; ");
        }
        if (!regularToppings.isEmpty()) {
            sb.append("Toppings: ").append(String.join(", ", regularToppings)).append("; ");
        }
        if (!sauces.isEmpty()) {
            sb.append("Sauces: ").append(String.join(", ", sauces)).append("; ");
        }

        sb.append("Toasted: ").append(isToasted ? "Yes" : "No").append("]");

        return sb.toString();
    }
}

