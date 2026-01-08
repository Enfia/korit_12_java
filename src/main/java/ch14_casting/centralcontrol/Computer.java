package ch14_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터를 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터를 끕니다.");
    }

    public void compute(){
        System.out.println("컴퓨터가 연산을 수행합니다.");
    }
}
