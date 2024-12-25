package org.example;

import java.util.Scanner;

public class NumberPattern {
    
    public static  void printNumberPatterns(Scanner sc){
        System.out.println("Enter the number of rows for the pyramid pattern: ");
        int rows = sc.nextInt();

        System.out.println("Pyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
