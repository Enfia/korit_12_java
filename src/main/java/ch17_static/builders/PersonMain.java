package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
//        Person person = new Person(); //안됨 이유 : private이라서 기본생성자가 없어서
        Person person1 = new Person.Builder()
                .age(21)
                .name("김일")
                .address("부산광역시 부산진구")
                .build();

        System.out.println(person1);
        Person2 person2 = Person2.builder().name("김사").build();
        System.out.println(person2);
    }
}
