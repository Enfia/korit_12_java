package ch14_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        AirConditioner airConditioner1 = new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        Speaker speaker1 = new Speaker();
        // 비어있는 배열을 CentralControl 클래스의 field인 deviceArray에 집어넣음
        CentralControl centralControl1 = new CentralControl(new Power[7]);
        // powers 배열을 만든 다음에 내부에 Power의 하위 클래스들의 객체를 집어넣음
        Power[] powers = {new AirConditioner(), new Computer(), new Mouse(), new LED(), new Printer(), new Speaker()};
        centralControl1.addDevice(airConditioner1);
        centralControl1.addDevice(computer1);
        centralControl1.addDevice(mouse1);
        centralControl1.addDevice(led1);
        centralControl1.powerOn();
        centralControl1.powerOff();
        centralControl1.showInfo();
        centralControl1.performSpecificMethod();
        System.out.println("----------------------------");
        centralControl1.addDevice(printer1);
        centralControl1.addDevice(speaker1);
        centralControl1.powerOn();
        centralControl1.powerOff();
        centralControl1.showInfo();
        centralControl1.performSpecificMethod();
        System.out.println("----------------------------");
        //        centralControl1.deviceArray[0] = null;
        /*
            이상의 코드는 deviceArray가 public 접근 제어자일 경우에만 성립합니다.
            하지만 캡슐화를 위해서 private으로 선언해놨다면
            저희는 method를 경유하여 deviceArray 배열 내에 있는 특정 index의 객체를 삭제할 수도 있을 것 같습니다.

            deleteDevice()를 2 개 정의하시오. String 이랑 index 넘버
            일반 처음부터 끝까지 for문
         */
        System.out.println("삭제 하기 전");
        centralControl1.showInfo2();
        centralControl1.deleteDevice("Computer");
        centralControl1.deleteDevice("LED");
        centralControl1.deleteDevice(2);
        centralControl1.deleteDevice(5);
        System.out.println("삭제 후");
        centralControl1.showInfo2();
    }
}
