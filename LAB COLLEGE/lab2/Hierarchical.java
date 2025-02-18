class Vehicle {
    String brand;
    double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String fuelType;

    public Car(String brand, double speed, String fuelType) {
        super(brand, speed); 
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bike extends Vehicle {
    double engineCapacity;

    public Bike(String brand, double speed, double engineCapacity) {
        super(brand, speed); 
        this.engineCapacity = engineCapacity;
    }

    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", 180, "Petrol");
        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\n----------------------\n");

        Bike bike = new Bike("Yamaha", 120, 150);
        System.out.println("Bike Details:");
        bike.displayDetails();
    }
}
