package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {
    Car test_car;

    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        assertEquals(10, test_car.getGasTankSize(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void gasTankLevelRange(){
        test_car.drive(500);
        assertEquals(0,test_car.getGasTankLevel(),0.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void gasTankLevelExceedingRange(){
        test_car.drive(600);
        assertTrue(test_car.getGasTankLevel() == 0);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test
    public void overTheLimit(){
        assertFalse(test_car.getGasTankLevel() > 10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverFillException(){
        test_car.addGas(5);
        fail("Shoudn't get here, car cannot have ore gas in the tank then the size of the tank");
    }
}
