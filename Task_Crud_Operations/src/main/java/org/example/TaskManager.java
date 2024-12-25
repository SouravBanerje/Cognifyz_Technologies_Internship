package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager extends Task{
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int nextId = 1;

    static void createTask(Scanner scanner) {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        Task newTask = new Task(nextId++, name, description);
        tasks.add(newTask);
        System.out.println("Task created successfully!");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("\nList of Tasks:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }


    static void updateTask(Scanner scanner) {
        System.out.print("Enter the ID of the task to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Task task : tasks) {
            if (task.getId() == id) {
                System.out.print("Enter new task name (leave blank to keep current): ");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    task.setName(newName);
                }

                System.out.print("Enter new task description (leave blank to keep current): ");
                String newDescription = scanner.nextLine();
                if (!newDescription.isEmpty()) {
                    task.setDescription(newDescription);
                }

                System.out.println("Task updated successfully!");
                return;
            }
        }

        System.out.println("Task with ID " + id + " not found.");
    }

    static void deleteTask(Scanner scanner) {
        System.out.print("Enter the ID of the task to delete: ");
        int id = scanner.nextInt();

        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.remove(task);
                System.out.println("Task deleted successfully!");
                return;
            }
        }

        System.out.println("Task with ID " + id + " not found.");
    }

    }
