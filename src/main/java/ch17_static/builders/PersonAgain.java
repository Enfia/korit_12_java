package ch17_static.builders;

public class PersonAgain {
    private String name;
    private int age;
    private String address;

    private PersonAgain (Builder builder){
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
            return this;
        }
        public Builder age(int name){
            this.age = name;
            return this;
        }
        public Builder address(String name){
            this.address = name;
            return this;
        }
        public PersonAgain builder(){
            return new PersonAgain(this);
        }
    }
}
