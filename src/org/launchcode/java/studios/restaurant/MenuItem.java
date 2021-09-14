package org.launchcode.java.studios.restaurant;

import java.util.HashMap;

public class MenuItem {
    private HashMap <String, Integer> itemName;
    private String catagory;

    public MenuItem(String catagory){
        this.catagory = catagory;
        this.itemName = new HashMap<>();
    }
}
