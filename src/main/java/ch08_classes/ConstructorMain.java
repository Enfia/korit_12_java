package ch08_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        /*
        지시 사항 # 1
        String title을 매개변수로 하는 생성자를 정의하고,
        RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을
        출력할 수 있도록 작성한 뒤
        ConstructorMain으로 가서 constructor4라는 객체명을 지니고, title에 "김사"으로
        이름 붙이고 객체를 생성한 후,
        System.out.println(contructor4.name);을 입력하여 콘솔에 "김사"를 출력하시오.

        지시 사항 # 2
        int num, String name을 매개변수로 하는 생성자를 정의하고
        AllArgsConstructor(int, String 전부를 매개변수로 요구하는 생성자) 라는 안내문을
        출력할 수 있도록 작성한 뒤
        ConstructorMain으로 가서 constructor5라는 객체명을 지니고, 5, "김오"라고
        값을 대입한 객체를 생성한 후
        sout(constructor5.num);
        sout(constructor5.name);
        을 출력하시오.
     */
        Constructor const4 = new Constructor("김사");
        System.out.println(const4.name);
        Constructor const5 = new Constructor(5, "김오");
        System.out.println(const5.num + " " +const5.name);
        const5.displayInfo();
        const4.displayInfo();
    }
}
