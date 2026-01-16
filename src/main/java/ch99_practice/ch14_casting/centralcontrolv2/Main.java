package ch99_practice.ch14_casting.centralcontrolv2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        List<Power> deviceList = new ArrayList<>();
        DeviceManager deviceManager1 = new DeviceManager(deviceList, 5);
        deviceManager1.addDevice(computer1);
        deviceManager1.powerOnByType(Computer.class);
    }
}
