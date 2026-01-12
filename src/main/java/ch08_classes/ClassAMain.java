package ch08_classes;

import java.util.Scanner;

// 쉬움
public class ClassAMain {
    public static void main(String[] args) {
        ClassA classA1 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.5;
        System.out.println(classA1.name + " 학생의 학번은 " + classA1.num + " 번 이고, 점수는 " + classA1.score + "점입니다.");
        classA1.callName();
        ClassA classA2 = new ClassA();
        classA2.name = "김이";
        classA2.score = 2;
        classA2.num = 100;

        System.out.println(classA2.num + " 번 학생의 이름은 " + classA2.name + "이고, 점수는 " + classA2.score + "입니다.");
        classA2.name = "김삼"; // 재대입함

        classA2.callName();


    }
}
