package ch13_abstraction.interfaces;

public abstract class Button implements Press, Up, Down {
    @Override
    public void onDown() {}

    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    }
}
