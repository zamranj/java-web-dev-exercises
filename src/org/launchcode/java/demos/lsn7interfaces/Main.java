package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        System.out.println(flavors);
        System.out.print("*****Before*****\n");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);
        flavors.sort(new FlavorComparator());
        System.out.print("\n*****After******\n");
        for(Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }
        System.out.println("\n====================================\n");
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.print("Before\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName()+": $"+cone.getCost());
        }
        cones.sort(new ConeComparator());
        System.out.print("\nAfter\n");
        for (Cone cone : cones) {
            System.out.println(cone.getName()+": $"+cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        //TODO: Create a Topping choose how to sort a toppings array in Main.



    }
}
