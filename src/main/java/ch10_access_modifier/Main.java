package ch10_access_modifier;

class AccessModifierExample{
    public int publicVar = 10;
    protected  int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar;

    public int getPrivateVar() {
        return privateVar;
    }
}
public class Main {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();
        ;
    }
}
