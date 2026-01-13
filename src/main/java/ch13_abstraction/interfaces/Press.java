package ch13_abstraction.interfaces;


// 필수로 선언해야 되는 것은 onPressed() 함수임
public interface Press {
    String NAME = "button";

    void onPressed();
}
