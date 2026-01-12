package ch18_generic.bmi;

import ch14_casting.animal.Dog;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("김일", 169, 64);
        Bmi bmi1 = new Bmi();
        bmi1.printResult(person);

    }
}
