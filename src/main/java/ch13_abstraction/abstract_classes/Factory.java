package ch13_abstraction.abstract_classes;

/*
요약
추상 클래스는 부모 클래스와 자식 클래스가 존재하고
부모 클래스에서는 추상 함수를 선언해야함
이 추상 함수는 자식 클래스에서 로직을 작성해주거나 선언을 해줘야함
부모의 클래스와 추상 함수에 abstract가 붙음
 */

// 부모 클래스
public abstract class Factory {
    // 변수(필드) 선언
    private String name;

    // 함수 선언함 얘네는 필수적으로 있어야함 그래서 @Override를 써서
    public abstract void produce(String model);
    public abstract void manage();

    // getter임 얘 호출하면 name 알 수 있음
    public String getName() {
        return name;
    }

    // setter임 얘 호출하면 객체.setName("이름") 이름 설정할 수 있음
    public void setName(String name) {
        this.name = name;
    }

    // 얘는 필수적으로 필요한 함수가 아님 그래서 없어도 됨. 만약에 얘를 @Override 해서 써도 될까? 써도 됨 오...
    public void showInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 : " + name);
    }
}
