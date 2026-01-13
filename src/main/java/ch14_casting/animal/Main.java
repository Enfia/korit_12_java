package ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("업캐스팅 파트 : 객체명.메서드명(); 했을 때 자기 버전이 나오는지 재정의 버전이 나오는지 주목");
        Dog dog1 = new Dog();
        dog1.makeSound(); // 개가 짖습니다
        dog1.fetch(); // 개가 짖습니다

        // animal1 변수의 타입은 Animal인데 객체는 new Dog()를 넣음
        Animal animal1 = dog1; // 이게 업케스팅임
        animal1.makeSound(); // 개가 짖습니다? 즉, 재정의된 메서드가 호출됨
        // animal1.fetch // 에러 뜸

        // animal2 변수의 타입은 Animal인데 객체는 new Dog()를 넣음
        Animal animal2 = new Dog();  // 업케스팅
        animal2.makeSound(); // 개가 짖습니다.
        // animal2.fetch // 에러

        // animal0 변수의 타입은 Animal 이고 객체는 new Cat()을 넣음
        Animal animal0 = new Cat(); // 업케스팅
        animal0.makeSound(); // 고양이가 웁니다.
        animal1.makeSound(); // 강아지가 짖습니다.


        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal; // animal1 객체가 Animal이냐 아니면 Animal의 자식이냐?
        System.out.println(result1);  //true
        boolean result2 = animal1 instanceof Dog; // animal1 객체가 Dog이냐 아니면 Dog의 자식이냐?
        System.out.println(result2);//true 왜냐하면 animal1은 객체가 Dog이기 때문에 맞음
        boolean result3 = dog1 instanceof Animal; // dog1 객체가 Animal 이냐 아니면 Animal의 자식이냐?
        System.out.println(result3);//true 왜냐하면 dog1은 Animal의 자식이기 때문에 맞음
        boolean result4 = animal2 instanceof Dog; // 솔모뒤
        System.out.println(result4);//true

        Animal animal3 = new Animal(); //
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);//true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);//false

        System.out.println("다운캐스팅 파트");
        Dog dog2 = (Dog) animal1;// 변수 타입은 Animal이라 Dog 기능을 바로 쓸 수 없지만 실제 객체가 Dog이기 때문에 다운캐스팅이 가능함
        animal2.makeSound();
        dog2.makeSound();
        dog2.fetch();
        Animal animal4 = new Animal();

    }
}
