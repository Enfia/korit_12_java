package ch10_access_modifier;

// 한 파일에 클래스가 2개인 이유는 시험에서 익숙해지기 위해서

class Person{
    private String name;

    public void setName(String name) {
        if(name.length() > 4){
            System.out.println("글자 수 제한을 넘어섰습니다");
            return;
        }
        this.name = name;
        System.out.println(name+"로 설정되었습니다.");
    }

    public String getName() {
        return name;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("김일");
        person1.setName("브래드피트");
        person1.setName("이일");
        System.out.println("현재 이름 : "+ person1.getName());
    }
}