package com.example.g3_duty_management_system.Quarter2.MiniPeta3;

import org.junit.Test;

import java.util.Scanner;
public class VincentMiniPeta3 {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the 3 task choices available
        String[] tasks = {
                "Finish Math Homework",
                "Read Science Chapter 4",
                "Prepare History Presentation"
        };

        System.out.println("--- Student Task Management ---");
        System.out.println("Please choose a task to complete:\n");

        // Display the choices
        for (int i = 0; i < tasks.length; i++) {
            System.out.println("[" + (i + 1) + "] " + tasks[i]);
        }

        System.out.print("\nEnter your choice (1, 2, or 3): ");
        String input = scanner.nextLine().trim();

        // Process the selection
        switch (input) {
            case "1":
                System.out.println("\nAwesome! You have selected: '" + tasks[0] + "'. Good luck!");
                break;
            case "2":
                System.out.println("\nAwesome! You have selected: '" + tasks[1] + "'. Good luck!");
                break;
            case "3":
                System.out.println("\nAwesome! You have selected: '" + tasks[2] + "'. Good luck!");
                break;
            default:
                System.out.println("\nInvalid selection. Please run the program again and choose 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
}
