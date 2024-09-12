package com.linecomparison;
import java.util.*;

public class CompareLine {

    // Method to calculate the length of a line given two endpoints
    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to compare two lines based on their lengths using compareTo
    public static int compareLines(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double length1 = calculateLength(x1, y1, x2, y2); // Length of first line
        double length2 = calculateLength(x3, y3, x4, y4); // Length of second line

        // Using Double's compareTo method for comparison
        return Double.compare(length1, length2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input coordinates for the first line
        System.out.println("Enter the coordinates of the first line:");
        System.out.print("x1: ");
        int x1 = scanner.nextInt();
        System.out.print("y1: ");
        int y1 = scanner.nextInt();
        System.out.print("x2: ");
        int x2 = scanner.nextInt();
        System.out.print("y2: ");
        int y2 = scanner.nextInt();

        // Prompt user to input coordinates for the second line
        System.out.println("Enter the coordinates of the second line:");
        System.out.print("x3: ");
        int x3 = scanner.nextInt();
        System.out.print("y3: ");
        int y3 = scanner.nextInt();
        System.out.print("x4: ");
        int x4 = scanner.nextInt();
        System.out.print("y4: ");
        int y4 = scanner.nextInt();

        // Compare the two lines
        int result = compareLines(x1, y1, x2, y2, x3, y3, x4, y4);

        if (result == 0) {
            System.out.println("The lines are equal in length.");
        } else if (result > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The first line is shorter than the second line.");
        }

        scanner.close();
    }
}
