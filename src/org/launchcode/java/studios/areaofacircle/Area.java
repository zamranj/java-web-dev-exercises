package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area = 0;
        System.out.println("Enter a radius: ");
        String radius = input.nextLine();
        try {
            while (Double.parseDouble(radius) < 0) {
                System.out.println("Enter a radius: ");
                radius = input.nextLine();
            }
            area = Circle.getArea(Double.parseDouble(radius));
            System.out.println("The area of the circle of radius " + radius + " is: " + area);
        } catch (NumberFormatException nfe) {
            System.out.println(nfe +" Is not numeric value. Please enter numeric values only");
        }
    }

}
