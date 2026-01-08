package ch14_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨을 킵니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨을 끕니다.");

    }
}
