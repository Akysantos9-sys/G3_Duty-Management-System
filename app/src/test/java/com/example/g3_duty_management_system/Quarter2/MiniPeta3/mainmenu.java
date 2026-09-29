package com.example.g3_duty_management_system.Quarter2.MiniPeta3;

import java.util.Scanner;

public class mainmenu {
    public void main(String[] args) {

        MainMenu mainMenu = new MainMenu();
        mainMenu.Menu(new Scanner(System.in));
    }

    public class MainMenu {
        public void Menu(Scanner menuinput) {
            boolean choosing = true;

            do {
                System.out.println("=====MAIN MENU=====");
                System.out.println("1. ");
                System.out.println("2. Exit");
                System.out.print("Please choose an option (1, 2,): ");
                String choice = menuinput.nextLine(); //Integers do not work as choices since ByteArrayInputStream converts the automation into string
                System.out.println(choice);
                if (choice.equals("1")) {
                    Sceduleplanner scheduler = new Sceduleplanner();
                    Sceduleplanner scheduleManager = new Sceduleplanner();
                    scheduler.Schedules(menuinput, scheduleManager);
                    choosing = false;
                } else if (choice.equals("2")) {
                    System.out.println("Goodbye!");
                    break;
                } else {
                    System.out.println("===================");
                    System.out.println("Invalid choice please try again.");
                    System.out.println("===================");
                }

            } while (choosing);
        }
    }
}
