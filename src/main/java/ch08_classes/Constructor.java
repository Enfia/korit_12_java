package ch08_classes;

public class Constructor {

    // 필드 변수 선언
    int num;
    String name;

    // 기본 생성자임
    public Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    // 매개변수를 int로 하는 생성자
    public Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number;  // this : 해당 클래스에서 객체를 생성하게 되면 객체 이름으로 대체됨.
    }

    // 매개변수를 String으로 하는 생성자
    public Constructor(String title){
        System.out.println("String 매개변수를 필수로 요구함");
        this.name = title;
    }

    // 매개변수를 int, String으로 하는 생성자
    public Constructor(int number, String title){
        System.out.println("int, String 매개변수를 필수로 요구함");
        this.num = number;
        this.name = title;
    }

    // 필드 변수에 들어가있는 name과 num을 출력해주는 함수
    public void displayInfo() {
        System.out.println(name + " 학생 학번은 " + num);
    }
}
