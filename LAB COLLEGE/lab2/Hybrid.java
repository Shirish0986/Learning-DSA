class SmartDevice {
    String deviceName;
    double powerConsumption; 

    public SmartDevice(String deviceName, double powerConsumption) {
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
    }

    public void displayDetails() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Power Consumption: " + powerConsumption + " watts");
    }
}

interface RemoteControl {
    void turnOn();
    void turnOff();
}

interface InternetConnectivity {
    void connectToWiFi();
}

class SmartTV extends SmartDevice implements RemoteControl, InternetConnectivity {

    public SmartTV(String deviceName, double powerConsumption) {
        super(deviceName, powerConsumption); 
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

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("This device supports WiFi connectivity.");
    }
}

class SmartLight implements RemoteControl {
    String deviceName;

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

    public void displayDetails() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("This device does not support WiFi connectivity.");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        
        SmartTV tv = new SmartTV("Samsung Smart TV", 120);
        System.out.println("Smart TV Details:");
        tv.displayDetails();
        tv.turnOn();
        tv.connectToWiFi();
        tv.turnOff();

        System.out.println("\n----------------------\n");

        SmartLight light = new SmartLight("Philips Smart Light");
        System.out.println("Smart Light Details:");
        light.displayDetails();
        light.turnOn();
        light.turnOff();
    }
}
