package excercises.dataTypes;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float area;
        System.out.println("Enter the height: ");
        String height = input.nextLine();
        System.out.println("Enter the width: ");
        String width = input.nextLine();
        area = Float.parseFloat(height)*Float.parseFloat(width);
        System.out.println("Area of rectangle: "+area);
    }
}
