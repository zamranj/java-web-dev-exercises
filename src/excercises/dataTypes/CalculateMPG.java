package excercises.dataTypes;

import java.util.Scanner;

public class CalculateMPG {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mph;
        System.out.println("Enter miles driven: ");
        String miles = input.nextLine();
        System.out.println("Enter gas consumed:  ");
        String gasUsed = input.nextLine();
        mph = Integer.parseInt(miles)/Integer.parseInt(gasUsed);
        System.out.println("Mile per gallon: "+ mph+"mpg");

    }
}
