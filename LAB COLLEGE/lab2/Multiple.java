
interface AudioPlayer {
    void play_Audio();
    void stop_Audio();
}

interface VideoPlayer {
    void play_Video();
    void stop_Video();
}


class Smart_Device implements AudioPlayer, VideoPlayer {

    String deviceName;

    // Constructor
    public Smart_Device(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void play_Audio() {
        System.out.println(deviceName + " is playing audio.");
    }

    @Override
    public void stop_Audio() {
        System.out.println(deviceName + " stopped audio playback.");
    }

    @Override
    public void play_Video() {
        System.out.println(deviceName + " is playing video.");
    }

    @Override
    public void stop_Video() {
        System.out.println(deviceName + " stopped video playback.");
    }

    // Method to display device details
    public void displayDetails() {
        System.out.println("Smart Device: " + deviceName);
        System.out.println("Supports both audio and video playback.");
    }
}

// Main class to test the application
public class Multiple {
    public static void main(String[] args) {
        // Creating a Smart_Device object
        Smart_Device device = new Smart_Device("Sony Multimedia Player");

        System.out.println("Device Details:");
        device.displayDetails();

        System.out.println("\n----------------------\n");

        // Testing Audio Features
        device.play_Audio();
        device.stop_Audio();

        System.out.println("\n----------------------\n");

        // Testing Video Features
        device.play_Video();
        device.stop_Video();
    }
}
