package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Array10PrintArray {
    public static void main(String[] args) {

//        Random rd = new Random();
//        Scanner sc = new Scanner(System.in);
//
//        int num1 = rd.nextInt(); // 랜덤 숫자를 입력 받음

//        System.out.println("숫자를 입력하세요 >>> ");
//        int num2 = sc.nextInt(); // 숫자를 입력 받음
//
//        System.out.println(num1); //랜덤 숫자 출력
//        System.out.println(num2); //입력한 숫자를 출력
        // ^ 이해 안됨 -> 이해됨 ^

//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.asList(numbers).toString());
        Integer[] nums = {3,6,7,1,9,2,10,5,4,8};
        Arrays.sort(nums);
        System.out.println("오름 차순 정렬 : "+ Arrays.toString(nums));

        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("내림 차순 정렬 : " + Arrays.toString(nums));

    }
}
