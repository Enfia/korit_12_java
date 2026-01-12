package ch10_access_modifier;

class AccessModifierExample{

    // public > protected > default > private
    // (넓음 ------------------> 좁음)
    // public은 어디서든 가능
    // prodected는 같은 패키지 다른 패키지면 상속 받는 패키지만 가능 즉 자식 클래스면은 사용 가능
    // default는 같은 패키지만 가능
    // private은 클래스 안에서만 가능
    public int publicVar = 10;
    protected  int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar;

    //getter임
    public int getPrivateVar() {
        return privateVar;
    }

}
// 솔모뒤
public class Main {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();
    }
}
