package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    private static ArrayList<Menu> menus = new ArrayList<>();

    public static void main(String[] args) {
        Menu myMenu = new Menu("Appetizers");
        myMenu.addItem("Wings", 12.99);
        myMenu.addItem("Onion Rings", 8.99);
        myMenu.addItem("Fries", 7.99);
        myMenu.addItem("Fries", 7.99);//duplicate
        myMenu.addItem("Fried Pickels", 8.99);//duplicate
        myMenu.addItem("Chips and Salsa", 5.99);//duplicate
        menus.add(myMenu);
        print();
        myMenu.removeItem("Fries");
        print();
        myMenu = new Menu("Main course");
        myMenu.addItem("Rib Eye", 15.66);
        myMenu.addItem("Chicken Salad", 12.45);
        menus.add(myMenu);

        print();

        //remove an item





    }
    public static void print(){

        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }


}
