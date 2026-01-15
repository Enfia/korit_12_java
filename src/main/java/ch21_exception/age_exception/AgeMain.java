package ch21_exception.age_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    예외 클래스는 메서드를 호출했을 때 예외 처리해야 하기 때문에 특정 예외를 참조한다는 것을 명시가 필수임
 */
public class AgeMain {
    public static void checkAge(int age)throws InvalidAgeException{
        if ( age < 0 || age > 200){
            throw new InvalidAgeException("나이는 0 ~ 200 사이의 정수만 가능합니다.");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요 >>> ");
//        int age = sc.nextInt();
        try{
            int age = sc.nextInt();
            checkAge(age); // throw임
        } catch (InvalidAgeException e){
            System.out.println("나이 입력 오류 : "+ e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
