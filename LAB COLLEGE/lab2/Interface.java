
// Interface: Transport
interface Transport {
    void start(); // Method to start the vehicle
    void stop();  // Method to stop the vehicle
}

// Class: Bus (Implements Transport)
class Bus implements Transport {
    String busNumber;

    // Constructor
    public Bus(String busNumber) {
        this.busNumber = busNumber;
    }

    @Override
    public void start() {
        System.out.println("Bus " + busNumber + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bus " + busNumber + " has stopped.");
    }
}

// Class: Train (Implements Transport)
class Train implements Transport {
    String trainNumber;

    // Constructor
    public Train(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Override
    public void start() {
        System.out.println("Train " + trainNumber + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Train " + trainNumber + " has stopped.");
    }
}

// Main class to test the implementation
public class Interface {
    public static void main(String[] args) {
        // Creating a Bus object
        Bus bus = new Bus("B123");
        bus.start();
        bus.stop();

        System.out.println("\n----------------------\n");

        // Creating a Train object
        Train train = new Train("T456");
        train.start();
        train.stop();
    }
}
