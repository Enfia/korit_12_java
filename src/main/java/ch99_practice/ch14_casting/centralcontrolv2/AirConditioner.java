package ch99_practice.ch14_casting.centralcontrolv2;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("["+getName()+"] 켜짐");
    }

    @Override
    public void off() {
        System.out.println("["+getName()+"] 꺼짐");
    }

    @Override
    public String getName() {
        return "AirConditioner";
    }
}
