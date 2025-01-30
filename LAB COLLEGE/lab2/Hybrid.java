// Base class: SmartDevice
class SmartDevice {
    String deviceName;
    double powerConsumption; // in watts

    // Constructor
    public SmartDevice(String deviceName, double powerConsumption) {
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
    }

    // Method to display device details
    public void displayDetails() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Power Consumption: " + powerConsumption + " watts");
    }
}

// Interface: RemoteControl
interface RemoteControl {
    void turnOn();
    void turnOff();
}

// Interface: InternetConnectivity
interface InternetConnectivity {
    void connectToWiFi();
}

// SmartTV class: Extends SmartDevice and implements RemoteControl and InternetConnectivity
class SmartTV extends SmartDevice implements RemoteControl, InternetConnectivity {

    // Constructor
    public SmartTV(String deviceName, double powerConsumption) {
        super(deviceName, powerConsumption); // Calling parent class constructor
    }

    @Override
    public void turnOn() {
        System.out.println(deviceName + " is now turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(deviceName + " is now turned OFF.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println(deviceName + " is now connected to WiFi.");
    }

    // Overriding displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling the base class method
        System.out.println("This device supports WiFi connectivity.");
    }
}

// SmartLight class: Implements RemoteControl
class SmartLight implements RemoteControl {
    String deviceName;

    // Constructor
    public SmartLight(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void turnOn() {
        System.out.println(deviceName + " light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(deviceName + " light is now OFF.");
    }

    // Method to display details of SmartLight
    public void displayDetails() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("This device does not support WiFi connectivity.");
    }
}

// Main class to test the application
public class Hybrid {
    public static void main(String[] args) {
        // Creating a SmartTV object
        SmartTV tv = new SmartTV("Samsung Smart TV", 120);
        System.out.println("Smart TV Details:");
        tv.displayDetails();
        tv.turnOn();
        tv.connectToWiFi();
        tv.turnOff();

        System.out.println("\n----------------------\n");

        // Creating a SmartLight object
        SmartLight light = new SmartLight("Philips Smart Light");
        System.out.println("Smart Light Details:");
        light.displayDetails();
        light.turnOn();
        light.turnOff();
    }
}
