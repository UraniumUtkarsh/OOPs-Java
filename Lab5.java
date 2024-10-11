import java.io.*;

// User-defined interface
interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

// Bicycle class implementing Vehicle interface
class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("Bicycle speed: " + speed + " gear: " + gear);
    }
}

// Bike class implementing Vehicle interface
class Bike implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("Bike speed: " + speed + " gear: " + gear);
    }
}

class FUNC {
    public static void main(String[] args) {
        // Create a Bicycle instance
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state:");
        bicycle.printStates();

        // Create a Bike instance
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state:");
        bike.printStates();
    }
}
