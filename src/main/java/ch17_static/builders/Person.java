package ch17_static.builders;


// 확인하기
public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;

        public Builder name(String name){
            this.name = name;
            return this; // Builder 클래스의 객체가 리턴됨
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}


