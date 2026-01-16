package ch99_practice.ch14_casting.centralcontrolv2;

import java.util.List;

public class DeviceManager {
    private List<Power> devices;
    private int maxDevices;

    public DeviceManager(List<Power> devices, int maxDevices) {
        this.devices = devices;
        this.maxDevices = maxDevices;
    }

    public void addDevice(Power device){
        if(devices.contains(device)){
            System.out.println("장치 중복 장착 불가");
            return;
        } else if(devices.size() < maxDevices){
            devices.add(device);
            System.out.println(device.getClass().getSimpleName() + " 추가함");
            return;
        }
        System.out.println("장치 수 초과 시 추가 불가");
    }

    public void removeDevice(Power device){
        devices.remove(device);
    }

    public void powerOnAll(){
        for (int i = 0; i<devices.size(); i++){
            devices.get(i).on();
        }
    }

    public void powerOffAll(){
        for (int i = 0; i<devices.size(); i++){
            devices.get(i).off();
        }
    }

    public void powerOnByType(Class<? extends Power> type){
        for (Power device : devices){
            if(device.getClass().equals(type)){
                device.on();
            }
        }
    }
}
