package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class Menu {

   private final ArrayList<MenuItems> items;
   private String category;

   public Menu(String category){
       this.category = category;
       this.items = new ArrayList<>();
   }

   public boolean addItem(String item, Double price){
       MenuItems findItem = findItem(item);
       if(findItem == null){
           items.add(new MenuItems(item, price));
           System.out.println("Item added");
           return true;
       }else {
           System.out.println("Item exists. Try again");
           return false;
       }
   }

    private MenuItems findItem(String myItem) {
       for(MenuItems item: this.items){
           if(item.getItemName().equals(myItem)){
               return item;
           }
       }
        return null;
    }


}
