// Base class: Vehicle
class Vehicle {
    String brand;
    double speed;

    // Constructor
    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Derived class: Car
class Car extends Vehicle {
    String fuelType;

    // Constructor
    public Car(String brand, double speed, String fuelType) {
        super(brand, speed); // Calling the base class constructor
        this.fuelType = fuelType;
    }

    // Method to display car details
    public void displayDetails() {
        super.displayDetails(); // Calls base class method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived class: Bike
class Bike extends Vehicle {
    double engineCapacity;

    // Constructor
    public Bike(String brand, double speed, double engineCapacity) {
        super(brand, speed); // Calling the base class constructor
        this.engineCapacity = engineCapacity;
    }

    // Method to display bike details
    public void displayDetails() {
        super.displayDetails(); // Calls base class method
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

// Main class to test the application
public class Hierarchical {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car("Toyota", 180, "Petrol");
        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\n----------------------\n");

        // Creating a Bike object
        Bike bike = new Bike("Yamaha", 120, 150);
        System.out.println("Bike Details:");
        bike.displayDetails();
    }
}
