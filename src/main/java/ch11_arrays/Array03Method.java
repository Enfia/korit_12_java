package ch11_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03Method {
// 복습하기
// inputNum() 메서드를 정의해서 배열의 한계값들을 입력 받는 메서드를 구현하고
// inputNames()에서 한계값 설정하는 부분을 다 분리한 후에
// 동일한 실행 예가 나올 수 있도록 개조하시오.
// 그 경우 method overloading을 통해 inputScores에 String[]이 매개변수인 경우와
// int num이 매개변수인 경우로 나누어 inputScores()의 매개변수가 무엇이냐에 따라 이름학생의 점수를 입력하시오 >>> 가 나오거나
// n 번째 학생의 점수를 입력하세요 >>> 가 나올 수 있도록 하시오.

    private String[] inputNames(){
        Scanner sc = new Scanner(System.in);
        int a = inputNum();

        String[] names;
        names = new String[a];

        for (int i = 0; i < names.length; i++){
            System.out.println((i + 1) + "번 째 학생의 이름을 입력하세요 >>>");
            names[i] = sc.nextLine();
        }
        return names;
    }

    private int inputNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 명의 학생을 입력하시겠습니까? >>>");
        int num = sc.nextInt();
        return num;
    }
    private  double[] inputScores(String[] names){
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[names.length];
        for (int i = 0; i < scores.length; i++){
            System.out.println(names[i] + "학생의 점수를 입력하세요 >>> ");
            scores[i] = sc.nextDouble();
        }
        return scores;
    }
    private double[] inputScores(int num) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[num];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번째 학생의 점수를 입력하세요 >>>");
            scores[i] = sc.nextDouble();
        }
        return scores;
    }

    public void writeNameAndScore(){
        String[] names = inputNames();
        double[] scores = inputScores(names);
        System.out.println("학생들의 점수 총합은 "+Arrays.stream(scores).sum() + "점입니다.");
        System.out.println("학생들의 점수 평균은 "+Arrays.stream(scores).average().getAsDouble() + "점입니다.");
    }



    public static void main(String[] args) {
        Array03Method arrays03Method = new Array03Method();
        arrays03Method.writeNameAndScore();
    }
}
