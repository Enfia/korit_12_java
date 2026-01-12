package ch11_arrays;

import java.util.Arrays;
import java.util.Scanner;

// 쉬움
public class Array03Method {

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
