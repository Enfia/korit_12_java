package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

// 쉬움
public class Array11 {
    public static void main(String[] args) {
        // 10부터 100까지의 범위(10단위)로 만들기
        // 배열 선언, 객체 만들기
        Integer[] numbers = new Integer[10];

        // static 함수가 아니기 때문에 객체를 생성해서 rd.함수명을 사용함
        Random rd = new Random();

        //랜덤 변수 담기
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rd.nextInt(10) + 1;
            numbers[i] *= 10;
        }

        // 오름 차순
        Arrays.sort(numbers);
        System.out.println("오름 차순 : "+Arrays.toString(numbers));

        // 내림 차순
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println("내림 차순 : " + Arrays.toString(numbers));

        // 10 곱하기
        for (Integer number : numbers){
            System.out.print((number)+ " / ");
        }
    }
}
