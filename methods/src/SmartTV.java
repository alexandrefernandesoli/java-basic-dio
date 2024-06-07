public class SmartTV {
    boolean isOn = false;
    int volume = 30;
    int channel = 1;

    SmartTV() {
    }

    public void turnOn() {
        System.out.println("Turning on SmartTV...");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Turning off SmartTV...");
        isOn = false;
    }

    public void increaseVolume() {
        if (!isOn) {
            System.out.println("Can't increase volume. SmartTV is off.");
            return;
        }

        if (volume < 100) {
            volume++;
            System.out.println("Increasing volume to " + volume + "...");
        }
    }

    public void decreaseVolume() {
        if (!isOn) {
            System.out.println("Can't decrease volume. SmartTV is off.");
            return;
        }

        if (volume > 0) {
            volume--;
            System.out.println("Decreasing volume to " + volume + "...");
        }
    }

    public void setChannel(int channel) {
        if (!isOn) {
            System.out.println("Can't change channel. SmartTV is off.");
            return;
        }

        this.channel = channel;
        System.out.println("Changing channel to " + channel + "...");
    }

    public void increaseChannel() {
        if (!isOn) {
            System.out.println("Can't increase channel. SmartTV is off.");
            return;
        }

        channel++;
        System.out.println("Increasing channel to " + channel + "...");
    }

    public void decreaseChannel() {
        if (!isOn) {
            System.out.println("Can't decrease channel. SmartTV is off.");
            return;
        }

        channel--;
        System.out.println("Decreasing channel to " + channel + "...");
    }


    public void printStatus() {
        System.out.println("Is SmartTV on? " + (isOn ? "Yes" : "No"));
        System.out.println("Volume: " + volume);
        System.out.println("Channel: " + channel);
    }
}
