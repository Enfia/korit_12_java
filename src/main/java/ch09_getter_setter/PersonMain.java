package ch09_getter_setter;



public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "김일";
//        person1.age = -10;
//        person1.address = "부산광역시 부산진구";
//        System.out.println(person1.name + person1.age + person1.address)

        person1.setName("디카프리오");
        person1.setName("김일이");
        System.out.println(person1.getName()+" 학생의 나이는 " + person1.getAge()
                +"살이고 주소는 " + person1.getAddress());
    }
}

