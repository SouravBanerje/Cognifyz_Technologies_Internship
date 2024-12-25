package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TaskManager taskManager= new TaskManager();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Manager");
            System.out.println("1. Create Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    taskManager.createTask(scanner);
                    break;
                case 2:
                    taskManager.viewTasks();
                    break;
                case 3:
                    taskManager.updateTask(scanner);
                    break;
                case 4:
                    taskManager.deleteTask(scanner);
                    break;
                case 5:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}