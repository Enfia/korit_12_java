package ch99_practice.ch14_casting.centralcontrol;

import java.util.List;

public class CentralControlMain {
    public static void main(String[] args) {
        AirConditioner airConditioner1 = new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        Speaker speaker1 = new Speaker();

        DeviceManager<Power> deviceManager = new DeviceManager<>(List.of(airConditioner1, computer1));
        deviceManager.addDevice(airConditioner1);
//        CentralControl centralControl1 = new CentralControl(new Power[7]);
//        centralControl1.addDevice(airConditioner1);
//        centralControl1.addDevice(computer1);
//        centralControl1.addDevice(mouse1);
//        centralControl1.addDevice(led1);
//
//        centralControl1.performSpecificMethod();
    }
}