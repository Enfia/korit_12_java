package ch15_objects;

// 쉬움
public class ObjectTest {

    // 필드 변수 선언
    private String name;
    private String address;

    // 기본 생성자임
    public ObjectTest() {
        System.out.println("기본 생성자를 통해 생성함");
    }

    // AllArgsConstructor임
    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("AllArgsConstructor를 통해 생성함");
    }

    // getter임
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // setter임
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // 솔모뒤
    public void showInfo(){
        System.out.println("이름 : " + name + "\n주소 : " + address);
    }


    // Object 클래스에서 제공되는 함수임
    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}