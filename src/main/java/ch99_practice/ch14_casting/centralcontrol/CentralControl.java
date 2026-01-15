package ch99_practice.ch14_casting.centralcontrol;


public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                deviceArray[i] = device;
                System.out.println(device.getClass().getSimpleName() + "장치가 추가 되었습니다.");
                return;
            }
        }
        System.out.println("더 이상 장치를 연결할 수 없습니다.");
    }

    public void powerOn(){
        for(int i= 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 킬 수 없습니다.");
                continue;
            } else {
                deviceArray[i].on();
            }

        }
    }

    public void powerOff(){
        for (Power array : deviceArray){
            if(array == null){
                System.out.println("장치가 없어 전원을 끌 수 없습니다.");
                continue;
            } else{
                array.off();
            }
        }
    }

    public void showInfo(){
        for (int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                System.out.println("슬롯 [ " + (i+1) + " ] 번 : Empty");
                continue;
            } else{
                System.out.println("슬롯 [ " + (i+1) + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
            }
        }
    }

    public void showInfo2(){
        int i = 0;
        for (Power device : deviceArray){
            if(device == null){
                System.out.println("슬롯 [ " + (++i) + " ] 번 : Empty");
            } else{
                System.out.println("슬롯 [ " + (++i) + " ] 번 : " + device.getClass().getSimpleName());
            }
        }
    }
    public void performSpecificMethod(){
        for( Power device : deviceArray){
            if(device == null){
                System.out.println("여기는 null임");
                continue;
            } else {
                device.action();
            }
        }
    }

    public void deleteDevice(String name){
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null){
                continue;
            } else if (deviceArray[i].getClass().getSimpleName().equals(name)) {
                System.out.println(name + "를 삭제를 성공함");
                deviceArray[i] = null;
                return;
            }
        }
    }

    public void deleteDevice(int num){ // 몇번 삭제할건지 입력해라
        num -= 1;
        for(int i = 0; i<deviceArray.length; i++){
            if(deviceArray[i] == null){
                continue;
            } else if(num == i){
                System.out.println( (i+1) + "번 삭제를 성공함");
                deviceArray[i] = null;
            } else{
                continue;
            }
        }
    }
}
