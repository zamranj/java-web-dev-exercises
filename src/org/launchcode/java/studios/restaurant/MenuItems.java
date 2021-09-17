package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MenuItems {

    private final String itemName;
    private final Double price;
    private final Date updateDate = new Date();

    public MenuItems(String itemName, Double price){
        this.itemName = itemName;
        this.price = price;
        updateDate.setTime(Calendar.DAY_OF_YEAR);
    }

    public String getItemName() {
        return itemName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", updateDate=" + updateDate +
                '}';
    }
}
