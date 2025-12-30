package ch09_getter_setter;

class Person {
    String name;
    int age;
    String address;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

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

    public void setAge(int age){
        if (age <0 || age > 200){
            this.age = 0;
            return;
        }
            this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}