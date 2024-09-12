package com.linecomparison;
import java.util.*;

// Point class representing a point in 2D space
class Point {
    int x;
    int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Line class representing a line with two points
class Line implements Comparable<Line> {
    private Point start;
    private Point end;

    // Constructor
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Method to calculate the length of the line
    public double getLength() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    // Override equals method to check if two lines are the same
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // If the same object, return true
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // If the object is null or not of the same class, return false
        }
        Line other = (Line) obj;
        return (start.x == other.start.x && start.y == other.start.y && end.x == other.end.x && end.y == other.end.y) ||
                (start.x == other.end.x && start.y == other.end.y && end.x == other.start.x && end.y == other.start.y);
        // Compare both endpoints, allowing for reverse order of points
    }

    // Implement compareTo method to compare lines based on their lengths
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}

public class UsingOopConcept {
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

        // Create Point and Line objects
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        // Check if the two lines are equal
        if (line1.equals(line2)) {
            System.out.println("The lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }

        // Compare the lengths of the two lines
        int comparison = line1.compareTo(line2);

        if (comparison == 0) {
            System.out.println("The lines are equal in length.");
        } else if (comparison > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The first line is shorter than the second line.");
        }

        scanner.close();
    }
}
