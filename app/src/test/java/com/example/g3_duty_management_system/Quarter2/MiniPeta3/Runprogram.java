package com.example.g3_duty_management_system.Quarter2.MiniPeta3;


import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Runprogram {

    @Test
    public void testMainMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.Menu(new Scanner("3\n"));
    }

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.Menu(new Scanner(System.in));
    }

    public static class MainMenu {

    private String correctUsername = "Aky";
    private String correctPassword = "byehonors";

    public void Menu(Scanner scanner) {

        boolean running = true;

        while (running && scanner.hasNextLine()) {

            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Schedule Planner");
            System.out.println("2. Task Management Service");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    schedulePlanner(scanner);
                    break;

                case "2":
                    taskManagement(scanner);
                    break;

                case "3":
                    running = false;
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }




    private boolean authenticate(Scanner scanner) {

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername)
                && password.equals(correctPassword)) {

            System.out.println("Login successful!");
            System.out.println("Welcome, " + username + "!");

            logActivity(username, "Login", "");

            return true;

        } else {

            System.out.println("Invalid username or password.");
            return false;
        }
    }




    private void schedulePlanner(Scanner scanner) {

        System.out.println("\n===== SCHEDULE PLANNER =====");

        if (!authenticate(scanner)) {
            return;
        }

        boolean scheduling = true;

        while (scheduling && scanner.hasNextLine()) {

            System.out.println("\n1. Create Schedule");
            System.out.println("2. Back");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {

                System.out.print("Enter date: ");
                String date = scanner.nextLine();

                System.out.print("Enter event name: ");
                String eventName = scanner.nextLine();

                System.out.println("\nSchedule Created!");
                System.out.println("Date: " + date);
                System.out.println("Event: " + eventName);

                logActivity(
                        correctUsername,
                        "Create Schedule",
                        ""
                );

            } else if (choice.equals("2")) {

                scheduling = false;

            } else {

                System.out.println("Invalid choice.");
            }
        }
    }



    private void taskManagement(Scanner scanner) {

        System.out.println("\n===== TASK MANAGEMENT SERVICE =====");

        System.out.println("1. Add Task");
        System.out.println("2. View Task");
        System.out.println("3. Back");
        System.out.print("Enter choice: ");

        String choice = scanner.nextLine();

        if (choice.equals("1")) {

            System.out.print("Enter task name: ");
            String taskName = scanner.nextLine();

            System.out.print("Enter task description: ");
            String taskDescription = scanner.nextLine();

            System.out.print("Enter due date: ");
            String dueDate = scanner.nextLine();

            System.out.print("Enter priority: ");
            String priority = scanner.nextLine();

            System.out.println("\nTask Created!");
            System.out.println("Task Name: " + taskName);
            System.out.println("Description: " + taskDescription);
            System.out.println("Due Date: " + dueDate);
            System.out.println("Priority: " + priority);

            logActivity(
                    correctUsername,
                    "Create Task",
                    ""
            );

        } else if (choice.equals("2")) {

            System.out.println("No saved tasks.");

        } else if (choice.equals("3")) {

            return;

        } else {

            System.out.println("Invalid choice.");
        }
    }



    private void logActivity(
            String username,
            String actionType,
            String oldValue) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String timestamp = now.format(formatter);

        System.out.println("\n--- Activity Log ---");
        System.out.println("Username: " + username);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Action/Event: " + actionType);
        System.out.println("Old/New Value: " + oldValue);
    }
}
}
