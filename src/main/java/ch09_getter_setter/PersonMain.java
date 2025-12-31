package ch09_getter_setter;



public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "김일";
//        person1.age = -10;
//        person1.address = "부산광역시 부산진구";
//        System.out.println(person1.name + person1.age + person1.address)

        person1.setName("asdsadasd");
        person1.setName("김일이");
        person1.setAge(10);
        System.out.println(person1.getName()+" 학생의 나이는 " + person1.getAge());
    }
}

