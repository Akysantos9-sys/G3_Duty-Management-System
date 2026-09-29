package com.example.g3_duty_management_system.Quarter2.MiniPeta3;

import java.util.Scanner;

public class SantosUserAuthentication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctUsername = "Aky";
        String correctPassword = "byehonors";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
            System.out.println("Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
