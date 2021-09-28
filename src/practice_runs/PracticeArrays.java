package practice_runs;

import java.util.Scanner;

public class PracticeArrays {
    public static void main(String[] args) {
        int maxStudents = 30;

        String[] students = new String[maxStudents];
        double[] grades = new double[maxStudents];
        Scanner input = new Scanner(System.in);

        String newStudent;
        int numbOfStudents = 0;

        System.out.println("Enter your students( or Enter to finish: ");

        do {
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                students[numbOfStudents] = newStudent;
                numbOfStudents++;
            }

        }while (!newStudent.equals(""));



        for(int i=0; i < numbOfStudents; i++){
            System.out.println("Enter "+students[i]+"'s"+" grade: ");
            double grade = input.nextDouble();
            grades[i] = grade;

        }

        System.out.println("\nClass roster");
        double average = 0;
        for (int i = 0; i < numbOfStudents; i++ ){
            System.out.println(students[i]+"'s"+" grade is: "+ grades[i]);
            average += grades[i]/numbOfStudents;
        }

        System.out.println("Average grade "+ average);

    }
}
