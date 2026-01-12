package ch09_getter_setter;


// 쉬움
class Person {

    // 필드 변수
    String name;
    int age;
    String address;

    // 기본 생성자
    public Person() {
    }

    // 매개변수를 String으로 하는 생성자
    public Person(String name) {
        this.name = name;
    }

    // getter임
    public String getName(){
        return name;
    }

    // getter임
    public int getAge(){
        return age;
    }

    // setter임 근데 name.length()인데 얘는 함수임 나중에 나오겠지만 배열명.length는 필드 변수임
    // 4 초과면은 변경할 수 없다고 하고 return해서 스탑
    // 4 초과가 아니면 this.name해서 지금 이름 출력하고
    // this.name에 매개변수 name을 넣어서
    // this.name하면 매개변수로 넣은 name이 출력됨 예시) 변경 후 : 변경된 이름
    public void setName(String name){
        if(name.length() > 4){
            System.out.println("변경 할 수 없습니다.");
            return;
        }
        System.out.println("이름이 변경되었습니다");
        System.out.println("변경전 : " + this.name);
        this.name = name;
        System.out.println("변경 후 : " + this.name);
    }

    // setter임 매개변수를 age로 하고 age가 0보다 미만이거나 200 초과면은 age를 0으로 설정하고 리턴해서 멈춤
    // 만약에 아니라면 필드 변수인 age에다가 매개변수 age를 넣음
    public void setAge(int age){
        if (age <0 || age > 200){
            this.age = 0;
            return;
        }
            this.age = age;
    }

    // setter임
    public void setAddress(String address){
        this.address = address;
    }


}