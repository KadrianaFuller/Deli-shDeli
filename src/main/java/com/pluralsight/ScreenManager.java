package com.pluralsight;

import com.pluralsight.menu.Chips;
import com.pluralsight.menu.Drinks;
import com.pluralsight.menu.Order;
import com.pluralsight.menu.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScreenManager {

    private List<Order> currentOrder = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public void showSplashScreen() {
        // Display the logo
        showLogo();

        // Wait for 5 seconds
        try {
            Thread.sleep(5000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
            System.out.println("An error occurred during the splash screen delay.");
            Thread.currentThread().interrupt();
        }

        // Load the home screen
        showHomeScreen();
    }

    private void showLogo() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                                                      ║");
        System.out.println("║   ██████╗ ███████╗██╗     ██╗ ██████╗ ███████╗       ║");
        System.out.println("║   ██╔══██╗██╔════╝██║     ██║██╔════╝ ██╔════╝       ║");
        System.out.println("║   ██║  ██║█████╗  ██║     ██║██║  ███╗███████╗       ║");
        System.out.println("║   ██║  ██║██╔══╝  ██║     ██║██║   ██║╚════██║       ║");
        System.out.println("║   ██████╔╝███████╗███████╗██║╚██████╔╝███████║       ║");
        System.out.println("║   ╚═════╝ ╚══════╝╚══════╝╚═╝ ╚═════╝ ╚══════╝       ║");
        System.out.println("║                                                      ║");
        System.out.println("║         Welcome to DELI-cious Sandwich Shop          ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

    }


    public void showHomeScreen() {
        while (true) {
            System.out.println("╔══════════════════════════════════════════════════════════╗");
            System.out.println("║               Welcome to DELI-sh DELI                    ║");
            System.out.println("║            Where Delicious Meets DELI-cious              ║");
            System.out.println("╠══════════════════════════════════════════════════════════╣");
            System.out.println("║  1) Place New Order                                      ║");
            System.out.println("║  0) Exit                                                 ║");
            System.out.println("╚══════════════════════════════════════════════════════════╝");
            System.out.print("Enter your choice: ");
            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    showOrderScreen();
                    break;
                case "0":
                    System.out.println("Thank you for visiting! Come again!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void showOrderScreen() {
        while (true) {
            System.out.println("╔═══════════════════════════════════════════╗");
            System.out.println("║                Order Screen               ║");
            System.out.println("╠═══════════════════════════════════════════╣");
            System.out.println("║  1) Add Sandwich                          ║");
            System.out.println("║  2) Add Drink                             ║");
            System.out.println("║  3) Add Chips                             ║");
            System.out.println("║  4) Checkout                              ║");
            System.out.println("║  0) Cancel Order                          ║");
            System.out.println("╚═══════════════════════════════════════════╝");
            System.out.print("Enter your choice: ");
            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    addSandwich();
                    break;
                case "2":
                    addDrink();
                    break;
                case "3":
                    addChips();
                    break;
                case "4":
                    checkout();
                    break;
                case "0":
                    currentOrder.clear();
                    System.out.println("Order canceled. Returning to Home Screen.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }


    }

    private void addSandwich() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                 Select Sandwich Size                 ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  (1) 4-inch ($5.50)                                  ║");
        System.out.println("║  (2) 8-inch ($7.00)                                  ║");
        System.out.println("║  (3) 12-inch ($8.50)                                 ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        System.out.print("Enter size choice (1-3): ");

        String sizeOption = in.nextLine();
        String size;
        double basePrice;
        switch (sizeOption) {
            case "1":
                size = "4";
                basePrice = 5.50;
                break;
            case "2":
                size = "8";
                basePrice = 7.00;
                break;
            case "3":
                size = "12";
                basePrice = 8.50;
                break;
            default:
                System.out.println("Invalid choice. Returning to Order Screen.");
                return;
        }
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                  Select Bread Type                   ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  (1) White                                           ║");
        System.out.println("║  (2) Wheat                                           ║");
        System.out.println("║  (3) Rye                                             ║");
        System.out.println("║  (4) Italian Herb and Cheese                         ║");
        System.out.println("║  (5) Wrap                                            ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        System.out.print("Enter bread choice (1-5): ");

        String breadChoice = in.nextLine();
        String breadType;
        switch (breadChoice) {
            case "1":
                breadType = "White";
                break;
            case "2":
                breadType = "Wheat";
                break;
            case "3":
                breadType = "Rye";
                break;
            case "4":
                breadType = "Italian Herb and Cheese";
                break;
            case "5":
                breadType = "Wrap";
                break;
            default:
                System.out.println("Invalid choice. Returning to Order Screen.");
                return;
        }

        List<String> meatToppings = new ArrayList<>();
        double extraMeatCost = 0;
        while (true) {
            System.out.println("╔══════════════════════════════════════════════════════╗");
            System.out.println("║                  Select Meat Toppings                ║");
            System.out.println("╠══════════════════════════════════════════════════════╣");
            System.out.println("║  (1) Steak                                           ║");
            System.out.println("║  (2) Ham                                             ║");
            System.out.println("║  (3) Salami                                          ║");
            System.out.println("║  (4) Roast Beef                                      ║");
            System.out.println("║  (5) Chicken                                         ║");
            System.out.println("║  (6) Bacon                                           ║");
            System.out.println("║  (0) Done                                            ║");
            System.out.println("╚══════════════════════════════════════════════════════╝");
            System.out.print("Enter your choice (1-6, 0 to finish): ");
            String meatChoice = in.nextLine();

            if (meatChoice.equals("0")) break;

            String meat;
            switch (meatChoice) {
                case "1":
                    meat = "Steak";
                    break;
                case "2":
                    meat = "Ham";
                    break;
                case "3":
                    meat = "Salami";
                    break;
                case "4":
                    meat = "Roast Beef";
                    break;
                case "5":
                    meat = "Chicken";
                    break;
                case "6":
                    meat = "Bacon";
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            meatToppings.add(meat);

            System.out.print("Would you like extra meat? (yes/no): ");
            if (in.nextLine().equalsIgnoreCase("yes")) {
                switch (size) {
                    case "4":
                        extraMeatCost += 0.50;
                        break;
                    case "8":
                        extraMeatCost += 1.00;
                        break;
                    case "12":
                        extraMeatCost += 1.50;
                        break;
                    default:
                        extraMeatCost += 0.00;
                        break;
                }
            }
        }
        List<String> cheeseToppings = new ArrayList<>();
        double extraCheeseCost = 0;
        while (true) {
            System.out.println("╔══════════════════════════════════════════════════════╗");
            System.out.println("║                 Select Cheese Toppings               ║");
            System.out.println("╠══════════════════════════════════════════════════════╣");
            System.out.println("║  (1) American                                        ║");
            System.out.println("║  (2) Pepper Jack                                     ║");
            System.out.println("║  (3) Provolone                                       ║");
            System.out.println("║  (4) Cheddar                                         ║");
            System.out.println("║  (5) Swiss                                           ║");
            System.out.println("║  (0) Done                                            ║");
            System.out.println("╚══════════════════════════════════════════════════════╝");
            System.out.print("Enter your choice (1-5, 0 to finish): ");
            String cheeseChoice = in.nextLine();

            if (cheeseChoice.equals("0")) break;

            String cheese;
            switch (cheeseChoice) {
                case "1":
                    cheese = "American";
                    break;
                case "2":
                    cheese = "Pepper Jack";
                    break;
                case "3":
                    cheese = "Provolone";
                    break;
                case "4":
                    cheese = "Cheddar";
                    break;
                case "5":
                    cheese = "Swiss";
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            cheeseToppings.add(cheese);

            System.out.print("Would you like extra cheese? (yes/no): ");
            if (in.nextLine().equalsIgnoreCase("yes")) {
                switch (size) {
                    case "4":
                        extraCheeseCost += 0.30;
                        break;
                    case "8":
                        extraCheeseCost += 0.60;
                        break;
                    case "12":
                        extraCheeseCost += 0.90;
                        break;
                    default:
                        extraCheeseCost += 0.00;
                        break;
                }
            }
        }
        List<String> regularToppings = new ArrayList<>();
        while (true) {
            System.out.println("╔══════════════════════════════════════════════════════╗");
            System.out.println("║                Select Regular Toppings               ║");
            System.out.println("╠══════════════════════════════════════════════════════╣");
            System.out.println("║  (1) Lettuce                                         ║");
            System.out.println("║  (2) Peppers                                         ║");
            System.out.println("║  (3) Onions                                          ║");
            System.out.println("║  (4) Tomatoes                                        ║");
            System.out.println("║  (5) Jalapenos                                       ║");
            System.out.println("║  (6) Cucumbers                                       ║");
            System.out.println("║  (7) Pickles                                         ║");
            System.out.println("║  (8) Mushrooms                                       ║");
            System.out.println("║  (9) Black Olives                                    ║");
            System.out.println("║  (0) Done                                            ║");
            System.out.println("╚══════════════════════════════════════════════════════╝");
            System.out.print("Enter your choice (1-9, 0 to finish): ");
            String toppingChoice = in.nextLine();

            if (toppingChoice.equals("0")) break;

            String topping;
            switch (toppingChoice) {
                case "1":
                    topping = "Lettuce";
                    break;
                case "2":
                    topping = "Peppers";
                    break;
                case "3":
                    topping = "Onions";
                    break;
                case "4":
                    topping = "Tomatoes";
                    break;
                case "5":
                    topping = "Jalapenos";
                    break;
                case "6":
                    topping = "Cucumbers";
                    break;
                case "7":
                    topping = "Pickles";
                    break;
                case "8":
                    topping = "Mushrooms";
                    break;
                case "9":
                    topping = "Black Olives";
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            regularToppings.add(topping);
        }
        List<String> sauces = new ArrayList<>();
        while (true){
            System.out.println("╔══════════════════════════════════════════════════════╗");
            System.out.println("║                     Select Sauces                    ║");
            System.out.println("╠══════════════════════════════════════════════════════╣");
            System.out.println("║  (1) Mayo                                            ║");
            System.out.println("║  (2) Mustard                                         ║");
            System.out.println("║  (3) Ranch                                           ║");
            System.out.println("║  (4) Ketchup                                         ║");
            System.out.println("║  (5) Thousand Island                                 ║");
            System.out.println("║  (6) Vinaigrette                                     ║");
            System.out.println("║  (0) Done                                            ║");
            System.out.println("╚══════════════════════════════════════════════════════╝");
            System.out.print("Enter your choice (1-6, 0 to finish):");

            String sauceChoice = in.nextLine();

            if (sauceChoice.equals("0")) break;


            String sauce;
            switch (sauceChoice) {
                case "1":
                    sauce = "Mayo";
                    break;
                case "2":
                    sauce = "Mustard";
                    break;
                case "3":
                    sauce = "Ranch";
                    break;
                case "4":
                    sauce = "Ketchup";
                    break;
                case "5":
                    sauce = "Thousand Island";
                    break;
                case "6":
                    sauce = "Vinaigrette";
                    break;
                default:
                    System.out.println("Invalid option. Please try again!");
                    continue;
            }
            sauces.add(sauce);
        }
        System.out.print("Would you like the sandwich toasted? (yes/no): ");
        boolean isToasted = in.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, basePrice, "Sandwich", breadType, meatToppings, cheeseToppings, regularToppings, sauces, isToasted);
        currentOrder.add(sandwich);

        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║             Sandwich Added to Order!                 ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

    }

    private void addDrink() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                 Select Drink                         ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  (1) Water                                           ║");
        System.out.println("║  (2) Lemonade                                        ║");
        System.out.println("║  (3) Fanta Strawberry                                ║");
        System.out.println("║  (4) Coke                                            ║");
        System.out.println("║  (5) Sprite                                          ║");
        System.out.println("║  (6) Sweet Tea                                       ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        System.out.print("Enter your drink choice (1-6): ");

        String drinkChoice = in.nextLine();
        String flavor;
        switch (drinkChoice) {
            case "1":
                flavor = "Water";
                break;
            case "2":
                flavor = "Lemonade";
                break;
            case "3":
                flavor = "Fanta Strawberry";
                break;
            case "4":
                flavor = "Coke";
                break;
            case "5":
                flavor = "Sprite";
                break;
            case "6":
                flavor = "Sweet Tea";
                break;
            default:
                System.out.println("Invalid choice. Returning to Order Screen.");
                return;
        }
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                   Select Drink Size                  ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  (1) Small ($2.00)                                   ║");
        System.out.println("║  (2) Medium ($2.50)                                  ║");
        System.out.println("║  (3) Large ($3.00)                                   ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        System.out.print("Enter your size choice (1-3): ");

        String sizeChoice = in.nextLine();
        String size;
        double price;
        switch (sizeChoice) {
            case "1":
                size = "Small";
                price = 2.00;
                break;
            case "2":
                size = "Medium";
                price = 2.50;
                break;
            case "3":
                size = "Large";
                price = 3.00;
                break;
            default:
                System.out.println("Invalid choice. Returning to Order Screen.");
                return;
        }
        Drinks drink = new Drinks(size, price, flavor);
        currentOrder.add(drink);

        // Confirmation message
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                Drink Added to Order!                 ║");
        System.out.println("║                " + size + " " + flavor + "           ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

    }

    private void addChips() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║              You have selected to add chips          ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.println("║  (1) Kettle Jalapeno Lays                            ║");
        System.out.println("║  (2) Plain Lays                                      ║");
        System.out.println("║  (3) Cheddar Sun Chips                               ║");
        System.out.println("║  (4) Nacho Cheese Doritos                            ║");
        System.out.println("║  (5) Aunt Vickie's BBQ Chips                         ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        System.out.print("Enter your chip choice (1-5): ");

        String chipChoice = in.nextLine();
        String type;
        switch (chipChoice) {
            case "1":
                type = "Kettle Jalapeno Lays";
                break;
            case "2":
                type = "Plain Lays";
                break;
            case "3":
                type = "Cheddar Sun Chips";
                break;
            case "4":
                type = "Nacho Cheese Doritos";
                break;
            case "5":
                type = "Aunt Vickie's BBQ Chips";
                break;
            default:
                System.out.println("Invalid choice. Returning to Order Screen.");
                return;
        }
        Chips chips = new Chips(type);
        currentOrder.add(chips);

        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║              Chips Added to Order!                   ║");
        System.out.println("║              " + type + "                            ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

    }

    private void checkout() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║                      Checkout                        ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");



    }
}


