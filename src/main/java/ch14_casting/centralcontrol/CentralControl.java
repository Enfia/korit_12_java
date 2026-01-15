package ch14_casting.centralcontrol;


public class CentralControl {
    private Power[] deviceArray; //Power[] 타입의 필드 변수명이 deviceArray임

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    } // 매개변수를 배열로 받는 생성자인데 이게 그냥 배열을 넣는다는 의미인가?

    public void addDevice(Power device){  // addDevice 배열에 넣을 하나의 장치를 받는 애임
        int emptyIndex = checkEmpty(); //checkEmpty 함수를 확인해보자
        // 비어 있으면 추가 / 없으면 연결 못함
        // 방금 리턴해준 -1이 들어오면 장치를 연결할 수 없다고 해줌
        if(emptyIndex == -1){
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        // 0, 1, 2, 3, 4.... 암튼
        // 숫자를 차례대로 하나씩 넣어주는 거 같음

        // 매개변수로 받은 것을 deviceArray 배열에다가 넣음
        deviceArray[emptyIndex] = device;
        // 배열 넣고 device의 이름을 출력하고 장치가 추가 됐다고 알려줌
        System.out.println(device.getClass().getSimpleName()+ "장치가 추가 되었습니다.");
    }

    private int checkEmpty(){ // 음 대충 배열 하나씩 검사하고 빈 공간이 있으면 i를 리턴해주고 아니면 -1을 리턴해줌
        for(int i = 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void powerOn(){  // 함수인데 뭔가 반복문이 있는데 배열에 있는거 하나씩 확인하고 비어 있으면 장치가 없어 전원을... 어쩌고 해줌
        // 아니라면 현재 배열에 있는거 on() 함수 실행 시켜줌 만약에
        // deviceArray[1] 에 있는것이 변수인데 변수에 new Computer 자습시간에 여기까지함
        for(int i= 0; i < deviceArray.length; i++){
            if(deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 킬 수 없습니다.");
                continue; // return으로 마무리 했을 때와의 콘솔 상에서의 차이점을 확인하면 더 명확해집니다.
                /*
                    break는 반복문을 즉시 종료하는 명령어
                    return은 메서드를 즉시 종료하는 명령어
                    continue는 현재 반복만 종료하고 다음 반복으로 넘어감
                    즉 deviceArray[6]이 null 이라면 다음 반복으로 i++ 시켜서 deviceArray[7]을 검사하고 deviceArray.length 미만까지
                    전체 다 확인을 하는 형태라고 할 수 있습니다.
                    그러면 6번지는 비어있고 7번지에 Power의 서브 클래스의 인스턴스가 존재하는 상황에서 6번지는 실행 안되고 7번지는 실행되겠네요.
                 */
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
            // deviceArray에는 new AirConditioner이 들어가있음 근데 부모 타입으로 선언한게 아니라 자식
            // 클래스로 선언함
            // 설마 받는게 부모인가?
            if(device instanceof AirConditioner){
                AirConditioner airConditioner = (AirConditioner) device;
                airConditioner.changeMode();
            }else if(device instanceof Computer){
                Computer computer = (Computer) device;
                computer.compute();
            } else if(device instanceof LED){
                LED led = (LED) device;
                led.changeColor();
            } else if(device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device == null){
                System.out.println("연결 안됨");
            } else if (device instanceof Printer){
                Printer printer = (Printer) device;
                printer.print();
            }else if (device instanceof  Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();

            }else {
                System.out.println("아직 지원되지 않는 전자기기입니다.");
            }
        }
    }

    public void deleteDevice(String name){
//        for(Power device : deviceArray){
//            if(device == null){
//                System.out.println("없음");
//                continue;
//            } else if (device.getClass().getSimpleName() == name) {
//                System.out.println("성공함");
//                device = null;
//            } else{
//                System.out.println("실패함");
//                continue;
//            }
//        }

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
                System.out.println( i + "번 삭제를 성공함");
                deviceArray[i] = null;
            } else{
                continue;
            }
        }
    }
}
