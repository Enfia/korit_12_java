package ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("업캐스팅 파트 : 객체명.메서드명(); 했을 때 자기 버전이 나오는지 재정의 버전이 나오는지 주목");
        Dog dog1 = new Dog();
        dog1.makeSound(); // 개가 짖습니다
        dog1.fetch(); // 강아지가 공을 물어옵니다.

        Animal animal1 = dog1;
        animal1.makeSound(); // 개가 짖습니다? 즉, 재정의된 메서드가 호출됐습니다
        // animal1.fetch // 에러
        Animal animal2 = new Dog();
        animal2.makeSound();
        // animal2.fetch // 에러

        /*
        클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
        1. Override가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨(클래스B의 메서드라는 의미겠네요)
        2. 클래스B(자식클래스)의 고유 메서드는 호출 불가능.

        그럼 재정의된 메서드 버전으로 호출이 될거라면 애초에
        클래스B 객체명 = new 클래스B();로 생성해비러면 재정의된 메서드도 호출되고 고유 메서드도 호출할 수 있으니까
        골치 안아프거 아니냐는 결론이 나올 수도 있습니다
         */
        Animal animal0 = new Cat();
        animal0.makeSound();
        animal1.makeSound();


        // 연산자 instanceof 사용 사례
        // 업캐스팅이 이루어지지 않고 그냥 Dog dog1 = new Dog();로 B b= new B();
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);  //true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);//true
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);//true
        boolean result4 = animal2 instanceof Dog;
        System.out.println(result4);//true

        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);//true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);//false

        System.out.println("다운캐스팅 파트");
        /*
            다운캐스팅은 명시적으로 이루어져야합니다.
            방법
            (클래스명) 객체명; -> (int) 1.23; 과 같은 방식입니다. conversion의 객체 버전이라고 생각할 수 있습니다.
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려하셔야 합니다
         */
        // 다운캐스팅 방법
        Dog dog2 = (Dog) animal1;
        // 저 위에 보시면 Animal animl2 = new Dog();로 생성했기 때문에 animal2의 Dog 버전 객체명이 아예 없습니다.
        // 근데 이번에 다운캐스팅하면서 dog2라고 하는 객체명을 지어줬다고 할 수 있겠습니다.
        animal2.makeSound();
        dog2.makeSound();
        dog2.fetch();
        /*
            dog2로 새로운 객체명을 선언하고 거기에 명시적 참조자료형 캐스팅을 적용하여 Animal 클래스의 인스턴스인 animal2 Dog 자료형으로
            downcasting 했습니다.
            근데 여기서 중요한 점은 다운캐스팅을 했다고 해서 animal2 사라지는 것은 아닙니다.
            dog2와 animal2가 별개로 움직인다고 봐야합니다.
            dog2로 메서드를 호출할 경우 당연히 재정의된 makeSound()가 출력되며, 고유 메서드인 fetch() 역시 호출이 가능합니다.
            그러면 Dog dog0 = new Dog(); 로 만들면 애초에 재정의된 메서드 및 고유 메서드를 사용할 수 있다는 점이 문제가 됩니다.

         */
        // 아까 Animal animal3 = new Animal();로 생성했었습니다.
//        Dog dog3 = (Dog) animal3;
//        dog3.makeSound();
        Animal animal4 = new Animal();

    }
}
