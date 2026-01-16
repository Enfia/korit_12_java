package ch99_practice.ch14_casting.centralcontrol_again;

import java.util.List;

public class DeviceManager {
    List<Power> devices;

    public DeviceManager(List<Power> devices) {
        this.devices = devices;
        System.out.println("생성함");
    }

    // 동사 먼저
    public void addDevice(Power device){
        devices.add(device);
        System.out.println(device.getClass().getSimpleName() + " 연결함");
    }

    // 동사 먼저
    public void removeDevice(Power device){
        devices.remove(device);
        System.out.println(device.getClass().getSimpleName() + " 제거함");
    }

    public void powerOn(){
        for (int i = 0; i< devices.size(); i++){
            devices.get(i).on();
        }
    }

    public void powerOff(){
        for (int i = 0; i< devices.size(); i++){
            devices.get(i).off();
        }
    }
}
