package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MenuItems {

    private final String itemName;
    private final Double price;
    private final LocalDate updateDate;

    public MenuItems(String itemName, Double price){
        this.itemName = itemName;
        this.price = price;
        updateDate = LocalDate.now();
    }

    public String getItemName() {
        return itemName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return itemName + ":" + "price $" +price +
                " Added On= " + updateDate +"\n";
    }
}
