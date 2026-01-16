package ch99_practice.ch14_casting.centralcontrol_again;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Computer computer1 = new Computer();
        List<Power> deviceList = new ArrayList<>();
        DeviceManager deviceManager1 = new DeviceManager(deviceList);
        deviceManager1.addDevice(tv1);
        deviceManager1.addDevice(computer1);
        deviceManager1.powerOn();
        deviceManager1.powerOff();
        deviceManager1.removeDevice(tv1);
        deviceManager1.powerOn();
    }
}
