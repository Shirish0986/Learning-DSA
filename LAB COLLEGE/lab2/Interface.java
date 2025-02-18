
interface Transport {
    void start(); 
    void stop();  
}

class Bus implements Transport {
    String busNumber;

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

class Train implements Transport {
    String trainNumber;

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

public class Interface {
    public static void main(String[] args) {
        Bus bus = new Bus("B123");
        bus.start();
        bus.stop();

        System.out.println("\n----------------------\n");

        Train train = new Train("T456");
        train.start();
        train.stop();
    }
}
