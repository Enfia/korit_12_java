package ch14_casting.centralcontrol;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("LED를 끕니다.");
    }
}
