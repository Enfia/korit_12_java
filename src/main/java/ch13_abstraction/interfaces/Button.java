package ch13_abstraction.interfaces;

// 부모 클래스이면서 추상 클래스
// 인터페이스를 상속 받았기 때문에 onDown() / onPressed() / onUp() 필수임
// 꼭 필수로 하는 함수는 onPressed임
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
