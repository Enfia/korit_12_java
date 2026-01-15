package ch99_practice.ch14_casting.centralcontrol;

import java.util.List;

public class DeviceManager<Power> {
    private List<Power> devices ;

    public DeviceManager(List<Power> devices) {
        this.devices = devices;
    }

    // 여기서부터임
    public void addDevice(Power device){
        for(Power device : devices){
            if(devices == null){
                devices.add(device);
                System.out.println(device.getClass().getSimpleName() + "장치가 추가 되었습니다.");
                return;
            }
        }
        System.out.println("더 이상 장치를 연결할 수 없음");
    }

}
