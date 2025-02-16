public class SmartHomeVoiceAssistant {
    public static void main(String[] args) {
        SmartAssistant musicAssistant = new MusicAssistant();
        SmartAssistant lightingAssistant = new LightingAssistant();
        
        musicAssistant.voiceCommand("Play classical music");
        lightingAssistant.voiceCommand("Turn on the living room lights");
    }
}

class SmartAssistant {
    void voiceCommand(String command) {
        System.out.println("Processing command: " + command);
    }
}

class MusicAssistant extends SmartAssistant {
    @Override
    void voiceCommand(String command) {
        System.out.println("Playing music based on command: " + command);
    }
}

class LightingAssistant extends SmartAssistant {
    @Override
    void voiceCommand(String command) {
        System.out.println("Adjusting lights based on command: " + command);
    }
}