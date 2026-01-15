package ch21_exception.conveni;

import ch21_exception.scores.InvalidScoreException;

import java.util.Scanner;

public class ConveniMain{
    public static void order(int quantity)throws InvalidOrderQuantityException {
        if(quantity < 1 || quantity > 50){
            throw new InvalidOrderQuantityException("수량이 1 미만이거나 50을 초과는 불가능합니다");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수량을 입력하세요 >>> ");
        try{
            int quantity = sc.nextInt();
            order(quantity);
        }catch (InvalidOrderQuantityException e){
            System.out.println("오류 메세지 : "+ e.getMessage());
        } finally {
            System.out.println("프로세스 종료");
        }
    }
}
