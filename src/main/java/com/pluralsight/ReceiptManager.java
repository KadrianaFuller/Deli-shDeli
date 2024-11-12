package com.pluralsight;

import com.pluralsight.menu.Order;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptManager {

    public String generateReceipt(List<Order> currentOrder, double total) {
        StringBuilder receipt = new StringBuilder();
        receipt.append("DELI-sh Sandwich Shop Receipt\n");
        receipt.append("=================================\n");

        // Loop through the order and format each item's details
        for (Order order : currentOrder) {
            receipt.append(String.format("%-40s $%-6.2f%n", order.toString(), order.getTotal()));
        }

        receipt.append("=================================\n");
        receipt.append(String.format("Total Price: $%-6.2f%n", total));
        receipt.append("Thank you for your order!\n");

        return receipt.toString();
    }

    public void saveReceipt(String receiptContent) {
        try {
            // Generate a timestamped filename with the required format
            String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
            String fileName ="src/main/resources/Receipts"+ timeStamp + ".txt";

            // Initialize the PrintWriter
            PrintWriter writer = new PrintWriter(fileName);

            // Write the receipt content to the file
            writer.print(receiptContent);

            // Notify the user
            System.out.println("Receipt saved to: " + fileName);

            // Close the writer
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving the receipt: " + e.getMessage());
        }

    }




}
