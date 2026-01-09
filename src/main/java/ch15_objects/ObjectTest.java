package ch15_objects;

public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본 생성자를 통해 생성함");
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
        System.out.println("AllArgsConstructor를 통해 생성함");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo(){
        System.out.println("이름 : " + name + "\n주소 : " + address);
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;

    }
}