package com.example.g3_duty_management_system.Quarter2.MiniPeta3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ActivityLogger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "Aky";
        String correctPassword = "byehonors";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Get current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String timestamp = currentTime.format(formatter);

        String actionTypeEventName = "LOGIN";
        String status;

        // Authentication
        if (username.equals(correctUsername)
                && password.equals(correctPassword)) {

            status = "Success";

            System.out.println("\nLogin successful!");
            System.out.println("Welcome, " + username + "!");

        } else {

            status = "Failed";

            System.out.println("\nInvalid username or password.");
        }

        // Activity Logger
        System.out.println("\n========== ACTIVITY LOGGER ==========");
        System.out.println("Username: " + username);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("ActionType/EventName: " + actionTypeEventName);
        System.out.println("Status: " + status);
        System.out.println("=====================================");

        scanner.close();
    }
}
