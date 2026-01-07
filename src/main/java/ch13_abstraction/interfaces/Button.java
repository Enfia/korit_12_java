package ch13_abstraction.interfaces;

// 부모 클래스임
public abstract class Button implements Press, Up, Down {
    @Override
    public void onDown() {}

    //얘는 필수로 만들어야함
    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    }
}
