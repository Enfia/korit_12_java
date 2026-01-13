package ch18_generic.woldcard;

public class Human extends Animal{
    @Override
    public void move() {
        System.out.println("사람이 두 발로 뜁니다.");
    }

    // 고유 함수
    public void read(){
        System.out.println("사림이 책을 읽습니다.");
    }
}
