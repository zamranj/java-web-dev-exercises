package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(cheshireCat.noise());

        HouseCat tom = new HouseCat("Thomas", 12.5);




    }
}
