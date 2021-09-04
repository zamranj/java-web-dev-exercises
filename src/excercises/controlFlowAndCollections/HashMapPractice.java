package excercises.controlFlowAndCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> studentID = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID and Name (or -1 to Exit):");
        int userId;
        do{
            System.out.print("Enter ID: ");
            userId = input.nextInt();
            if(userId > 0){
                System.out.print("Enter name: ");
                String name = input.next();
                studentID.put(userId, name);
            }

        }while (userId > 0);

        System.out.println("List of users and ID's:\n");
        for(Map.Entry<Integer, String> users : studentID.entrySet() ){
            System.out.println("Student ID: "+users.getKey()+ " Student name: "+users.getValue());
        }

    }

}

