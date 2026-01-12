package ch13_abstraction;


// 쉬움 추상 클래스임
public abstract class Person{
    private String name;
    //AllArgsConstructor
    public Person(String name){
        this.name= name;
    }

    // 필수 함수임
    public abstract void introduce();
}
