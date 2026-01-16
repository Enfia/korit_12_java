package ch99_practice.ch14_casting.centralcontrol_again;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("Computer ON");
    }

    @Override
    public void off() {
        System.out.println("Computer OFF");
    }
}
