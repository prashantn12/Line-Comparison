package com.linecomparison;
import java.util.*;

public class CheckLengthEquality {
    public static double getLengthLine1(int x1, int y1, int x2, int y2){
        return Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1)));
    }
    public static double getLengthLine2(int _x1, int _y1, int _x2, int _y2){
        return Math.sqrt(((_x2 - _x1)*(_x2 - _x1)) + ((_y2- _y1)*(_y2- _y1)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter end points for Line1");
        System.out.println("Enter First point x-coordinate, x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter First point y-coordinate, y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter Second point x-coordinate, x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter Second point y-coordinate y2: ");
        int y2 = sc.nextInt();

        System.out.println("Enter end points for Line2");
        System.out.println("Enter First point x-coordinate, x1: ");
        int _x1 = sc.nextInt();
        System.out.println("Enter First point y-coordinate, y1: ");
        int _y1 = sc.nextInt();
        System.out.println("Enter Second point x-coordinate, x2: ");
        int _x2 = sc.nextInt();
        System.out.println("Enter Second point y-coordinate y2: ");
        int _y2 = sc.nextInt();

        double len1 = getLengthLine1(x1, y1, x2, y2);
        double len2 = getLengthLine2(_x1, _y1, _x2, _y2);
        System.out.println("Length of given Line having points "+"("+x1+","+y1+")"+"  "+"("+x2+","+y2+")"+" is: "+len1);
        System.out.println("Length of given Line having points "+"("+_x1+","+_y1+")"+"  "+"("+_x2+","+_y2+")"+" is: "+len2);

        String l1 = Double.toString(len1);
        String l2 = Double.toString(len2);
        boolean equal = l1.equals(l2);
        System.out.println("Equality of two lines : "+equal);

    }
}
