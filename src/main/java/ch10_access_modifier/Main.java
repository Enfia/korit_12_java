package ch10_access_modifier;

class AccessModifierExample{
    public int publicVar = 10;
    protected  int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar;

    public void setPrivateVar(int pri){
        if(pri > 10){
            this.privateVar = pri;
            System.out.println("어쩔");
            return;
        }
    }
    public int getPrivateVar() {
        return privateVar;
    }
}
public class Main {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();
        example.setPrivateVar(20);
    }
}
