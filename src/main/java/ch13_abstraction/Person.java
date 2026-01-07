package ch13_abstraction;

public abstract class Person{
    private String name;
    //AllArgsConstructor
    public Person(String name){
        this.name= name;
    }

    //함수 예시
    public abstract void introduce();
}
