package ch21_exception.signup;

import java.util.Scanner;

public class SignUpMain {
    public static void checkId(String id) throws InvalidIdException{
        if(id.length() < 8){
            throw new InvalidIdException("아이디는 8자 이상이어야 합니다.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요 >>> ");
        try{
            String id = sc.nextLine().replace(" ", "");
            checkId(id);
            System.out.println("현재 아이디 : " + id);
        } catch (InvalidIdException e) {
            System.out.println("메시지 : " + e.getMessage());
        }
    }
}
