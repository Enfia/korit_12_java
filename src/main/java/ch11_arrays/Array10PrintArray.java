package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;

// 쉬움
public class Array10PrintArray {
    public static void main(String[] args) {

        // Integer는 객체라 null 가능, int는 기본 자료형이라 null 불가능
        Integer[] nums = {3,6,7,1,9,2,10,5,4,8};

        // 오름 차순인데
        // Arrays.sort()는 static 메서드라 객체 생성 없이 사용 가능
        // 매개변수로 정렬할 배열을 받음
        Arrays.sort(nums);
        System.out.println("오름 차순 정렬 : "+ Arrays.toString(nums)); // toString은 객체를 매개변수로 받는 함수임

        // 내림 차순인데
        // Comparator.reverseOrder()는 Comparator 객체를 반환하는 static 메서드
        // Arrays.sort(배열, 정렬기준) 형태로 사용
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println("내림 차순 정렬 : " + Arrays.toString(nums)); // toString은 객체를 매개변수로 받는 함수임

        // 여기서 알 수 있는점이 main 함수는 String[] 배열 하나를 매개변수로 받는 함수임
        // static 함수라서 객체 생성 안해도 됨
    }
}
