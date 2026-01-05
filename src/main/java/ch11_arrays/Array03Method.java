package ch11_arrays;

import java.util.Scanner;

public class Array03Method {
    public void writeNameAndScore(){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int count = sc.nextInt();
        sc.nextLine();
        String[] humans = new String[count];

        for(int i = 0; i< humans.length; i++){
            System.out.println((i + 1)+"번 학생의 이름을 입력해주세요 >>>");
            humans[i] = sc.nextLine();
        }

        double[] score = new double[count];
        double scoreSum = 0;

        for(int i = 0; i<humans.length; i++){
            System.out.println(humans[i] +" 학생의 점수를 입력해주세요 >>>");
            score[i] = sc.nextDouble();
            sc.nextLine();
            scoreSum += score[i];
        }
        System.out.println( "학생들 점수의 평균은 " + scoreSum/count);
    }
}
