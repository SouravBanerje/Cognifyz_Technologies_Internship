package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Task ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Task Description: ");
                    String description = scanner.nextLine();
                    manager.addTask(new Task(id, name, description));
                }
                case 2 -> {
                    System.out.print("Enter Task ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Task Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter New Task Description: ");
                    String description = scanner.nextLine();
                    manager.updateTask(id, name, description);
                }
                case 3 -> {
                    System.out.print("Enter Task ID to delete: ");
                    int id = scanner.nextInt();
                    manager.deleteTask(id);
                }
                case 4 -> manager.displayTasks();
                case 5 -> {
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}