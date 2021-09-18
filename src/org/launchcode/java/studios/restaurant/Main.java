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
        menus.add(myMenu);
        myMenu = new Menu("Main course");
        myMenu.addItem("Rib Eye", 15.66);
        myMenu.addItem("Chicken Salad", 12.45);
        menus.add(myMenu);

        System.out.println("size of menus is: " + menus.size());
        for (Menu menu : menus) {
            System.out.println(menu);
        }

    }


}
