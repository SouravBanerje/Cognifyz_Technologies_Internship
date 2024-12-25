package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final String FILE_NAME = "tasks.txt";
    private List<Task> tasks = new ArrayList<>();

    public TaskManager() {
        loadTasks();
    }

    public void addTask(Task task) {
        tasks.add(task);
        saveTasks();
    }

    public void updateTask(int id, String newName, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                tasks.set(tasks.indexOf(task), new Task(id, newName, newDescription));
                saveTasks();
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        saveTasks();
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task.getId() + ": " + task.getName() + " - " + task.getDescription());
        }
    }

    private void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Task task : tasks) {
                writer.write(task.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    private void loadTasks() {
        tasks.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(Task.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}
