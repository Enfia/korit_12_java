package ch14_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        AirConditioner airConditioner1 = new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        // 비어있는 배열을 CentralControl 클래스의 field인 deviceArray에 집어넣음
        CentralControl centralControl1 = new CentralControl(new Power[5]);
        // powers 배열을 만든 다음에 내부에 Power의 하위 클래스들의 객체를 집어넣음
        Power[] powers = {new AirConditioner(), new Computer(), new Mouse(), new LED()};
        centralControl1.addDevice(airConditioner1);
        centralControl1.addDevice(computer1);
        centralControl1.addDevice(mouse1);
        centralControl1.addDevice(led1);
        centralControl1.powerOn();
    }
}
