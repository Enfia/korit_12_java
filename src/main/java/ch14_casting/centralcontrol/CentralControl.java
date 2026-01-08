package ch14_casting.centralcontrol;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device){
        int emptyIndex = checkEmpty();
//        for(int i = 0; i < deviceArray.length; i++){
//            if(deviceArray[i] == null){
//                emptyIndex = i;
//            } else emptyIndex = -1;
//        }
        // 비어 있으면 추가 / 없으면 연결 못함
        if(emptyIndex == -1){
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName()+ "장치가 추가 되었습니다.");
    }

    private int checkEmpty(){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void powerOn(){
        for(int i= 0; i < deviceArray.length; i++){
            deviceArray[i].on();
        }
    }

}
