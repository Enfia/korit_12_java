package ch99_practice.ch14_casting.centralcontrol;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Power> devices = new ArrayList<>();
        Tv tv1 = new Tv();
        Computer computer1 = new Computer();
        DeviceManager deviceManager = new DeviceManager(devices);
        deviceManager.addDevice(tv1);
        deviceManager.addDevice(computer1);
        deviceManager.powerOnAll();
        deviceManager.powerOffAll();
    }
}
