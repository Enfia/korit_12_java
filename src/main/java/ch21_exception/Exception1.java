package ch21_exception;

import java.util.List;
import java.util.Scanner;

/*
    예외(Exception)란?
    - 개발자가 예측 가능, 그에 대비할 수 있는 것들을 예외라고 함
    오류란?
    - 개발자가 예측할 수 있지만 해결할 수 없거나 / 예측 불가능한 것을 오류라고 함
    예외 클래스들은 이미 개발자들이 정의 해둠
 */
public class Exception1 {
    public static void main(String[] args) {
//        int[] ints = new int[5];
//        ints[5] = 3;
//        int a = 10;  // 나누어지는 수
//        int b = 0; // 나누는 수
//        double result = a/ b;
//        System.out.println(result);
//        int c = 0.123;
//        System.out.println(c);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("나누어지는 수를 입력하세요 >>> ");
//        int a = sc.nextInt();
//        System.out.print("\n나누는 수를 입력하세요 >>> ");
//        int b = sc.nextInt();
//        if (b == 0){
//            System.out.println("나눌 수 없습니다.");
//        }else{
//            int result = a/b;
//            System.out.println(result);
//        }
        // 예외와 관련된 클래스를 사용하지 않는 예시
        /*
            예외 처리를 적용한 방식의 코딩 try / catch / finally
         */
//        int a = 10;
//        int b = 0;
//        try{
//            int result = a/b;
//            System.out.println("결과 : "+ result);
//        } catch (ArithmeticException e){
//            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
//        } finally {
//            System.out.println("예외가 발생해도 끝에 실행됨");
//        }
        /*
            왜 예외 처리를 하는가?
            - 에러 뜨면 기분 나쁘기 때문에 예외처리를 해야함
            - 프로그램이 정상 종료됨을 보증하기 위함
         */
        List<Integer> nums = List.of(1,2,3,4,5);
//        System.out.println(nums);
        try {
            int result = nums.get(5);
            System.out.println("결과 : " + result);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){  // 예외도 서로 상속 처리가 됨
            // 가장 상위의 예외 관련 클래스임
            throw new RuntimeException(e);
        } finally {
            System.out.println("프로그램 정상 종료");
        }

    }
}
/*
    이상의 코드에서 중요한 점은 catch문이 복수로 나올 수 있다는 점
    예를 들어 catch()를 사용할 때 순서를 고려할 필요가 있음
    leapYear 관련할 때 가장 촘촘한 조건을 앞에 위치시킴
 */