package org.example;

import java.io.*;
import java.util.*;
public class Task {
    private int id;
    private String name;
    private String description;

    public Task(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + description;
    }

    public static Task fromString(String taskString) {
        String[] parts = taskString.split(",");
        return new Task(Integer.parseInt(parts[0]), parts[1], parts[2]);
    }
}
