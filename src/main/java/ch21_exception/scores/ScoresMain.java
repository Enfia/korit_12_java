package ch21_exception.scores;

import java.util.Scanner;

public class ScoresMain {
    public static void checkScore(int score)throws InvalidScoreException{
        if(score < 0 || score > 100){
            throw new InvalidScoreException("점수는 0~100점 사이여야 합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요 >>> ");
        try{
            int score = sc.nextInt();
            checkScore(score);
        }catch (InvalidScoreException e){
            System.out.println("점수 입력 오류 : "+ e.getMessage());
        }
    }
}
