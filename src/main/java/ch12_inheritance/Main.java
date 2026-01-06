package ch12_inheritance;

/*
    객체 지향 프로그래밍의 핵심 개념
    기존 클래스 변수와 함수를 재사용하여 새로운 클래스를 만드는 것을 의미함

    상속의 필요성 : 상속을 통해 공통적인 기능을 부모 클래스에 정의하고, 이를 '여러' 자식 클래스가 재사용 가능
    중복된 코드를 줄일 수 있음
    남이 만들어둔 코드를 가지고 올 수 있음

    1. 단일 상속
    하나의 클래스는 한 번에 하나의 부모 클래스만 상속 받을 수 있음

    2. super 키워드
    클래스의 생성자를 호출 함수를 호출할 때 사용

    3. 함수 @Override
    자식 클래스에서 부모 클래스의 기본 동작을 재정의 할 수 있음
    예시) 동물 클래스의 걷기 함수를 개가 상속 받고 네 발로 걷기로 재정의하고 사람 클래스가 걷기 함수를 상속 받고
    두 발로 걷기로 재정의가 가능함

    4. final 키워드
    클래스에 final이 붙으면 상속 불가

    5. 함수에 final이 붙을 경우에는 함수 @Override 불가능

    # 장점
    1. 코드의 재사용성
    2. 유지 보수의 용이성
    부모 클래스의 변경 사항이 자식 클래스에 자동으로 반영되기 떄문에 위계를 파악한 후에 수정하면 됨
    3. 객체 간 관계 표현
    IS-A 관계를 명확히 나타냄
        - IS-A는 무엇인가? 개는 동물의 일종이다 와 같은 예시로 is a kind of의 축약어에 해당함
        - 그래서 동물 호랑이 사람 클래스를 예로 들었을때 사람 호랑이는 동물 클래스의 자식(서브) 클래스임
        - 넓은 범위를 가지는 것이 부모 클래스가 될 것이고, 좀 더 구체적이고 특징 지어진 것이 자식 클래스가 될 것임

    # super 키워드
    1. super() : 부모 클래스의 생성자를 호출
    2. super.함수명() : 부모 클래스의 함수를 호출

*/


public class Main {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.move();
//        animal1.setAnimalName("동물");
//        animal1.setAnimalAge(12);
//
//        Tiger tiger1 = new Tiger();
//        tiger1.setAnimalName("호랑이");
//        tiger1.setAnimalAge(1);
//        System.out.println("호랑이의 이름은 "+tiger1.getAnimalName()+"이고 나이는 " + tiger1.getAnimalAge() +  "살 입니다.");
//        tiger1.move();
//        tiger1.hunt();
//        tiger1.hunt("날치");
//
//        tiger1.setWeight(1.4);
//        System.out.println(tiger1.getAnimalName() + "의 몸무게는 "+tiger1.getWeight() + "t 입니다.")
// --------------------------------------------------------------------------------------------------------------------
        Human human1 = new Human();
        human1.move();
        human1.setAnimalAge(21);
        human1.setAnimalName("김상윤");
        System.out.println("안녕하세요, 제 이름은 " + human1.getAnimalName()+ "이고 나이는 " + human1.getAnimalAge()+"살 입니다.");
        System.out.println("내년에는 "+ (human1.getAnimalAge() + 1) + "살이 됩니다.");
        human1.read("자바의 기초");
    }
}