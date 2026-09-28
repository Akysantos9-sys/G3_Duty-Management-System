package com.example.g3_duty_management_system.Quarter2.MiniPeta3;
import org.junit.Test;

public class noli {
    @Test
    public void TaskManagement() {

        System.out.println("===== TASK MANAGEMENT SERVICE =====");
        System.out.println("Choose a task:");
        System.out.println("1. Chair");
        System.out.println("2. Collect Trash");
        System.out.println("3. Throw Trash");
        System.out.print("Enter your choice (1-3): ");

        int choice = (1-3);

        String taskName;
        String taskDescription;
        String dueDate;
        String priority;

        switch (choice) {

            case 1:
                taskName = "Chair";
                taskDescription = "Arrange the Chair .";
                dueDate = "July 22, 2026";
                priority = "High";
                break;

            case 2:
                taskName = "Collect Trash";
                taskDescription = "Pick any Trash in the room.";
                dueDate = "July 20, 2026";
                priority = "Medium";
                break;

            case 3:
                taskName = "Throw Trash";
                taskDescription = "Throw the Collected Trash in bigger Trash can.";
                dueDate = "July 25, 2026";
                priority = "High";
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("\n===== TASK DETAILS =====");
        System.out.println("Task Name: " + taskName);
        System.out.println("Description: " + taskDescription);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Priority: " + priority);
    }
}