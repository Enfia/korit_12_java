package ch99_practice.ch14_casting.centralcontrol;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("TV ON");
    }

    @Override
    public void off() {
        System.out.println("TV OFF");
    }
}
