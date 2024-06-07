public class User {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.printStatus();

        tv.turnOn();

        tv.turnOff();

        tv.turnOn();

        tv.setChannel(13);

        tv.increaseVolume();

        tv.increaseChannel();
        tv.increaseChannel();

        tv.decreaseVolume();

        tv.decreaseChannel();

        tv.printStatus();
        tv.turnOff();
    }
}