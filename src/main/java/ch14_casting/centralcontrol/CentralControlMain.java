package ch14_casting.centralcontrol;

// 쉬움
public class CentralControlMain {
    public static void main(String[] args) {
        AirConditioner airConditioner1 = new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        Speaker speaker1 = new Speaker();
        CentralControl centralControl1 = new CentralControl(new Power[7]);
        Power[] powers = {new AirConditioner(), new Computer(), new Mouse(), new LED(), new Printer(), new Speaker()};
        centralControl1.addDevice(airConditioner1);
        centralControl1.addDevice(computer1);
        centralControl1.addDevice(mouse1);
        centralControl1.addDevice(led1);
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
        System.out.println("삭제 하기 전");
        centralControl1.showInfo2();
        centralControl1.deleteDevice("Computer");
        centralControl1.deleteDevice("LED");
        centralControl1.deleteDevice(2);
        System.out.println("삭제 후");
        centralControl1.showInfo2();
    }
}