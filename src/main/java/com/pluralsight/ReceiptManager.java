package com.pluralsight;

import com.pluralsight.menu.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptManager {

    public String generateReceipt(List<Order> currentOrder, double total) {
        //String builder to build the receipt
        StringBuilder receipt = new StringBuilder();
        receipt.append("DELI-sh Sandwich Shop Receipt\n");
        receipt.append("=================================\n");

        // Loop through the order and format each item's details
        for (Order order : currentOrder) {
            receipt.append(String.format("%-40s $%-6.2f%n", order.toString(), order.getTotal()));
        }
        // Add the total price
        receipt.append("=================================\n");
        receipt.append(String.format("Total Price: $%-6.2f%n", total));
        receipt.append("Thank you for your order!\n");

        return receipt.toString(); // returns receipt as a string
    }

    public void saveReceipt(String receiptContent) {
        try {
            // Generate a timestamp for the file name ( Receipts20241114-163000.txt )
            String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
            String fileName = "src/main/resources/Receipts" + timeStamp + ".txt";

            // Initialize BufferedWriter to write to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            // Write receipt content to the file
            writer.write(receiptContent);

            // Notify the user of success
            System.out.println("Receipt saved to: " + fileName);

            // close the writer
            writer.close();
        } catch (IOException e) {
            // Handle any IO exceptions that occur
            System.out.println("An error occurred while saving the receipt: " + e.getMessage());
        }

    }




}
