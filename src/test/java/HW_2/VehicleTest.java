package HW_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setupThis() {
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("BMw", "Roadster", 2011);
    }

    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }


    @Test
    public void testCarIsCreatedWith4Wheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void testMotorcycleIsCreatedWith4Wheels() {

        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void testCarDevelopsSpeed60InTestDrivingMode() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void testMotorcycleDevelopsSpeed75InTestDrivingMode() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void testCaSpeed0InParkMode() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void testMotorcycleSpeed0InParkMode() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}