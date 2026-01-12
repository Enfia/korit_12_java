package ch12_inheritance;

// 쉬움
// 상속 받음
public class Human extends Animal {
    private int age;
    private String name;

    // 기본 생성자
    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    // 고유 메서드
    public void read(String title){
        System.out.println(getAnimalName()+"은 " + title + "를 읽는 중입니다.");
    }

    // 없어도 함수인데 오버라이드를 사용하기 위해서 예시로 만듦
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}
