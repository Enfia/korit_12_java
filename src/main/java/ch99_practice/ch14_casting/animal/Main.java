package ch99_practice.ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("개", 12, "불독", true);
        dog1.showInfo();
        /*
            왜 자식 클래스의 메서드가 실행되는지 주석으로 설명할 것
            타입을 부모로 하였지만 객체를 자식으로 만들었기 때문에
         */
        Dog dog2 = (Dog) dog1;
        dog2.run();
        /*
            객체 타입 확인을 하지 않을 경우 발생할 수 있는 문제를 주석으로 설명할 것
            객체 타입을 확인하지 않으면 자식에 있는 메서드를 쓰고 싶은데 못 쓸 수도 있음
         */
        Animal animal1 = new Animal("고양이", 13);
        /*
            왜 해당 객체는 다운캐스팅이 불가능한지 주석으로 설명할 것
            불가능한 이유는 타입을 부모로하고 객체를 자식으로는 가능하지만
            자식을 타입으로 하고 부모를 객체로 하는것은 불가능하기 때문에
         */
    }
}
