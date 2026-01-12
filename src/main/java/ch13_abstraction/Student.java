package ch13_abstraction;


// 쉬움 Person 클래스를 상속받음
public class Student extends Person{
    private String school;

    // 매개변수가 필요한 생성자
    public Student(String name) {
        super(name);
    }

    // Person에 name이 있기 때문에 가능
    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    // 없으면 에러뜸
    @Override
    public void introduce() {

    }

    // 자식 클래스의 변수 선언
    // 추상 클래스가 AllArgsConstructor를 가지고 있기 때문에 추상 함수를 구현 하라는 점에서 빨간 줄 뜰거고, Student 클래스ㅜ의 생성자를 특정 방식으로 정의하라고 빨간줄이 뜰겁니다.
}
