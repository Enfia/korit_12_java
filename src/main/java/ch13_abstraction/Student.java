package ch13_abstraction;

public class Student extends Person{
    private String school;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public void introduce() {

    }

    // 자식 클래스의 변수 선언
    // 추상 클래스가 AllArgsConstructor를 가지고 있기 때문에 추상 함수를 구현 하라는 점에서 빨간 줄 뜰거고, Student 클래스ㅜ의 생성자를 특정 방식으로 정의하라고 빨간줄이 뜰겁니다.
}
