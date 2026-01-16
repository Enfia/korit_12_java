package ch99_practice.ch14_casting.centralcontrol;

import java.util.List;

public class DeviceManager {
    private List<Power> devices;

    public DeviceManager(List<Power> devices) {
        this.devices = devices;
    }

    public void addDevice(Power device) {
        devices.add(device);
    }

    public void powerOnAll(){
        for(int i = 0; i<devices.size(); i++){
            devices.get(i).on();
        }
    }

    public void powerOffAll(){
        for(int i = 0; i < devices.size(); i++){
            devices.get(i).off();
        }
    }
}
